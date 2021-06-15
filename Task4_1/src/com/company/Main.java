package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        BankApplication bank = new BankApplication("Nurbank", "Almaty");
        boolean b = true;
        while (b){
            System.out.println("PRESS [1] TO ADD WORKER");
            System.out.println("PRESS [2] TO LIST WORKERS\n");
            System.out.println("PRESS [0] TO EXIT");
            int choice = in.nextInt();
            switch (choice){
                case 1:
                    System.out.print("Insert name: "); String name = in.next();
                    System.out.print("Insert surname: "); String surname = in.next();
                    System.out.print("Insert department: "); String department = in.next();
                    System.out.print("Insert salary: "); int salary = in.nextInt();
                    bank.addWorker(name, surname, department, salary);
                    break;
                case 2:
                    bank.listWorkers();
                    System.out.println("-------------------------");
                    break;
                case 0:
                    b = false;
                    break;
            }
        }
    }
}
