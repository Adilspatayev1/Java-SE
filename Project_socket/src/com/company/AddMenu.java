package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AddMenu extends Container {
    //Name of box
    private JLabel nameLabel;
    private JLabel surnameLabel;
    private JLabel groupLabel;
    private JLabel facultyLabel;

    //Faculty combo
    private JComboBox facultyCombo;
    private String[] faculties = {"ISCS", "ISNS", "ISHS"};

    //Button
    private JButton addButton;
    private JButton backButton;

    //Text
    private JTextField nameText;
    private JTextField surnameText;
    private JTextField groupText;

    public AddMenu() {
        setSize(500,400);
        setLayout(null);

        //----------------Labels

        nameLabel = new JLabel("NAME:");
        nameLabel.setBounds(90, 60, 80, 30);
        add(nameLabel);

        surnameLabel = new JLabel("SURNAME:");
        surnameLabel.setBounds(90, 100, 80, 30);
        add(surnameLabel);

        facultyLabel = new JLabel("FACULTY:");
        facultyLabel.setBounds(90, 140, 80, 30);
        add(facultyLabel);

        groupLabel = new JLabel("GROUP:");
        groupLabel.setBounds(90, 180, 80, 30);
        add(groupLabel);

        //----------------TextField

        nameText = new JTextField();
        nameText.setBounds(170, 60, 150, 30);
        add(nameText);

        surnameText = new JTextField();
        surnameText.setBounds(170, 100, 150, 30);
        add(surnameText);

        groupText = new JTextField();
        groupText.setBounds(170, 180, 150, 30);
        add(groupText);

        //----------------Combo

        facultyCombo = new JComboBox(faculties);
        facultyCombo.setBounds(170, 140, 150, 30);
        add(facultyCombo);

        //----------------Button

        addButton = new JButton("ADD");
        addButton.setBounds(90, 220, 230, 30);
        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String name = nameText.getText();
                String surname = surnameText.getText();
                String faculty = (String)facultyCombo.getSelectedItem();
                String group = groupText.getText();

                Student student = new Student();
                student.setId(null);
                student.setName(name);
                student.setSurname(surname);
                student.setFaculty(faculty);
                student.setGroup(group);

                PackageData pack = new PackageData("ADD", student);
                //Метод
                Main.connect(pack);

                nameText.setText("");
                surnameText.setText("");
                groupText.setText("");
            }
        });
        add(addButton);

        backButton = new JButton("BACK");
        backButton.setBounds(90, 260, 230, 30);
        backButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //OPEN MAIN
                Main.frame.mainMenu.setVisible(true);
                //CLOSE
                Main.frame.addMenu.setVisible(false);
            }
        });
        add(backButton);

    }
}
