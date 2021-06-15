package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainMenu extends Container {
    private JButton addButton;
    private JButton listButton;
    private JButton exitButton;

    public MainMenu() {
        setSize(500,400);
        setLayout(null);

        //Add button
        addButton = new JButton("ADD");
        addButton.setBounds(100, 80, 300, 30);
        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //Open add window
                Main.frame.addMenu.setVisible(true);
                //Close main window
                Main.frame.mainMenu.setVisible(false);
            }
        });
        add(addButton);

        //List button
        listButton = new JButton("LIST");
        listButton.setBounds(100, 120, 300, 30);
        listButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //Open list window
                Main.frame.listMenu.setVisible(true);
                //Close main window
                Main.frame.mainMenu.setVisible(false);
            }
        });
        add(listButton);

        //Exit button
        exitButton = new JButton("EXIT");
        exitButton.setBounds(100, 160, 300, 30);
        exitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        add(exitButton);
    }
}
