package com.company;

public class CPU {
    public int cashMemory;
    public int price;
    public int weight;

    public CPU() {
    }

    public CPU(int cashMemory, int price, int weight) {
        this.cashMemory = cashMemory;
        this.price = price;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return cashMemory + " " + price + " " + weight;
    }
}
