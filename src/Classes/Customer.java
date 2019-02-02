package Classes;

public class Customer {
     String firstName;
     String lastName;
     String City;

    public Customer(String firstName, String lastName, String city) {
        this.firstName = firstName;
        this.lastName = lastName;
        City = city;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getCity() {
        return City;
    }

    public void setCity(String city) {
        City = city;
    }




}
