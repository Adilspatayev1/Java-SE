package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Engine engine1 = new Engine("G7", 4, 3.0, 100);
        Engine engine2 = new Engine("A5", 6, 3.5, 140);
        Car car1 = new Car("Audi", "A6", 250, 400, engine2);
        Car car2 = new Car("Chevrolet", "g8", 230, 380, engine1);

        System.out.println(car1 + "\nTotal weight: " + car1.totalWeight());
        System.out.println(car2 + "\nTotal weight: " + car2.totalWeight());

        Car[] cars = {car1, car2};
        int total = 0;
        for(int i = 0;i < cars.length;i++){
            total += cars[i].totalWeight();
        }
        System.out.println(total);
    }
}
