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
}