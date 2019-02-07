package Classes;

public class Goods {
    private String itemType;
    private String itemName;
    private double itemPrice;

    public Goods(String iName, double iPrice , String type) {
        this.itemType = type;
        this.itemName = iName;
        this.itemPrice = iPrice;
    }

    @Override
    public String toString() {
        return "Goods{" +
                "itemType='" + itemType + '\'' +
                ", itemName='" + itemName + '\'' +
                ", itemPrice=" + itemPrice +
                '}';
    }
}







