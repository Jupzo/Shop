package Classes;

import java.io.Serializable;

public class Goods implements Serializable {

    private int productId;
    private String itemType;
    private String itemName;
    private double itemPrice;

    public double getItemPrice() {
        return itemPrice;
    }

    public Goods(int id, String iName, double iPrice , String type) {
        this.productId = id;
        this.itemType = type;
        this.itemName = iName;
        this.itemPrice = iPrice;
    }

    @Override
    public String toString() {
        return "Number: " + productId+ " Product name: " + itemName + " Price: " + itemPrice + itemType;

    }

}







