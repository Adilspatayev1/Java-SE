package com.company;

import javax.swing.*;

public class MainFrame extends JFrame {
    public static MainMenu mainMenu;
    public static AddMenu addMenu;
    public static ListMenu listMenu;

    public MainFrame(){
        setSize(500, 400);
        setTitle("STUDENT APP");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        mainMenu = new MainMenu();
        setLocation(0, 0);
        add(mainMenu);

        addMenu = new AddMenu();
        setLocation(0, 0);
        addMenu.setVisible(false);
        add(addMenu);

        listMenu = new ListMenu();
        setLocation(0,0);
        listMenu.setVisible(false);
        add(listMenu);
    }
}
