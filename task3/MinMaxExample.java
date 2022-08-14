package task3;

import java.util.Arrays;

/**
 * Author:   Admin
 * Date:     14.08.2022 19:41
 * Description:
 */
public class MinMaxExample {
    public static void main(String[] args) {
        int[] array = new int[]{-10, -9, -8, -7, -6, -5, -4, -3, -2, -1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9};

        // Вызов метода getMax () для получения максимального значения
        int max = getMax(array);
        System.out.println("Maximum Value is: " + max);

        // Вызов метода getMin () для получения минимального значения
        int min = getMin(array);
        System.out.println("Minimum Value is: " + min);

        // переставляем элементы
        int value1 = getMinInd(array);
        int value2 = getMaxInd(array);
        int temp = array[value1];
        array[value1] = array[value2];
        array[value2] = temp;
        // вывод массива
        Arrays.stream(array).forEach(e-> System.out.print(e + " "));
    }

    //метод возвращает максимальное значение
    public static int getMax(int[] inputArray) {
        int maxValue = inputArray[0];
        for (int i = 1; i < inputArray.length; i++) {
            if (inputArray[i] > maxValue) {
                maxValue = inputArray[i];
            }
        }
        return maxValue;
    }

    // метод возвращает минимальное значение
    public static int getMin(int[] inputArray) {
        int minValue = inputArray[0];
        for (int i = 1; i < inputArray.length; i++) {
            if (inputArray[i] < minValue) {
                minValue = inputArray[i];
            }
        }
        return minValue;
    }
    //метод возвращает индекс максимального значения
    public static int getMaxInd(int[] inputArray) {
        int maxValue = inputArray[0];
        int maxInd = 0;
        for (int i = 1; i < inputArray.length; i++) {
            if (inputArray[i] > maxValue) {
                maxInd = i;
                maxValue = inputArray[i];
            }
        }
        return maxInd;
    }

    // метод возвращает индекс минимального значения
    public static int getMinInd(int[] inputArray) {
        int minValue = inputArray[0];
        int minInd = 0;
        for (int i = 1; i < inputArray.length; i++) {
            if (inputArray[i] < minValue) {
                minInd = i;
                minValue = inputArray[i];
            }
        }
        return minInd;
    }
}
