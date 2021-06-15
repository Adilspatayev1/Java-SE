package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<String> phones = new ArrayList<>();
        phones.add("s20");
        phones.add("s21");
        phones.add("note 10");
        SamsungContact s1 = new SamsungContact(1, "Adil", phones);
        IPhoneContact i1 = new IPhoneContact(2, "Aida", "iphone 6", "iphone 7", "iphone 11");

        IPhoneApplication apple = new IPhoneApplication("apple");
        apple.addContact(i1);
        SamsungApplication samsung = new SamsungApplication("samsung");
        samsung.addContact(s1);

        apple.printContacts();
        samsung.printContacts();
    }
}
