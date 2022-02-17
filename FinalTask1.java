package com.company;

import java.util.Scanner;

public class FinalTask1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите текущий курс");
        double exchangeRates = in.nextDouble();
        System.out.println("Введите количество рублей");
        int counter = in.nextInt();
        double sum = exchangeRates * (double)counter;
        System.out.printf("Курс доллара: %.2f\nКоличество рублей: %d\nИтого: %.2f", exchangeRates, counter, sum);
    }
}
