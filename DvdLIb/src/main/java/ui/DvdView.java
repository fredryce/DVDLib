/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;

import dao.DvdDaoException;
import dto.DvD;
import java.util.List;

/**
 *
 * @author xwang2945
 */
public class DvdView {
    
   
    private UserIO io;
    
    public DvdView(UserIO io) {
        this.io = io;
    }
    
    public int printMenuAndGetSelection() {
        io.print("Main Menu");
        io.print("1. List DVD");
        io.print("2. Add New DVD");
        io.print("3. View a DVD");
        io.print("4. Remove a DVD");
        io.print("5. Edit a DVD");
        //io.print("6. Load Dvd Library");
        //io.print("7. Save Dvd Library");
        
        
        io.print("6. Exit");

        return io.readInt("Please select from the above choices.", 1, 6);
    }
    
    
    public void displayExitBanner() {
    io.print("Good Bye!!!");
}

    public void displayUnknownCommandBanner() {
        io.print("Unknown Command!!!");
    }
    public void displayErrorMessage(String errorMsg) {
        io.print("=== ERROR ===");
        io.print(errorMsg);
    }
    
    public void displayStudentList(List<DvD> studentList) {
    for (DvD currentStudent : studentList) {
        String studentInfo = String.format("#%s : %s %s %s %s %s",
              currentStudent.getTitle(),
              currentStudent.getReleaseDate(),
              currentStudent.getMpaaRating(),
              currentStudent.getDirector(),
              currentStudent.getStudio(),
              currentStudent.getUsernote());
        io.print(studentInfo);
    }
    io.readString("Please hit enter to continue.");
}
    
    
     public DvD getNewDvdInfo() {
        String title = io.readString("Please enter Title");
        String release = io.readString("Please enter Release Date");
        String mparating = io.readString("Please enter MPA Ratin");
        String director = io.readString("Please enter Director Name");
        String studio = io.readString("Please enter Studio");
        String userrating = io.readString("Please enter User Rating");
        DvD currentStudent = new DvD(title);
        
        
        currentStudent.setReleaseDate(release);
        currentStudent.setMpaaRating(mparating);
        currentStudent.setDirector(director);
        currentStudent.setStudio(studio);
        currentStudent.setUsernote(userrating);
        
        return currentStudent;
}
     
     
     
    public void displayCreateSuccessBanner() {
    io.readString(
            "Dvd successfully added.  Please hit enter to continue");
    }
    
    
    public String getDvdChoice() {
        return io.readString("Please enter the Dvd Title.");
    }
    
    public void displayStudent(DvD student) {
    if (student != null) {
        io.print(student.getTitle());
        io.print(student.getReleaseDate());
        io.print(student.getMpaaRating());
        io.print(student.getDirector());
        io.print(student.getStudio());    
        io.print(student.getUsernote());
        io.print("");
    } else {
        io.print("No such Dvd.");
    }
    io.readString("Please hit enter to continue.");
   
}
    
    
    public void displayRemoveResult(DvD studentRecord) {
        if(studentRecord != null){
          io.print("DVD successfully removed.");
        }else{
          io.print("No such DVD.");
        }
        io.readString("Please hit enter to continue.");
    }
    
    public void displayEditBanner(String title){
        io.print("Editing Dvd: " + title);
    }
    public void displayChangeResult(DvD studentRecord){
        
        if(studentRecord != null){
          io.print("DVD successfully edit.");
        }else{
          io.print("No such DVD to make changes to.");
        }
        io.readString("Please hit enter to continue.");
        
        
    }
    
    
    
}
