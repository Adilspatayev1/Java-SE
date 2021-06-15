package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        FerrariEngine engine1 = new FerrariEngine(3, 4, 10.5);
        FerrariEngine engine2 = new FerrariEngine(3.5, 4, 11.7);
        FerrariEngine engine3 = new FerrariEngine(1.4, 4, 8.3);
        RenaultEngine engine4 = new RenaultEngine(2.5,4,9.5, 10);
        RenaultEngine engine5 = new RenaultEngine(5.0, 6, 15.5,11);

        Engine[] engines = {engine1, engine2, engine3, engine4, engine5};

        for(int i = 0;i < engines.length;i++){
            System.out.println(engines[i].getMaxSpeed());
        }
    }
}
