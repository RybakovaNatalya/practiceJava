package task3;

import task3.box.Biscuit;
import task3.box.Box;
import task3.box.Candy;
import task3.box.Jellybean;

/**
 * Author:   Admin
 * Date:     14.08.2022 16:37
 * Description: run box
 */
public class MaineBox {
    public static void main(String[] args) {
        //создаем объекты классов
        Candy candy1 = new Candy("Candy", 45.55, 15, "white");
        Jellybean jellybean1 = new Jellybean("Jellybean", 25, 10.7, "red");
        Biscuit biscuit1 = new Biscuit("Cookie", 103, 58.8, "almond");

        //создаем массив объектов
        Box[] box1 = {candy1, jellybean1, biscuit1};
        double totalPrice = 0;
        double totalWeight = 0;
        //находим общую стоимость и вес
        totalPrice += candy1.getPrice() + jellybean1.getPrice() + biscuit1.getPrice();
        totalWeight += candy1.getWeight() + jellybean1.getWeight() + biscuit1.getWeight();

        // выводим информацию о всех сладостях
        for (Box someBox : box1) {
            System.out.println(someBox.toString());
        }
        System.out.printf("Общий вес подарка: %.2f гр.\nОбщая цена подарка: %.2f руб.", totalWeight, totalPrice);
    }
}
