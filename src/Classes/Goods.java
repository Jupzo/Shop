package Classes;

public class Goods {
    private String itemType;
    private String itemName;

    public Goods(String itemType, String itemName, float itemPrice) {
        this.itemType = itemType;
        this.itemName = itemName;
        this.itemPrice = itemPrice;
    }

   public Goods(){

   }

    private float itemPrice;


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

    public float getItemPrice() {
        return itemPrice;
    }

    public void setItemPrice(float itemPrice) {
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







