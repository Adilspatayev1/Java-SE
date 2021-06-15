package com.company;

import java.util.ArrayList;

public class SamsungApplication implements PhoneApplication{

    private String name;
    private ArrayList<Contact> allContacts = new ArrayList<>();

    public SamsungApplication(String name) {
        this.name = name;
    }

    @Override
    public void addContact(Contact c) {
        allContacts.add(c);
    }

    @Override
    public void printContacts() {
        System.out.println(name);
        for(int i = 0;i < allContacts.size();i++){
            allContacts.get(i).printContactData();
        }
    }
}
