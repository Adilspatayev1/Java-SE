package com.company;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<User> list = getUserList();
        boolean b = true;
        while (b) {
            System.out.println("PRESS [1] TO ADD USERS");
            System.out.println("PRESS [2] TO LIST USERS");
            System.out.println("PRESS [3] TO DELETE USERS");
            System.out.println("PRESS [0] TO EXIT");
            int n = in.nextInt();
            switch (n) {
                case 1:
                    System.out.print("Input ID: ");
                    int id = in.nextInt();
                    System.out.print("Input Login: ");
                    String login = in.next();
                    System.out.print("Input Password: ");
                    String password = in.next();
                    User user = new User(id, login, password);
                    list.add(user);
                    saveUserList(list);
                    break;
                case 2:
                    for(int i = 0;i < list.size();i++){
                        System.out.println((i + 1) + ", user:  " + list.get(i));
                    }
                    break;
                case 3:
                    int index = in.nextInt();
                    if (index >= 0 && index < list.size())
                        list.remove(index - 1);
                    saveUserList(list);
                    break;
                case 0:
                    b = false;
                    break;
            }
        }
    }

    public static void saveUserList(ArrayList<User> users){
        try {
            ObjectOutputStream objectWriter = new ObjectOutputStream(new FileOutputStream("memory.iitu"));
            for(int i = 0;i < users.size();i++) {
                objectWriter.writeObject(users.get(i));
            }
            objectWriter.close();
        } catch (Exception e){
            e.printStackTrace();
        }
    }

    public static ArrayList<User> getUserList(){
        ArrayList<User> users = new ArrayList<>();
        try {
            FileInputStream fileInputStream = new FileInputStream("memory.iitu");
            ObjectInputStream objectReader = new ObjectInputStream(fileInputStream);

            if (fileInputStream.available() > 0) {
                while (fileInputStream.available() > 0){
                    users.add((User)objectReader.readObject());
                }
            }
        } catch (Exception e){
            e.printStackTrace();
        }
        return users;
    }
}
