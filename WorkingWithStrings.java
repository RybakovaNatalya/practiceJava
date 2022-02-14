package com.company;

import java.util.Locale;

public class WorkingWithStrings {

    public static void main(String[] args) {
        String str = "I like Java!!!";

        boolean substr1 = str.contains("Java");
        boolean substr2 = str.startsWith("I like");
        boolean substr3 = str.endsWith("!!!");

        if (substr1 && substr2 && substr3){
            System.out.println(str.toUpperCase());
        }

        String result = str.replace("a", "o");
        System.out.print(result.substring(7, 11));
    }
}
