import Classes.Customer;
import Classes.Goods;

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
        int heltal = 0;


        try {

            heltal = Integer.parseInt(scanner.nextLine());

        } catch (InputMismatchException e) {

            System.out.println("Wrong character type. Try using numbers.");

        }

        return heltal;

    }
    public float getFloat(String s) {
        System.out.println(s);
        float flyttal = 0;

        try {

            flyttal = Integer.parseInt(scanner.nextLine());

        } catch (InputMismatchException e) {

            System.out.println("Wrong character type. Try using numbers.");
        }
        return flyttal;
    }



    public String getString(String s) {
        System.out.println(s);
        String text = "ab1";

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
        int userInput = main.getInt("Write the number corresponding to the action that you want.");

        switch (userInput) {

            case 1:

                String fName = main.getString("Enter First name.");
                String lName = main.getString("Enter Last name.");
                String city = main.getString("Enter city.");

                Customer customer = new Customer(fName, lName, city);

            case 2:

                String iType = main.getString("Enter product type.");
                String iName = main.getString("Enter product name.");
                float iPrice = main.getFloat("Enter product price");

                Goods goods = new Goods(iType, iName, iPrice);




        }


    }
}