package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ListMenu extends Container {

    //Button
    private JButton listButton;
    private JButton backButton;

    //Text area
    public static JTextArea area;

    public ListMenu() {
        setSize(500,400);
        setLayout(null);

        area = new JTextArea();
        area.setBounds(90, 50, 300, 150);
        add(area);

        listButton = new JButton("LIST STUDENTS");
        listButton.setBounds(90, 220, 145, 30);
        listButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                PackageData pack = new PackageData("LIST");
                //Метод
                Main.connect(pack);
            }
        });
        add(listButton);

        backButton = new JButton("BACK");
        backButton.setBounds(245, 220, 145, 30);
        backButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //OPEN MAIN
                Main.frame.mainMenu.setVisible(true);
                //CLOSE
                Main.frame.listMenu.setVisible(false);
            }
        });
        add(backButton);
    }
}
