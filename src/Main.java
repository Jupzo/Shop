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
        int tal = 0;


        try {

            tal = Integer.parseInt(scanner.nextLine());

        } catch (InputMismatchException e) {

            System.out.println("Wrong character type. Try using numbers");

        }

        return tal;

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

        int userInput = main.getInt("Write the number corresponding to the action that you want.");

        switch (userInput) {

            case 1:

                String fName = main.getString("Enter First name.");
                String lName = main.getString("Enter Last name.");
                String city = main.getString("Enter city.");

                Customer customer = new Customer(fName, lName, city);

            case 2:
        }


    }
}