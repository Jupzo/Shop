import Classes.Register;

    public class Main{

    public static void main(String[] args) {
        Register register = new Register();
        System.out.println("Welcome to my humble shop!");
        boolean startOver = true;
        while (startOver) {
        System.out.println("1: Register a customer.");
        System.out.println("2: Register a product.");
        System.out.println("3: See list of customers.");
        System.out.println("4: See Specific Customer.");
        System.out.println("5: See list of products.");
        System.out.println("6: Add a product to cart.");
        System.out.println("7: Exit program");

            int userInput = register.getInt("Write the number corresponding to the action that you want.");

            switch (userInput) {

                case 1:

                    register.addCustomer();

                    startOver = true;
                    break;

                case 2:

                int userInput2 = register.getInt("Write 1 price per item.\nWrite 2 for price per kg.\nWrite 3 for price per liter.");
                    switch (userInput2) {

                        case 1:

                            register.addProduct1();
                            break;

                        case 2:
                            register.addProduct2();
                            break;

                        case 3:
                            register.addProduct3();
                            break;
                    }
                    startOver = true;
                    break;

                case 3:

                    register.printCustomerList();

                    startOver = true;
                    break;

                case 4:

                    

                case 5:

                    register.printProductList();

                    startOver = true;
                    break;

                case 6:



                case 7:

                    System.out.println("Good bye.");

                    startOver = false;
                    break;

                default:
                    System.out.println("A number from the list please!\n");
                    startOver = true;
                    break;
            }

        }
    }
}