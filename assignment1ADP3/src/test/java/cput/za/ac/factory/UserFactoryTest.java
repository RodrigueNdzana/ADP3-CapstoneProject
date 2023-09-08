package cput.za.ac.factory;

/*UserFactoryTest .java
 Author: Bavuyise Mpila(216061067)
 Date 07 April 2023
*/
import cput.za.ac.domain.User;
import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.*;

class UserFactoryTest {
    @Test
    public void test() {
        User user = UserFactory.createUser("Bavu", "Mpila", "0826255", "bmpila@gmail.com", "Ny63 No114");
        assertNotNull(user);
        System.out.println(user.toString());

    }
}