/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dao.DvdDao;
import dao.DvdDaoException;
import dto.DvD;
import java.util.List;
import ui.DvdView;
import ui.UserIO;
import ui.UserIOConsoleImpl;

/**
 *
 * @author xwang2945
 */
public class DvdController {
    
    private UserIO io = new UserIOConsoleImpl();
    
    private DvdView view;
    private DvdDao dao;

    public DvdController(DvdDao myDao, DvdView myView) {
        this.dao = myDao;
        this.view = myView;
    }
    
    
    public void run(){
            boolean keepGoing = true;
            int menuSelection = 0;
            try {
                while (keepGoing) {

                    menuSelection = getMenuSelection();

                    switch (menuSelection) {
                        case 1:
                            listDvds();
                            break;
                        case 2:
                            createDvd();
                            break;
                        case 3:
                            viewDvd();
                            break;
                        case 4:
                            removeDvd();
                            break;
                        case 5:
                            editDvd();
                            break;
                        case 6:
                            keepGoing = false;
                            break;
                            
                        default:
                            unknownCommand();
                    }

                }
                exitMessage();
            } catch (DvdDaoException e) {
                view.displayErrorMessage(e.getMessage());
            }
            }
    
    
    private int getMenuSelection() { //all function in controller are private because only called in here
        return view.printMenuAndGetSelection();
    }
    
    
    private void unknownCommand() {
        view.displayUnknownCommandBanner();
    }

    private void exitMessage() {
        view.displayExitBanner();
    }
    
    private void listDvds() throws DvdDaoException{
        List<DvD> DvdList = dao.getAllDvd();
        view.displayStudentList(DvdList);
    }
    
    private void createDvd() throws DvdDaoException {
        //view.displayCreateStudentBanner();
        DvD newStudent = view.getNewDvdInfo();
        dao.addDvd(newStudent.getTitle(), newStudent);
        view.displayCreateSuccessBanner();
    }
    
    private void viewDvd() throws DvdDaoException {
        //view.displayDisplayStudentBanner();
        String studentId = view.getDvdChoice();
        DvD student = dao.getDvd(studentId);
        view.displayStudent(student);
    }
    
    
    private void removeDvd() throws DvdDaoException {
        //view.displayRemoveStudentBanner();
        String studentId = view.getDvdChoice();
        DvD removedStudent = dao.removeDvd(studentId);
        view.displayRemoveResult(removedStudent);
    }
    private void editDvd() throws DvdDaoException{
        /**
         * Adding in a dvd and removing a existing one. if remove success, edit is sucess.
         * 
         */
        
        String studentId = view.getDvdChoice();
        view.displayEditBanner(studentId);
        DvD newDvd = view.getNewDvdInfo();
        DvD removedStudent = dao.removeDvd(studentId);
        if(removedStudent==null){
            dao.removeDvd(newDvd.getTitle());
        }
        view.displayChangeResult(removedStudent);
        
    }
   
    
}
