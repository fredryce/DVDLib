/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sgprojects.dvdlib;

import controller.DvdController;
import dao.DvdDao;
import ui.DvdView;
import ui.UserIO;
import ui.UserIOConsoleImpl;

/**
 *
 * @author xwang2945
 */
public class App {
    public static void main(String[] args) {
        UserIO myIo = new UserIOConsoleImpl();
        DvdView myView = new DvdView(myIo);
        DvdDao myDao = new DvdDao();
        DvdController controller = new DvdController(myDao, myView);
        controller.run();
    }
    
}
