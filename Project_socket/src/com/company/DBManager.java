package com.company;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class DBManager {
    private Connection connection;

    public void connect(){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/itml?serverTimezone=UTC", "root", "");
        } catch (Exception e){
            e.printStackTrace();
        }
    }

    public void addStudent(Student student){
        try {
            PreparedStatement statement = connection.prepareStatement("INSERT INTO `Students`(`id`, `name`, `surname`, `faculty`, `groups`) VALUES (NULL, ?, ?, ?, ?)");
            statement.setString(1, student.getName());
            statement.setString(2, student.getSurname());
            statement.setString(3, student.getFaculty());
            statement.setString(4, student.getGroup());

            statement.executeUpdate();

            statement.close();
        } catch (Exception e){
            e.printStackTrace();
        }
    }

    public ArrayList<Student> getAllStudents(){
        ArrayList<Student> students = new ArrayList<>();
        try {
            PreparedStatement statement = connection.prepareStatement("SELECT * FROM `Students`");
            ResultSet resultSet = statement.executeQuery();

            while (resultSet.next()){
                Integer id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                String surname = resultSet.getString("surname");
                String faculty = resultSet.getString("faculty");
                String group = resultSet.getString("groups");

                students.add(new Student(id, name, surname, faculty, group));
            }
            statement.close();
        } catch (Exception e){
            e.printStackTrace();
        }
        return students;
    }
}
