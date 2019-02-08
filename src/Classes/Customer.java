package Classes;

import java.util.ArrayList;

public class Customer {

    private static int counter = 1;
    private int customerId;
    private String firstName;
    private String lastName;
    private ArrayList <Goods> customerCart = new ArrayList<>();


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
        customerCart = new ArrayList<> ();
    }

    public void printCustomerAndCart() {

        System.out.println(this);
        for (int i = 0; i < customerCart.size(); i++) {
            System.out.println(customerCart.get(i));
        }

    }
}
