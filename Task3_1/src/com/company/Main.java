package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        User user1 = new User(27805, "Adilbek", "adil", "carry");
        User user2 = new User(28238, "Aida", "aida", "middle");
        User user3 = new User(23335, "Daniyal", "Zhexsenov", "hard");

        ArrayList<User> userArrayList = new ArrayList<>();
        userArrayList.add(user1);
        userArrayList.add(user2);
        userArrayList.add(user3);
        User[] users = {user1, user2, user3};
        boolean b = true;
        while (b){
            System.out.print("INSERT LOGIN: ");
            String login = in.next();
            System.out.print("INSERT PASSWORD: ");
            String password = in.next();
            boolean f = true;
            int index = 0;
            for(int i = 0;i < userArrayList.size();i++){
                if(login.equals(userArrayList.get(i).getName()) && password.equals(userArrayList.get(i).getPassword())){
                    f = true;
                    index = i;
                    break;
                } else {
                    f = false;
                    continue;
                }
            }
            if(f){
                System.out.println("Welcome " + login);
                System.out.println("PRESS [1] TO EDIT LOGIN");
                System.out.println("PRESS [2] TO CHANGE PASSWORD");
                System.out.println("PRESS [3] TO DELETE OWN ACCOUNT");
                System.out.println("PRESS [0] TO EXIT");
                int choice = in.nextInt();
                switch (choice){
                    case 1:
                        System.out.print("Insert login: ");
                        String newLogin = in.next();
                        userArrayList.get(index).setName(newLogin);
                        System.out.println("Login changed");
                        break;
                    case 2:
                        System.out.print("Insert old password: ");
                        String oldPassword = in.next();
                        System.out.print("Insert new password: ");
                        String newPassword = in.next();
                        System.out.print("Re-Insert new password: ");
                        String repPassword = in.next();
                        if(oldPassword.equals(password)) {
                            if (newPassword.equals(repPassword)) {
                                userArrayList.get(index).setPassword(newPassword);
                                System.out.println("Password changed");
                            }
                            else {
                                System.out.println("Invalid Re-Inserted password");
                            }
                        } else {
                            System.out.println("Invalid old password");
                        }
                        break;
                    case 3:
                        userArrayList.remove(index);
                        System.out.println("Account has been deleted");
                        break;
                    case 0:
                        b = false;
                        break;
                }
            }
        }
    }
}
