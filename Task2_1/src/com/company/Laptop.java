package com.company;

public class Laptop {
    public String name;
    public int price;
    public int weight;
    public HDD hardDiskDriver;
    public CPU[] cpuMemory;

    public Laptop() {
    }

    public Laptop(String name, int price, int weight, HDD hardDiskDriver, CPU[] cpuMemory) {
        this.name = name;
        this.price = price;
        this.weight = weight;
        this.hardDiskDriver = hardDiskDriver;
        this.cpuMemory = cpuMemory;
    }

    public int getTotalWeight(){
        int total = 0;
        for(int i = 0;i < cpuMemory.length;i++){
            total += cpuMemory[i].weight;
        }
        total = total + hardDiskDriver.weight + weight;
        return total;
    }

    public int getTotalCPUMemory(){
        int total = 0;
        for(int i = 0;i < cpuMemory.length;i++){
            total += cpuMemory[i].cashMemory;
        }
        return total;
    }

    public int getTotalPrice(){
        int total = 0;
        for(int i = 0;i < cpuMemory.length;i++){
            total += cpuMemory[i].price;
        }
        total = total + price + hardDiskDriver.price;
        return total;
    }

}
