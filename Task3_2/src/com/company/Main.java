package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Book book1 = new Book("Дневник Анны Франк", "Анна Франк", 9910, 100);
        Book book2 = new Book("Думай и богатей", "Наполеон Хилл", 9911, 90);
        Book book3 = new Book("Унесенные ветром", "Маргарет Митчелл", 9921, 95);
        Book book4 = new Book("Сумерки. Сага", "Стефани Майер", 9922, 120);
        Book book5 = new Book("Код да Винчи", "Дэн Браун", 9930, 110);
        Book book6 = new Book("Алхимик", "Пауло Коэльо", 9933, 100);
        Book book7 = new Book("Властелин колец", "Дж. Р. Р. Толкин", 9944, 150);
        Book book8 = new Book("Гарри Поттер", "Джоан Роулинг", 9955, 130);
        Book book9 = new Book("Цитаты Мао Цзэдун", "Мао Цзэдун", 9905, 85);
        Book book10 = new Book("Библия", "NoName", 9900, 70);

        Library library1 = new Library("Библиотека Конгресса", "Вашингтон");
        Library library2 = new Library("Британская библиотека", "Лондон");
        library1.addBook(book1);
        library1.addBook(book2);
        library1.addBook(book3);
        library1.addBook(book4);
        library2.addBook(book5);
        library2.addBook(book6);
        library2.addBook(book7);
        library2.addBook(book8);
        library2.addBook(book9);
        library2.addBook(book10);
        System.out.println(library1.size());
        for(int i = 0;i < library1.size();i++){
            System.out.println(library1.getBook(i));
        }
        System.out.println(library1.priceSum());
    }
}
