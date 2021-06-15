package com.company;

public class Player {
    public int number;
    public String name;
    public String surname;
    public String position;

    public Player() {
    }

    public Player(int number, String name, String surname, String position) {
        this.number = number;
        this.name = name;
        this.surname = surname;
        this.position = position;
    }

    @Override
    public String toString() {
        return number + " " + name + " " + surname + " " + position;
    }
}
