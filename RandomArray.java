package com.company;

import java.util.Random;

public class RandomArray {
    public static void main(String[] args) {
        Random num = new Random();
        int [] numbers = new int [15];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = num.nextInt(41) - 20;
        }
        for (int a : numbers)
            System.out.print(a + " ");
        System.out.println();

        int max = numbers[0];
        int min = numbers[0];
        for (int i = 0; i < numbers.length; i++){
            if (numbers[i] > max){
                max = numbers[i];
            }
            else if (numbers[i] < min){
                min = numbers[i];
            }
        }
        System.out.println(max + " " + min);

        if (Math.abs(max) > Math.abs(min)){
            System.out.print(max);
        }
        else
            System.out.print(min);
    }
}
