package com.company;

public class Library {
    private String name;
    private String city;
    private String country;
    private Book[] books;
    private int sizeOfBooks;

    public Library() {
    }

    public Library(String name, String city, String country, Book[] books) {
        this.name = name;
        this.city = city;
        this.country = country;
        this.books = books;
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

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public void addBook(Book b){
        sizeOfBooks = books.length;
        books[sizeOfBooks] = b;
        sizeOfBooks++;
    }

    public void printLibraryData(){
        System.out.println("Name: " + getName() + " City: " + getCity() + " Country: " + getCountry());
        System.out.println("-------------------------------------------");
        for(int i = 0;i < books.length;i++){
            System.out.println(books[i].getBookData());
        }
        System.out.println("-------------------------------------------");
    }

    public void searchByName(String nameOfBook){
        for(int i = 0;i < books.length;i++){
            if(nameOfBook.equals(books[i].getName())){
                System.out.println(books[i].getBookData());
            }
        }
    }

    public void searchByCode(String codeOfBook){
        for(int i = 0;i < books.length;i++){
            if(codeOfBook.equals(books[i].getCode())){
                System.out.println(books[i].getBookData());
            }
        }
    }

    public void searchByDistance(int min, int max){
        for(int i = 0;i < books.length;i++){
            if(min <= books[i].getPages() && books[i].getPages() <= max){
                System.out.println(books[i].getBookData());
            }
        }
    }
}
