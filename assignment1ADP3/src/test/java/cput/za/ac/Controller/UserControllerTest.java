package cput.za.ac.Controller;
import cput.za.ac.domain.User;

import cput.za.ac.factory.UserFactory;
import org.junit.jupiter.api.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;


class UserControllerTest {
    private static User user = UserFactory.createUser("Asanda","Mimi","0800555847",
            "asa@gmail.com", "NY 208 CPT");
    private TestRestTemplate restTemplate;
    private final String baseURL = "http://localhost:8080/user";

    /* @BeforeAll
      public static void setup(){

      }*/

    @Test
    @Order(1)
    void create() {
        String url = baseURL + "/create";
        ResponseEntity<User> postResponse = restTemplate.postForEntity(url, user,User.class);
        assertNotNull(postResponse);
        assertNotNull(postResponse.getBody());
        User savedUser = postResponse.getBody();
        System.out.println("Saved data:"+savedUser);
        assertEquals(user.getUserId(), savedUser.getUserId());
    }

    @Test
    @Order(2)
    void read() {
        String url = baseURL + "/read/"+ user.getUserId();
        System.out.println("URL:" +url);
        ResponseEntity<User> response = restTemplate.getForEntity(url, User.class);
        assertEquals(user.getUserId(), response.getBody().getUserId());
        System.out.println(response.getBody());
    }

    @Test
    @Order(3)
    void update() {
        User updated = new User.Builder().copy(user).setFirstname("Mihle").build();
        String url = baseURL + "update";
        System.out.println("URL. "+ url);
        System.out.println("Post data" + updated);
        ResponseEntity<User> response = restTemplate.postForEntity(url, updated, User.class);
        assertNotNull(response.getBody());
    }

    @Test
    @Order(3)
    @Disabled

    void delete() {
        String url = baseURL + "/delete" + user.getUserId();
        System.out.println("URL: "+ url);
        restTemplate.delete(url);

    }

    @Test
    void getall() {
        String url = baseURL + "/getall";
        HttpHeaders headers = new HttpHeaders();
        HttpEntity<String> entity = new HttpEntity<>(null, headers);
        HttpEntity<String> response = restTemplate.exchange(url, HttpMethod.GET, entity, String.class);
        System.out.println("Show ALL:");
        System.out.println(response);
        System.out.println(response.getBody());
    }
}