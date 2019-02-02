package Classes;

public class Goods {
    private String itemName;
    private float itemPrice;

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



    public Goods(String itemName, float itemPrice) {
        this.itemName = itemName;
        this.itemPrice = itemPrice;
    }





}
