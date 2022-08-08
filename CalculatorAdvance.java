/**
 * @see CalculatorAdvance предназначен для сложения двух дробных чисел, есть возможность выбрать другие операции с данными числами
 * @see #getDouble()  метод принимает пользовательский ввод значений num1 и num2
 * @see #getOperation() метод принимает пользовательский ввод значения operation
 * @see #getAnswer() метод ожидает ответ от пользователя продолжить или прервать выполнение программы
 * @see #calcMin(double, double)  метод выпоняет только сложение чисел
 * @see #calcMax(double, double, char)  метод выполняет сложение, вычетание, умножение и деление чисел
 */

import java.util.Scanner;

public class CalculatorAdvance {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        double num1 = getDouble();
        double num2 = getDouble();
        double result = calcMin(num1, num2);
        System.out.printf("Результат операции: %.4f", result);
        System.out.println();
        getAnswer();
        char operation = getOperation();
        double result2 = calcMax(num1, num2, operation);
        System.out.printf("Результат операции: %.4f", result2);
    }

    public static double getDouble() {
        System.out.println("Введите число:");
        double num = scanner.nextDouble();
/*Данная часть кода для проверки что пользователь вводит дробное число, но
    код работает наоборот - не дает пользователю вводит дробные числа, только целые, подскажите что не так*/
//        if (scanner.hasNextDouble()) {
//            num = scanner.nextDouble();
//        } else {
//            System.out.println("Вы допустили ошибку при вводе числа. Попробуйте еще раз.");
//            scanner.next();//рекурсия
//            num = getDouble();
//        }
        return num;
    }

    public static char getOperation() {
        System.out.println("Введите операцию:");
        char operation;
        if (scanner.hasNext()) {
            operation = scanner.next().charAt(0);
        } else {
            System.out.println("Вы допустили ошибку при вводе операции. Попробуйте еще раз.");
            scanner.next();//рекурсия
            operation = getOperation();
        }
        return operation;
    }

    public static void getAnswer() {
        System.out.println("Хотите выполнить доугую операцию с числами? Введите: 'Да' или 'Нет'");
        String answer = scanner.next();
        if (answer.equalsIgnoreCase("нет")) {
            System.exit(0);
        }
    }

    /**@param num1 первое число
     * @param num2 второе число
     * @return возвращает сумму*/
    public static double calcMin(double num1, double num2) {
        return num1 + num2;
    }

    /**@param operation арифметический оператор
     * @return возвращает результат простых математических вычеслений */
    public static double calcMax(double num1, double num2, char operation) {
        double result2;
        switch (operation) {
            case '+':
                result2 = num1 + num2;
                break;
            case '-':
                result2 = num1 - num2;
                break;
            case '*':
                result2 = num1 * num2;
                break;
            case '/':
                result2 = num1 / num2;
                break;
            default:
                System.out.println("Операция не распознана. Повторите ввод.");
                result2 = calcMax(num1, num2, getOperation());//рекурсия
        }
        return result2;
    }
}

