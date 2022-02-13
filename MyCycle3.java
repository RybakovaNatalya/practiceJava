package com.company;

import java.util.Scanner;

public class MyCycle3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите размер массива");
        int sizeArray = in.nextInt();
        double[] yourArray = new double[sizeArray];
        System.out.println("Введите данные в массив");
        for (int i = 0; i < yourArray.length; i++) {
            yourArray[i] = in.nextInt();
        }

        double average = 0;
        for(double a : yourArray){
            average += a;
        }
        average /= sizeArray;

        /*Выводит на консоль среднее арифметическое элементов массива
        System.out.println(average);*/

        for(int i = 0; i < yourArray.length; i++){
            yourArray[i] *= average ;
        }

        for (double a : yourArray)
            System.out.print(a + " ");
    }
}
