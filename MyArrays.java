package com.company;

public class MyArrays {

    public static void main(String[] args) {
        int [] myArray = {1, 3, 5, 7, 9};
        int temp = myArray[0];
        myArray[0] = myArray[myArray.length-1];
        myArray[myArray.length-1] = temp;

       /* Код в комментарии выводит массив в консоль для проверки, после перестановки элементов
        for (int a : myArray)
        System.out.print(a + " ");*/

        System.out.print(myArray[0] + myArray[myArray.length-3]);
    }
}
