package Classes;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;

public class Customer implements Serializable {

    private int customerId;
    private String firstName;
    private String lastName;
    private ArrayList<Goods> customerCart = new ArrayList<>();
    private double totalPrice;

    @Override
    public String toString() {
        return "ID: " + customerId + " Customer name: " + firstName + " " + lastName + " City: " + city;
    }

    private String city;

    public Customer() {
    }

    public Customer(int id, String firstName, String lastName, String city) {
        this.customerId = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.city = city;
        customerCart = new ArrayList<>();
        this.totalPrice = 0;
    }

    public void printCustomerAndCart() {
        double totalPrice;
        totalPrice = 0;
        System.out.println(this);
        for (int i = 0; i < customerCart.size(); i++) {
            double itemPrice = customerCart.get(i).getItemPrice();

            totalPrice = totalPrice + itemPrice;

            System.out.println(customerCart.get(i));

        }
        System.out.println("Total price: " + totalPrice + "kr");
    }

    public Collection<Goods> getCustomerCart() {
    return customerCart;
    }
}