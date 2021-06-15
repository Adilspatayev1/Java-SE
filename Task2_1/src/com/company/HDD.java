package com.company;

public class HDD {
    public int memory;
    public int price;
    public int weight;

    public HDD() {
    }

    public HDD(int memory, int price, int weight) {
        this.memory = memory;
        this.price = price;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return memory + " " + price + " " + weight;
    }
}
