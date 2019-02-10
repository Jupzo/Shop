package Classes;

public class Goods {
    private static int counter = 1;
    private int productId;
    private String itemType;
    private String itemName;
    private double itemPrice;

    public Goods(String iName, double iPrice , String type) {
        this.productId = counter++;
        this.itemType = type;
        this.itemName = iName;
        this.itemPrice = iPrice;
    }

    @Override
    public String toString() {
        return "Number: " + productId+ " Product name: " + itemName + " Price: " + itemPrice + itemType;

    }

}







