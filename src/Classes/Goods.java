package Classes;

public class Goods {
    private String itemType;
    private String itemName;

    public Goods(String iName, double iPrice , String type) {
        this.itemType = type;
        this.itemName = iName;
        this.itemPrice = iPrice;
    }



    private double itemPrice;


    public String getItemType() {
        return itemType;
    }

    public void setItemType(String itemType) {
        this.itemType = itemType;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public double getItemPrice() {
        return itemPrice;
    }

    public void setItemPrice(double itemPrice) {
        this.itemPrice = itemPrice;
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







