package Classes;
import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Register implements Serializable {
    private Scanner scanner = new Scanner(System.in);

    public ArrayList<Customer> getCustomerList() {
        return customerList;
    }

    private ArrayList<Customer> customerList = new ArrayList<>();

    private ArrayList<Goods> productList = new ArrayList<>();

    private int GenerateCustomerIdSeed() {
        int customerIdSeed = customerList.size() + 1;

    return customerIdSeed;
    }

    private int GenerateProductIdSeed() {
        int productIdSeed = productList.size() + 1;

        return productIdSeed;

    }


    public void addCustomer() {

        String fName = getString("Enter First name.");
        String lName = getString("Enter Last name.");
        String city = getString("Enter city.");

        Customer customer = new Customer(GenerateCustomerIdSeed(), fName, lName, city);
        System.out.println("Customer registered.\n");
        customerList.add(customer);
    }


        private boolean validateCustomerName (String customerName){
            return customerName.matches("[A-ZÅÖÄ][a-zåöä]*");
        }



    public void addProductSwitch() {

        int userInput2 = getInt("Write 1 price per item.\nWrite 2 for price per kg.\nWrite 3 for price per liter.");
        switch (userInput2) {

            case 1:

                addProduct1();
                break;

            case 2:

                addProduct2();
                break;

            case 3:

                addProduct3();
                break;
        }

    }

    private void addProduct1() {
        String type = "kr per item";
       String iName = getString("Enter item name.");

        System.out.println("Enter the price of the product: ");
        double iPrice = Double.parseDouble(scanner.nextLine());

        Goods goods = new Goods(GenerateProductIdSeed(),iName,iPrice,type);
        System.out.println("Product added.\n");
        productList.add(goods);
    }

    private void addProduct2() {
        String type = "kr per kg";
        String iName = getString("Enter item name.");

        System.out.println("Enter the price of the product: ");
        double iPrice = Double.parseDouble(scanner.nextLine());

        Goods goods = new Goods(GenerateProductIdSeed(),iName,iPrice,type);
        System.out.println("Product added.\n");
        productList.add(goods);
    }

    private void addProduct3() {
        String type = "kr per liter";
        String iName = getString("Enter item name.");

        System.out.println("Enter the price of the product: ");
        double iPrice = Double.parseDouble(scanner.nextLine());

        Goods goods = new Goods(GenerateProductIdSeed(),iName,iPrice,type);
        System.out.println("Product added.\n");
        productList.add(goods);
    }

   public void printOneCustomer() {

        printCustomerList();
        int customerChoice1 = getInt("Enter the customer number of the customer you want to see.");
        int customerChoice2 = customerChoice1 -1;

       getCustomerList().get(customerChoice2).printCustomerAndCart();

   }

    public void printCustomerList() {

        for(int i = 0; i < customerList.size(); i++)
        System.out.println(customerList.get(i));

    }

    public void printProductList() {

        for(int e = 0; e < productList.size(); e++)
        System.out.println(productList.get(e));
    }

   public void addToCart() {
       printCustomerList();
       int customerAdd1 = getInt("Enter ID for the customer you want to add item to.");
       int customerAdd2 = customerAdd1 - 1;


       printProductList();
       int itemAdd1 = getInt("Enter the product number of the product you want to add.");
       int itemAdd2 = itemAdd1 - 1;

       getCustomerList().get(customerAdd2).getCustomerCart().add(productList.get(itemAdd2));
   }
       private String getString(String s) {
           String textToTest = "o";
           for (int i = 0; i < 5; i++) {

               System.out.println(s);

               textToTest = scanner.nextLine();
               if
               (!validateCustomerName(textToTest)) {
                   System.out.println("Wrong format. Please try again!");
               } else {
                   System.out.println("Correct!Next step.");
                   break;
               }
           }
           return textToTest;


   }

    public int getInt(String s) {
        System.out.println(s);

        return Integer.parseInt(scanner.nextLine());
    }

  public  void saveFile (String Order) throws Exception {
        ObjectOutputStream out = new ObjectOutputStream (new FileOutputStream ("Order"));

        out.writeObject (customerList);
        out.writeObject(productList);
        out.close ();
    }

    public void readFile(String Order) throws Exception {

       try {
           ObjectInputStream in = new ObjectInputStream(new FileInputStream("Order"));


           customerList = (ArrayList<Customer>) in.readObject();
           productList = (ArrayList<Goods>) in.readObject();
           in.close();
       }
       catch (FileNotFoundException e){
           System.out.println(e.getClass());
       }
    }

    }
