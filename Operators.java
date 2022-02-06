package com.company;

import java.util.Scanner;

public class Operators {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int [] numbers = new int [3];
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Введите число");
            numbers[i] = in.nextInt();
        }
        double sum = 0;
        for (int x: numbers) {
            sum += x;
        }
        System.out.println("среднее арифметическое чисел равно: " + sum/numbers.length);
        int mean = (int) (sum/numbers.length/2);
        if(mean > 3) {
            System.out.println("Программа выполнена корректно");
        }
    }
}

