package cput.za.ac.repository;

/*UserRepositoryTest .java
 Author: Bavuyise Mpila(216061067)
 Date 07 April 2023
*/

import cput.za.ac.domain.User;
import cput.za.ac.factory.UserFactory;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;


import static org.junit.jupiter.api.Assertions.*;

@TestMethodOrder(MethodOrderer.MethodName.class)
class UserRepositoryTest {
    private static UserRepository repository = UserRepository.getRepository();
    private static User user = UserFactory.createUser("Asa", "Klaus", "07380646", "2160@mycpu.ac.za", "Gugulethu 7750" );
    @Test
    void a_create() {
        User created = repository.create(user);
        assertEquals(user.getUserId(), created.getUserId());
        System.out.println("Create: "+ created);
    }

    @Test
    void b_read() {

        User read = repository.read(user.getUserId());
        assertNotNull(read);
        System.out.println("Read" + read);
    }

    @Test
    void c_update() {
        User updated = new User.Builder().copy(user).setFirstname("Siwe").setLastname("John")
                .build();
        assertNotNull(repository.update(updated));
        System.out.println("Updated" + updated);
    }

    @Test
    void d_delete() {
        boolean success = repository.delete(user.getUserId());
        assertTrue(success);
        System.out.println("Deleted "+ success);
    }

    @Test
    void e_getAll(){
        System.out.println("Show all:");
        System.out.println(repository.getAll());
    }
}