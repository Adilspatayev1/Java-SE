package com.company;

public class Staff extends User {
    public double salary;
    public String []subjects;

    public Staff() {
    }

    public Staff(int id, String login, String password, String name, String surname, double salary, String[] subjects) {
        super(id, login, password, name, surname);
        this.salary = salary;
        this.subjects = subjects;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String[] getSubjects() {
        return subjects;
    }

    public void setSubjects(String[] subjects) {
        this.subjects = subjects;
    }

    @Override
    public String getData() {
        String s = super.getData() + " " + getSalary();
        for(int i = 0;i < subjects.length;i++){
            s += subjects[i];
        }
        return s;
    }
}
