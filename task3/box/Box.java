package task3.box;

/**
 * Author:   Admin
 * Date:     14.08.2022 16:46
 * Description:
 */
public class Box {
    private String nameOfProduct;
    private double price;
    private double weight;

    public Box(String nameOfProduct, double price, double weight) {
        this.nameOfProduct = nameOfProduct;
        this.price = price;
        this.weight = weight;
    }

    public String getName() {
        return nameOfProduct;
    }

    public void setName(String nameOfProduct) {
        this.nameOfProduct = nameOfProduct;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public String toString(){
        return  nameOfProduct + " -" + " price = " + price + ", weight = " + weight + " gr";
    }
}
