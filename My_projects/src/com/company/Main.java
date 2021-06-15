package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String[] mass = new String[5];
        for(int i = 0;i < mass.length;i++){
            mass[i] = in.next();
        }
        ArrayList<String> newString = massOfString(mass);
        for(int i = 0;i < newString.size();i++){
            System.out.println(newString.get(i));
        }
    }

    public static ArrayList<String> massOfString(String[] mass){
        ArrayList<String> newString = new ArrayList<String>();
        String word = "aeiou";
        for(int i = 0;i < mass.length;i++){
            int count = 0;
            for(int j = 0;j < mass[i].length();j++){
                for(int k = 0;k < word.length();k++){
                    if(mass[i].charAt(j) == word.charAt(k)){
                        count++;
                    }
                }
            }
            if(count > 4){
                newString.add(mass[i]);
            }
        }
        return newString;
    }
}
