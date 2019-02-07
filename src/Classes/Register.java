package Classes;

import java.util.ArrayList;
import java.util.Scanner;


public class Register {
    Scanner scanner = new Scanner(System.in);
    ArrayList<Customer> customerList = new ArrayList<>();
    ArrayList<Goods> productList = new ArrayList<>();





    public void addProduct1() {
        String type = "kr per item";
       String iName = getString("Enter item name.");

        System.out.println("Enter the price of the product: ");
        double iPrice = Double.parseDouble(scanner.nextLine());

        Goods goods = new Goods(iName,iPrice,type);
        System.out.println("Product added.\n");
        productList.add(goods);
    }
    public void addProduct2() {
        String type = "kr per kg";
        String iName = getString("Enter item name.");

        System.out.println("Enter the price of the product: ");
        double iPrice = Double.parseDouble(scanner.nextLine());

        Goods goods = new Goods(iName,iPrice,type);
        System.out.println("Product added.\n");
        productList.add(goods);
    }
    public void addProduct3() {
        String type = "kr per liter";
        String iName = getString("Enter item name.");

        System.out.println("Enter the price of the product: ");
        double iPrice = Double.parseDouble(scanner.nextLine());

        Goods goods = new Goods(iName,iPrice,type);
        System.out.println("Product added.\n");
        productList.add(goods);
    }
    public int getInt(String s) {
        System.out.println(s);

        return Integer.parseInt(scanner.nextLine());
    }

    public String getString(String s) {
        String textToTest = "o";
        for (int i = 0; i < 1; i++) {

            System.out.println(s);

            textToTest = scanner.nextLine();




        }
        return textToTest;
}
}