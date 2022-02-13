package com.company;

import java.util.Scanner;

public class Converter {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Выберите что переводить: 1 - масса, 2 - расстояние");
        int value = in.nextInt();
        String answer = (value == 1) ? "Выберите единицу измерения: 1 - килограмм, 2 - унция, 3 - фунт, 4 - стоун" : "Выберите единицу измерения: 1 - метр, 2 - миля, 3 - ярд, 4 - фут";
        System.out.println(answer);
        int unit = in.nextInt();
        System.out.println("Введите число");
        int num = in.nextInt();
        if (value == 1){
            weight(unit,num);
        }
        else {
            length(unit, num);
        }

    }

    public static void  weight (int a, int b){
        double kilogram = 0;
        double ounce = 0;
        double Lb = 0;
        double stone = 0;
        switch (a){
            case 1:
                kilogram = b;
                ounce = b * 35.274;
                Lb = b * 2.205;
                stone = b / 6.35;
                break;
            case 2:
                kilogram = b / 35.274;
                ounce = b;
                Lb = b / 16.0;
                stone = b / 224.0;
                break;
            case 3:
                kilogram = b / 2.205;
                ounce = b * 16.0;
                Lb = b;
                stone = b /14.0;
                break;
            case 4:
                kilogram = b * 6.35;
                ounce = b * 224.0;
                Lb = b * 14.0;
                stone = b;
                break;
        }
        System.out.print("Результат:\nКилограммы:" + " " + kilogram + "\nУнции:" + " " + ounce + "\nФунты:" + " " + Lb + "\nСтоуны:" + " "+ stone);
    }
    public static void  length (int a, int b){
        double meter = 0;
        double mile = 0;
        double yard = 0;
        double foot = 0;
        switch (a){
            case 1:
                meter = b;
                mile = b / 1609.0;
                yard = b * 1.094;
                foot = b *  3.281;
                break;
            case 2:
                meter = b * 1609.0;
                mile = b;
                yard = b * 1760.0;
                foot = b * 5280.0;
                break;
            case 3:
                meter = b / 1.094;
                mile = b / 1760.0;
                yard = b;
                foot = b * 3.0;
                break;
            case 4:
                meter = b / 3.281;
                mile = b / 5280.0;
                yard = b / 3.0;
                foot = b;
                break;
        }
        System.out.print("Результат:\nМетры:" + " " + meter + "\nМили:" + " " + mile + "\nЯрды:" + " " + yard + "\nФуты:" + " "+ foot);
    }
}

