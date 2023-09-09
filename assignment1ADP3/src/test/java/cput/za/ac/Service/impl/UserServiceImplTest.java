package cput.za.ac.Service.impl;
/*UserServiceImplTest.Java
 Author: Bavuyise Mpila(216061067)
 Date September 2023
*/
import cput.za.ac.domain.User;
import cput.za.ac.factory.UserFactory;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserServiceImplTest {
    private UserServiceImpl service;
    private static User user = UserFactory.createUser("Bavuyise","Mpila", "0738064679","216061067@myucput.ac.za", "NY 63 No114"
    );

    @Test
    void a_create() {
        User created = service.create(user);
        assertEquals(user.getUserId(), created.getUserId());
        System.out.println("Created: "+ created);
    }

    @Test
    void b_read() {
        User read = service.read(user.getUserId());
        assertNotNull(read);
        System.out.println("Read: " + read);
    }

    @Test
    void c_update() {
        User newUser = new User.Builder().copy(user).setFirstname("Luhlelunje").build();
        User updated =service.update(newUser);
        assertEquals(newUser.getFirstname(), updated.getFirstname());
        System.out.println("Updated" + updated
        );
    }

    @Test
    @Disabled
    void d_delete() {
    }

    @Test
    void e_getAll() {
        System.out.println("Get all: ");
        System.out.println(service.getAll());

    }
}