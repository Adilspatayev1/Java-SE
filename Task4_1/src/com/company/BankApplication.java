package com.company;

public class BankApplication {
    private String name;
    private String country;
    private Worker[] workers = new Worker[100];
    private int sizeOfWorkers = 0;

    public BankApplication() {
    }

    public BankApplication(String name, String country) {
        this.name = name;
        this.country = country;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public Worker[] getWorkers() {
        return workers;
    }

    public void setWorkers(Worker[] workers) {
        this.workers = workers;
    }

    public void addWorker(String name, String surname, String department, int salary){
        workers[sizeOfWorkers] = new Worker(sizeOfWorkers , name, surname, department, salary);
        sizeOfWorkers++;
    }

    public void listWorkers(){
        for(int i = 0;i < sizeOfWorkers;i++){
            System.out.println(getWorkers()[i]);
        }
    }
}
