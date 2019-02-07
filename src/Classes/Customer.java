package Classes;



public class Customer {

    private static int counter = 0;
    private int customerId;
    private String firstName;
    private String lastName;

    @Override
    public String toString() {
        return "Customer{" +
                "customerId=" + customerId +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", city='" + city + '\'' +
                '}';
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
        return city;
    }

    public void setCity(String city) {
        city = city;
    }



    }
