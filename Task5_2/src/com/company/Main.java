package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in  = new Scanner(System.in);

        ScientificBook book1 = new ScientificBook("Mathematical Statistics", "#999", 1000, 200, "IITU");
        ScientificBook book2 = new ScientificBook("Introduction_to_Data_Science", "#123", 400, 250, "KBTU");
        ScientificBook book3 = new ScientificBook("Computer networks", "#224", 350, 220, "KIMEP");
        LiteratureBook book4 = new LiteratureBook("Anna Karenina", "#111", 400, "Leo Tolstoy", 1935);
        LiteratureBook book5 = new LiteratureBook("To Kill a Mockingbird", "#001", 600, "Harper Lee", 1960);

        Book[] books = {book1, book2, book3, book4, book5};

        Library l1 = new Library("Библеотека #1", "Almaty", "Kazakhstan", books);
        l1.printLibraryData();

        boolean b = true;
        while (b){
            System.out.println("PRESS [1] TO SEARCH BOOK BY NAME");
            System.out.println("PRESS [2] TO SEARCH BOOK BY CODE");
            System.out.println("PRESS [3] TO SEARCH BOOK BY PAGES AMOUNT\n");
            System.out.println("PRESS [0] TO EXIT");
            int choice = in.nextInt();
            switch (choice){
                case 1:
                    System.out.print("Insert name: ");String name = in.next();
                    l1.searchByName(name);
                    break;
                case 2:
                    System.out.print("Insert code(write like: #123): "); String code = in.next();
                    l1.searchByCode(code);
                    break;
                case 3:
                    System.out.print("Insert pages from: "); int page1 = in.nextInt();
                    System.out.print("Insert pages to: "); int page2 = in.nextInt();
                    l1.searchByDistance(page1, page2);
                    break;
                case 0:
                    b = false;
                    break;
            }
        }
    }
}
