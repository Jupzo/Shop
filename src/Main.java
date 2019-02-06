import Classes.Customer;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {


    private Scanner scanner;

    public Main(Scanner scanner) {
        this.scanner = scanner;
    }

    public void setScanner(Scanner scanner) {

        this.scanner = scanner;
    }

    public int getInt(String s) {
        System.out.println(s);
        int num = 0;


        try {

            num = Integer.parseInt(scanner.nextLine());

        } catch (InputMismatchException e) {

            System.out.println("Wrong character type. Try using numbers.");

        }

        return num;

    }
    public float getFloat(String s) {
        System.out.println(s);
        float dec = 0;

        try {

            dec = Integer.parseInt(scanner.nextLine());

        } catch (InputMismatchException e) {

            System.out.println("Wrong character type. Try using numbers.");
        }
        return dec;
    }



    public String getString(String s) {
        System.out.println(s);
        String text = "hm0";

        try {
            text = scanner.nextLine();

        } catch (InputMismatchException e) {

            System.out.println("Wrong character type. Try using letters.");

        }
        return text;

    }

    public static void main(String[] args) {
        System.out.println("Welcome to my humble shop!");
        Scanner scanner = new Scanner(System.in);
        Main main = new Main(scanner);

        System.out.println("1: Register a customer.");
        System.out.println("2: Register a product.");
        System.out.println("3: See list of customers.");
        System.out.println("4: See Specific Customer.");
        System.out.println("5: See list of products.");
        System.out.println("6: Add a product to cart.");
        System.out.println("7: Exit program");
        boolean startOver = true;
        while (startOver) {
            int userInput = main.getInt("Write the number corresponding to the action that you want.");

            switch (userInput) {

                case 1:

                    String fName = main.getString("Enter First name.");
                    String lName = main.getString("Enter Last name.");
                    String city = main.getString("Enter city.");

                    Customer customer = new Customer(fName, lName, city);
                    System.out.println("Customer registered.\n");

                    startOver = true;
                    break;
                case 2:

                int userInput2 = main.getInt("Write 1 for wood.\n Write 2 for nails and screws.\n Write 3 for cement and mortar.");
                    switch (userInput2) {
                        case 1:


                            String iName = main.getString("Enter item name.");
                            float iPrice = main.getFloat("Enter item price");

                    }





                default:
                    System.out.println("A number from the list please!\n");
                    startOver = true;
                    break;
            }

        }
    }
}