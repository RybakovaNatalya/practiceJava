package com.company;

import java.util.Scanner;

public class MyCycle2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите любое целое положительное число");
        int num = in.nextInt();
        int sum = 0;
        for (int i = 1; i < num; i++ ){
            if (i % 2 != 0){
                sum += i;
            }
        }
        System.out.println("Сумма нечетных чисел - " + sum);
    }
}
