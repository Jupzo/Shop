package Classes;

import java.util.ArrayList;

public class CustomerRegister {

    public CustomerRegister(int customerId) {
        this.customerId = customerId;
    }

    private int customerId;
    private ArrayList<Customer> customerList;

    public int getCustomerId() {
        return customerId;
    }

    public ArrayList<Customer> getCustomerList() {
        return customerList;
    }

    public CustomerRegister(){
        customerId = customerList.size() + 1;



    }
}
