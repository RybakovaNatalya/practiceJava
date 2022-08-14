package task3.box;

/**
 * Author:   Admin
 * Date:     14.08.2022 17:15
 * Description:
 */
public class Biscuit extends Box {
    private String topping;

    public Biscuit(String nameOfProduct, double price, double weight, String topping) {
        super(nameOfProduct, price, weight);
        this.topping = topping;
    }

    public String getTopping() {
        return topping;
    }

    public void setTopping(String topping) {
        this.topping = topping;
    }
    @Override
    public String toString(){
        return super.toString() + ", topping = " + topping;
    }
}
