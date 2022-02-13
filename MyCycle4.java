package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class MyCycle4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите количество строк массива");
        int line = in.nextInt();
        System.out.println("Введите количество столбцов массива");
        int column = in.nextInt();
        int[][] yourArray = new int[line][column];
        System.out.println("Введите данные в массив");
        for (int i = 0; i < yourArray.length; i++) {
            for (int j = 0; j < yourArray[i].length; j++){
                yourArray[i][j] = in.nextInt();
            }
        }
        /*System.out.println(Arrays.deepToString(yourArray));*/

        for (int i = 0; i < yourArray[0].length; i++){
            yourArray[0][i] *= 3;
        }
        for (int a : yourArray[0])
            System.out.print(a + " ");
    }
}
