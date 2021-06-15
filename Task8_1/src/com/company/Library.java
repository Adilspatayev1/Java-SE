package com.company;

import java.util.ArrayList;
import java.util.Arrays;

public class Library {
    private String name;
    private String city;
    private Book[] books = new Book[5];
    private int index = 0;

    public Library(String name, String city) {
        this.name = name;
        this.city = city;
    }

    public Library() {
    }

    public void addBook(Book b) throws BookIsFull{
        if(index < 5){
            books[index] = b;
            index++;
        } else {
            throw new BookIsFull();
        }
    }

    public void printLibrary() throws BookIsEmpty{
        for(int i = 0;i < index;i++) {
            if (books[i] != null) {
                System.out.println(books[i].toString());
            } else {
                throw new BookIsEmpty();
            }
        }
    }

    @Override
    public String toString() {
        return name + " " + city + " " + Arrays.toString(books);
    }
}
