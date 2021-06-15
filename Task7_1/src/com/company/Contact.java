package com.company;

public abstract class Contact {

    public Contact() {
    }

    public abstract String getPersonalData();
    public abstract String getPhone();

    public void printContactData(){
        System.out.println(getPersonalData() + " " + getPhone());
    }
}
