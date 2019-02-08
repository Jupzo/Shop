package Classes;

import java.util.ArrayList;

public class Customer {

    private static int counter = 1;
    private int customerId;
    private String firstName;
    private String lastName;
    private ArrayList <ShoppingCart> customerCart = new ArrayList<>();


    @Override
    public String toString() {
        return "ID:" + customerId + " Customer name: " + firstName + " " + lastName + " City: " + city + "\n";
    }

    private String city;

    public Customer() {
    }

    public Customer(String firstName, String lastName, String city) {
        this.customerId = counter++;
        this.firstName = firstName;
        this.lastName = lastName;
        this.city = city;
    }

}
