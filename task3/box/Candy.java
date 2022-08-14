package task3.box;

/**
 * Author:   Admin
 * Date:     14.08.2022 17:13
 * Description:
 */
public class Candy extends Box {
    private String chocolate;

    public Candy(String nameOfProduct, double price, double weight, String chocolate) {
        super(nameOfProduct, price, weight);
        this.chocolate = chocolate;
    }

    public String getChocolate() {
        return chocolate;
    }

    public void setChocolate(String chocolate) {
        this.chocolate = chocolate;
    }
    @Override
    public String toString(){
        return super.toString() + ", chocolate = " + chocolate;
    }
}
