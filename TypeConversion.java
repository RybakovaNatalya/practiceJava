package com.company;

import java.util.Scanner;

public class TypeConversion {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите число");
        String value1 = in.next();
        System.out.println("Введите число");
        int value2 = in.nextInt();
        if (Integer.valueOf(value1) > value2){
            System.out.println("Наибольшее число: " + value1);
        }
        else
        System.out.println("Наибольшее число: " + value2);
        if (Integer.valueOf(value1) > value2){
            System.out.println("Наименьшее число: " + value2);
        }
        else
            System.out.println("Наименьшее число: " + Double.valueOf(value1));
    }
}
