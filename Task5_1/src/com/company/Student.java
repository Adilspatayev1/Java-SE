package com.company;

public class Student extends User{
    public double gpa;
    public String []courses;

    public Student() {
    }

    public Student(int id, String login, String password, String name, String surname, double gpa, String[] courses) {
        super(id, login, password, name, surname);
        this.gpa = gpa;
        this.courses = courses;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public String[] getCourses() {
        return courses;
    }

    public void setCourses(String[] courses) {
        this.courses = courses;
    }

    @Override
    public String getData() {
        String s = super.getData() + " " + getGpa();
        for(int i = 0;i < courses.length;i++){
            s += " " + courses[i];
        }
        return s;
    }
}
