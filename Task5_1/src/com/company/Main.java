package com.company;

import java.util.Scanner;

public class Main {

    static int sizeOfUsers = 0;
    static User[]users = new User[10];

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        User user1 = new User(1, "adil", "adilbek", "adil", "spatayev");
        User user2 = new User(2, "abai", "ibragim", "abai", "kunanbay");
        User user3 = new User(3, "maga", "zhumabay", "magzhan", "zhumabay");

        String[] subjects1 = {"math", "kazakh"};
        String[] subjects2 = {"rus", "history"};
        String[] subjects3 = {"ph-y", "python"};

        String[] courses1 = {"python", "sql"};
        String[] courses2 = {"math", "rus"};
        String[] courses3 = {"web", "social"};

        Staff staff1 = new Staff(4, "bay", "baitursyn", "akhmet", "baitursynov", 12000, subjects1);
        Staff staff2 = new Staff(5, "ali", "bokeykhan", "alikhan", "bokeykhan", 10000, subjects2);
        Staff staff3 = new Staff(6, "nur", "sultan", "nursultan", "nazarbayev", 15000, subjects3);
        Student student1 = new Student(7, "aida", "tula", "aida", "tulegenova", 3.30, courses1);
        Student student2 = new Student(8, "dan", "danbro", "daniyal", "zhexsenov", 3.5, courses2);
        Student student3 = new Student(9, "rafa", "toi", "rafael", "toizhanov", 3.8, courses3);



        boolean b = true;
        while (b){
            System.out.println("PRESS [1] ADD USER");
            System.out.println("PRESS [2] TO LIST USERS\n");
            System.out.println("PRESS [0] TO EXIT");
            int choice1 = in.nextInt();
            switch (choice1){
                case 1:
                    System.out.println("PRESS [1] TO ADD STUDENT");
                    System.out.println("PRESS [2] TO ADD STAFF");
                    int choice2 = in.nextInt();
                    switch (choice2){
                        case 1:
                            System.out.print("Insert login: "); String login = in.next();
                            System.out.print("Insert password: "); String password = in.next();
                            System.out.print("Insert name: "); String name = in.next();
                            System.out.print("Insert surname: "); String surname = in.next();
                            System.out.print("Insert gpa: "); double gpa = in.nextDouble();
                            System.out.println("You can add only 2 courses");
                            String[] course = new String[2];
                            for(int i = 0;i < 2;i++){
                                System.out.print("Enter course: "); course[i] = in.next();
                            }
                            Student student = new Student(0, login, password, name, surname, gpa, course);
                            addUser(student);
                            break;
                        case 2:
                            System.out.print("Insert login: "); String login1 = in.next();
                            System.out.print("Insert password: "); String password1 = in.next();
                            System.out.print("Insert name: "); String name1 = in.next();
                            System.out.print("Insert surname: "); String surname1 = in.next();
                            System.out.print("Insert salary: "); double salary = in.nextDouble();
                            System.out.println("You can add only 2 subjects");
                            String[] subject = new String[2];
                            for(int i = 0;i < subject.length;i++){
                                System.out.print("Enter subject: "); subject[i] = in.next();
                            }
                            Staff staff = new Staff(0, login1, password1, name1, surname1, salary, subject);
                            addUser(staff);
                            break;
                    }
                    break;
                case 2:
                    System.out.println("PRESS [1] TO LIST STUDENTS");
                    System.out.println("PRESS [2] TO LIST STAFF");
                    int choice3 = in.nextInt();
                    switch (choice3){
                        case 1:
                            for(int i = 0;i < users.length;i++){
                                if(users[i] instanceof Student){
                                    System.out.println(users[i].getData());
                                }
                            }
                            break;
                        case 2:
                            for(int i = 0;i < users.length;i++){
                                if(users[i] instanceof Staff){
                                    System.out.println(users[i].getData());
                                }
                            }
                            break;
                    }
                    break;
                case 0:
                    b = false;
                    break;
            }
        }
    }

    public static void addUser(User user){
        user.setId(sizeOfUsers);
        users[sizeOfUsers] = user;
        sizeOfUsers++;
    }
}
