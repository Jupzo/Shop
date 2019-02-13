package Classes;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;

public class Customer implements Serializable {

    private int customerId;
    private String firstName;
    private String lastName;
    private ArrayList<Goods> customerCart = new ArrayList<>();


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
    }

    public void printCustomerAndCart() {

        System.out.println(this);
        for (int i = 0; i < customerCart.size(); i++) {
            System.out.println(customerCart.get(i));
        }

    }

    public Collection<Goods> getCustomerCart() {
    return customerCart;
    }
}