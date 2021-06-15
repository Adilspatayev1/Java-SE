package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        ERPSystem erpSystem = new ERPSystem();
        boolean b = true;

        while (b){
            System.out.println("PRESS [1] TO ADD USER");
            System.out.println("PRESS [2] TO LIST USERS\n");
            System.out.println("PRESS [0] TO EXIT");
            System.out.print("Your choice: "); int choice = in.nextInt();

            switch (choice){
                case 1:
                    System.out.println("PRESS [1] TO ADD STUDENT");
                    System.out.println("PRESS [2] TO ADD TEACHER");
                    System.out.print("Your choice: "); int choice2 = in.nextInt();

                    switch (choice2){
                        case 1:
                            System.out.print("Login: "); String login = in.next();
                            System.out.print("Password: "); String password = in.next();
                            System.out.print("Name: "); String name = in.next();
                            System.out.print("Surname: "); String surname = in.next();
                            System.out.print("Group: "); String group = in.next();
                            System.out.print("Gpa(enter like: 3,14): "); double gpa = in.nextDouble();
                            Student student = new Student(login, password, name, surname, group, gpa);
                            erpSystem.addUser(student);
                            break;
                        case 2:
                            System.out.print("Login: "); String login1 = in.next();
                            System.out.print("Password: "); String password1 = in.next();
                            System.out.print("Nickname: "); String nick = in.next();
                            System.out.print("Status(Professor, Lecturer, Tutor, Assistant): "); String status = in.next();
                            System.out.print("How many subjects(0-10): "); int count = in.nextInt();
                            String[] subjects = new String[count];
                            for(int i = 0;i < subjects.length;i++){
                                System.out.print("Subject " + i + "enter: "); subjects[i] = in.next();
                            }
                            Teacher teacher = new Teacher(login1, password1, nick, status, subjects);
                            erpSystem.addUser(teacher);
                            break;
                    }
                    break;
                case 2:
                    System.out.println("PRESS [1] TO LIST STUDENTS");
                    System.out.println("PRESS [2] TO LIST TEACHERS");
                    System.out.println("PRESS [3] TO PRINT USER BY INDEX");
                    System.out.print("Your choice: "); int choice3 = in.nextInt();

                    switch (choice3){
                        case 1:
                            erpSystem.printAllStudents();
                            break;
                        case 2:
                            erpSystem.printAllTeachers();
                            break;
                        case 3:
                            System.out.print("Enter index: "); int index = in.nextInt();
                            erpSystem.printUser(index);
                            break;
                    }
                    break;
                case 0:
                    b = false;
                    break;
            }
        }
    }
}
