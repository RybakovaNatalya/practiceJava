package task3;

/**
 * Author:   Admin
 * Date:     14.08.2022 19:41
 * Description:
 */
public class MinMaxExample {
    public static void main(String[] args){
        int[] array = new int[]{-10, -9, -8, -7, -6, -5, -4, -3, -2, -1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9};

        // Вызов метода getMax () для получения максимального значения
        int max = getMax(array);
        System.out.println("Maximum Value is: "+max);

        // Вызов метода getMin () для получения минимального значения
        int min = getMin(array);
        System.out.println("Minimum Value is: "+min);
    }

    //здесь находим максимум
    public static int getMax(int[] inputArray){
        int maxValue = inputArray[0];
        for(int i=1;i < inputArray.length;i++){ if(inputArray[i] > maxValue){
            maxValue = inputArray[i];
        }
        }
        return maxValue;
    }

    // здесь находим минимум
    public static int getMin(int[] inputArray){
        int minValue = inputArray[0];
        for(int i=1;i<inputArray.length;i++){
            if(inputArray[i] < minValue){
                minValue = inputArray[i];
            }
        }
        return minValue;
    }
}
