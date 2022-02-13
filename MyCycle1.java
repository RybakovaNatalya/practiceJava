package com.company;

import java.util.Scanner;

public class MyCycle1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите размер массива");
        int sizeArray = in.nextInt();
        int[] yourArray = new int[sizeArray];
        System.out.println("Введите данные в массив");
        for (int i = 0; i < yourArray.length; i++) {
            yourArray[i] = in.nextInt();
        }
        int x = 3;
        int y = 7;
        int z = 11;
        for(int a : yourArray){
            if(a == x || a == y || a == z){
                System.out.println("Данное значение имеется в константах");
                break;
            }
        }
    }
}
