package com.company;

import java.util.Scanner;

public class FinalTask3 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите количество строк");
        int numOfLines = in.nextInt();
        String[] strArray = new String[numOfLines];
        Scanner str = new Scanner(System.in);
        for (int i = 0; i < strArray.length; i++) {
            System.out.println("Введите строку");
            strArray[i] = str.nextLine();
        }

        int[] myCount = new int[numOfLines];
        for(int i = 0; i < strArray.length; i++) {
            int count = (int) strArray[i].chars().distinct().count(); // удаление дубликатов и подсчет уникальных символов
            myCount[i] = count;
        }

        int max = myCount[0];
        int indexMax = 0;
        for (int j = 0; j < myCount.length; j++){
            if (myCount[j] > max){
                max = myCount[j];
                indexMax = j;
            }
        }
        System.out.print(strArray[indexMax]);
    }
}