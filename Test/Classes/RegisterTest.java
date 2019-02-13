package Classes;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

import static org.junit.jupiter.api.Assertions.*;

class RegisterTest {


    @Test
    public void  addCustomer_addCustomerNameAndCityToCustomerList_true(){

      ByteArrayInputStream inputStream = new ByteArrayInputStream("Kalle\nAndersson\nGöteborg\n".getBytes());

      InputStream oldstream = System.in;
      System.setIn(inputStream);

      Register register = new Register();

      register.addCustomer();

      System.setIn(oldstream);

      assertEquals(1, register.getCustomerList().size());

    }
    @Test
    public void  addProduct1_addProductNameAndPriceToProductList_true() {

        ByteArrayInputStream inputStream = new ByteArrayInputStream("1\nBaguette\n15\n".getBytes());

        InputStream oldstream = System.in;
        System.setIn(inputStream);

        Register register = new Register();

        register.addProductSwitch();

        System.setIn(oldstream);

        assertEquals(1, register.getProductList().size());
    }
    @Test
    public void  addProduct2_addProductNameAndPriceToProductList_true() {

        ByteArrayInputStream inputStream = new ByteArrayInputStream("2\nMjöl\n5\n".getBytes());

        InputStream oldstream = System.in;
        System.setIn(inputStream);

        Register register = new Register();

        register.addProductSwitch();

        System.setIn(oldstream);

        assertEquals(1, register.getProductList().size());
    }
    @Test
    public void  addProduct3_addProductNameAndPriceToProductList_true() {

        ByteArrayInputStream inputStream = new ByteArrayInputStream("3\nMjölk\n10\n".getBytes());

        InputStream oldstream = System.in;
        System.setIn(inputStream);

        Register register = new Register();

        register.addProductSwitch();

        System.setIn(oldstream);

        assertEquals(1, register.getProductList().size());
    }

    @Test
    public void addToCart_addExistingProductToExistingCustomer_True() {

        ByteArrayInputStream inputStream = new ByteArrayInputStream("1\n1\n".getBytes());

        InputStream oldstream = System.in;
        System.setIn(inputStream);

        Register register = new Register();
        Customer customer = new Customer();

        register.addToCart();

        System.setIn(oldstream);

        assertEquals(1, customer.getCustomerCart().size());
    }

}
