package com.company;

import java.util.Scanner;

public class FinalTask4 {
    public static void main(String[] args) {
        System.out.println("Отгадай загадку:\nСидит дед, во сто шуб одет, кто его раздевает, тот слезы проливает.\nУ тебя 3 попытки и одна Подсказка");
        Scanner in = new Scanner(System.in);
        System.out.println("Твой ответ:");
        for (int i = 1; i <= 3; i++) {
            String answer = in.nextLine();
            if (answer.equalsIgnoreCase("Заархивированный вирус")) {
                System.out.print("Правильно!");
                break;
            }
            else if (answer.equalsIgnoreCase("Подсказка")){
                if (i == 1){
                    System.out.println("Это не лук!");
                    System.out.println("Твой ответ:");
                    String promp = in.nextLine();
                    if (promp.equalsIgnoreCase("Заархивированный вирус")) {
                        System.out.print("Правильно!");
                        break;
                    }
                    else
                        System.out.print("Обидно, приходи в другой раз");
                        break;
                }
                else
                    System.out.println("Подсказка уже недоступна");
                    i -= 1;
            }
            else if (i == 3){
                System.out.print("Обидно, приходи в другой раз");
            }
            else
                System.out.println("Подумай еще.\nТвой ответ:");
        }
    }
}
