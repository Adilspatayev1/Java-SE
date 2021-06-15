package com.company;

import java.util.Scanner;

public class Main {
    static int size = 0;
    static Student[]students = new Student[10];

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        boolean b = true;
        while (b){
            System.out.println("PRESS [1] TO ADD STUDENT");
            System.out.println("PRESS [2] TO LIST STUDENT");
            System.out.println("PRESS [0] TO EXIT");
            int choice = in.nextInt();
            switch (choice){
                case 1:
                    System.out.print("Input id: ");int id = in.nextInt();
                    System.out.print("Input name: ");String name = in.next();
                    System.out.print("Input surname: ");String surname = in.next();
                    System.out.print("Input gpa: ");double gpa = in.nextDouble();
                    Student s = new Student(id, name, surname, gpa);
                    addStudent(s);
                    break;
                case 2:
                    printAll(students);
                    break;
                case 0:
                    b = false;
                    break;
            }
        }
    }

    public static void addStudent(Student a){
        students[size] = a;
        size++;
    }

    public static void printAll(Student[]arr){
        for(int i = 0;i < size;i++){
            System.out.println(arr[i].getStudentData());
        }
    }

    public static Student[] topStudent(Student[]array){
        int n =  array.length;
        for(int i = 0;i < n - 1;i++){
            for(int j = 0;j < n - i - 1;j++){
                if(array[j].gpa < array[j + 1].gpa){
                    Student temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
        return array;
    }
}
