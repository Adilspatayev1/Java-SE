package com.company;

public class Car {
    public String name;
    public String model;
    public int speed;
    public int weight;
    public Engine engine;

    public Car() {
    }

    public Car(String name, String model, int speed, int weight, Engine engine) {
        this.name = name;
        this.model = model;
        this.speed = speed;
        this.weight = weight;
        this.engine = engine;
    }

    @Override
    public String toString() {
        return name + " " + model + " " + speed + " " + weight + " " + engine.toString() + " ";
    }

    public void ride(){
        System.out.println(toString() + " is ride");
    }

    public int totalWeight(){
        return weight + engine.weight;
    }
}
