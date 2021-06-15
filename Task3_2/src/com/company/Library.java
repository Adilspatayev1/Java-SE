package com.company;

public class Library {
    private String name;
    private String city;
    private Book []books = new Book[100];
    private int sizeOfBooks = 0;

    public Library() {
    }

    public Library(String name, String city) {
        this.name = name;
        this.city = city;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public Book[] getBooks() {
        return books;
    }

    public void setBooks(Book[] books) {
        this.books = books;
    }

    public int size(){
        int count = 0;
        for(int i = 0;i < books.length;i++){
            if(books[i] == null){
                break;
            } else
                count += 1;
        }
        return count;
    }

    public int priceSum(){
        int total = 0;
        for(int i = 0;i < size();i++){
            total += books[i].getPrice();
        }
        return total;
    }

    public Book getBook(int index){
        Book book = books[index];
        return book;
    }

    public void addBook(Book book){
        books[sizeOfBooks] = book;
        sizeOfBooks++;
    }
}
