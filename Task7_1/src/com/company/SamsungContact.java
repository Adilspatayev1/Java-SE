package com.company;

import java.util.ArrayList;

public class SamsungContact extends Contact {
    private int id;
    private String fullName;
    private ArrayList<String> phones = new ArrayList<>();

    public SamsungContact(int id, String fullName, ArrayList<String> phones) {
        this.id = id;
        this.fullName = fullName;
        this.phones = phones;
    }

    public SamsungContact() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public ArrayList<String> getPhones() {
        return phones;
    }

    public void setPhones(ArrayList<String> phones) {
        this.phones = phones;
    }

    @Override
    public String getPersonalData() {
        return getId() + " " + getFullName();
    }

    @Override
    public String getPhone() {
        String s = "";
        for(int i = 0;i < getPhones().size();i++){
            s += getPhones().get(i) + " ";
        }
        return s;
    }
}
