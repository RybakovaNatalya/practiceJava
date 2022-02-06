package com.company;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите первое число");
        double first = in.nextDouble();
        System.out.println("Введите второе число");
        double second = in.nextDouble();
        System.out.println("Введите действие: '+', '-', '*', '/'");
        char operation = in.next().charAt(0);
        double result = 0;
        switch (operation){
            case '+':
                result = first + second;
                break;
            case '-':
                result = first - second;
                break;
            case '*':
                result = first * second;
                break;
            case '/':
                result = first / second;
                break;
            default:
                System.out.println("Операция не распознана. Повторите ввод.");
        }
        System.out.print(result);
    }
}
