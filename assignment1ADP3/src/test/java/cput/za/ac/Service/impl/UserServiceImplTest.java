package cput.za.ac.Service.impl;
/*UserServiceImplTest.Java
 Author: Bavuyise Mpila(216061067)
 Date September 2023
 */
import cput.za.ac.domain.User;
import cput.za.ac.factory.UserFactory;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class UserServiceImplTest {
    @Autowired
    private UserServiceImpl userservice;
    //private static User user = UserFactory.createUser("Bavuyise","Mpila", "0738064679","216061067@myucput.ac.za", "NY 63 No114"
   // );
    private static User user;
    @Test
    @Order(1)
    void create() {
         System.out.println("--------------- created User ------");
        //adding the enrolled student to the course
        List<String> users = new ArrayList<>();

        users.add("Neilyn");
        users.add("Rodrigue");
        users.add("Mxolisi");
        users.add("Bavuyise");
        users.add("Anne");
        user = UserFactory.createUser("Bavuyise","Mpila", "0738064679","216061067@myucput.ac.za", "NY 63 No114"
    );
        assertNotNull(user);
        System.out.println(user);

       /* User created = service.create(user);
        assertEquals(user.getUserId(), created.getUserId());
        System.out.println("Created: "+ created);*/
    }

    @Test
    @Order(2)
    void read() {
     System.out.println("-------- Read data ---------");
        User read = userservice.read(user.getUserId());
        assertNotNull(read);
        System.out.println("Read: " + read);


    }

    @Test
    void c_update() {
        User newUser = new User.Builder().copy(user).setFirstname("Luhlelunje").build();
        User updated =userservice.update(newUser);
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
        System.out.println(userservice.getAll());

    }
}

