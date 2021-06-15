package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        CPU cpu1 = new CPU(16, 2000, 10);
        CPU cpu2 = new CPU(16, 1500, 8);

        HDD hdd1 = new HDD(1000, 3000, 15);
        HDD hdd2 = new HDD(500, 2000, 10);

        CPU[] cpus1 = {cpu1, cpu2};
        CPU[] cpus2 = {cpu1, cpu2, cpu1, cpu2};
        CPU[] cpus3 = {cpu2, cpu1, cpu2, cpu2};

        Laptop laptop1 = new Laptop("HP", 50000, 20, hdd1, cpus1);
        Laptop laptop2 = new Laptop("Acer", 55000, 25, hdd1, cpus3);
        Laptop laptop3 = new Laptop("Asus", 60000, 25, hdd2, cpus2);

        System.out.println(laptop1.getTotalPrice());
        System.out.println(laptop2.getTotalCPUMemory());
        System.out.println(laptop3.getTotalWeight());
    }
}
