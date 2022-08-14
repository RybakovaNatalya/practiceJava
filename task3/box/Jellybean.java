package task3.box;

/**
 * Author:   Admin
 * Date:     14.08.2022 17:14
 * Description:
 */
public class Jellybean extends Box {
    private String colour;

    public Jellybean(String nameOfProduct, double price, double weight, String colour) {
        super(nameOfProduct, price, weight);
        this.colour = colour;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    @Override
    public String toString(){
        return super.toString() + ", colour = " + colour;
    }
}
