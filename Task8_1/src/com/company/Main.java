package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        Library l1 = new Library("Center", "ALmaty");
        Book book = null;

        try {
            l1.addBook(new Book(1, "Abai", "MA"));
            l1.addBook(new Book(2, "V", "MA"));
            l1.addBook(new Book(3, "Isla", "MA"));
            l1.addBook(book);
        } catch (Exception e){

        }
        System.out.println(l1.toString());
    }
}
