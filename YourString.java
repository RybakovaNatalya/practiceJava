package com.company;
import java.util.Scanner;

public class YourString {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите строку из слов, разделенных пробелами");
        String str = in.nextLine();


        String new_str = str.replaceAll("[^a-zA-Z\\s]", "");

        // удаляем лишние пробелы
        while (new_str.contains("  ")) {
            String res = new_str.replace("  ", " ");
            new_str = res;
        }


        String[] count = new_str.split(" ");


        System.out.println(new_str);
        System.out.print("Количество слов: " + count.length);
    }
}
