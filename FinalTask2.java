package com.company;

import java.util.Scanner;

public class FinalTask2 {
    public static void main(String[] args) {
        int x = 0;
        Scanner in = new Scanner(System.in);
        System.out.println("Введите простое уравнение");
        String equation = in.nextLine();
        char[] equality = equation.toCharArray();

        if (equality[0] == 'x') {
            if (equality[1] == '+') {
                x = Character.getNumericValue(equality[4]) - Character.getNumericValue(equality[2]);
            }
            else  {
                x = Character.getNumericValue(equality[4]) + Character.getNumericValue(equality[2]);
            }
        }

        if (equality[2] == 'x') {
            if (equality[1] == '+') {
                x = Character.getNumericValue(equality[4]) - Character.getNumericValue(equality[0]);
            }
            else if (equality[0] < equality[4]){
                x = Character.getNumericValue(equality[0]) - Character.getNumericValue(equality[4]);
            }
            else {
                x = Character.getNumericValue(equality[4]) + Character.getNumericValue(equality[0]);
            }
        }

        if (equality[4] == 'x') {
            if (equality[1] == '+') {
                x = Character.getNumericValue(equality[0]) + Character.getNumericValue(equality[2]);
            }
            else {
                x = Character.getNumericValue(equality[0]) - Character.getNumericValue(equality[2]);
            }
        }
        System.out.print(x);
    }
}