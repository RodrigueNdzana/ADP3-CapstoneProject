package cput.za.ac.Controller;

import cput.za.ac.domain.Educator;
import cput.za.ac.factory.EducatorFactory;
import org.junit.jupiter.api.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;

import static org.junit.jupiter.api.Assertions.*;

@TestMethodOrder(MethodOrderer.MethodName.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)

class EducatorControllerTest {
    private static Educator educator= EducatorFactory.createEducator("Marco","34 Richmond street","Male");
    @Autowired
    private TestRestTemplate restTemplate;
    private final String baseURL = "http://localhost:8080/educator";

    @Test
    @Order(1)
    void create() {
        String url = baseURL + "/create";
        ResponseEntity<Educator> postResponse = restTemplate.postForEntity(url, educator,Educator.class);
        assertNotNull(postResponse);
        assertNotNull(postResponse.getBody());
        Educator savedEducator= postResponse.getBody();
        System.out.println("Saved educator:"+savedEducator);
        assertEquals(educator.getEducator_Id(), savedEducator.getEducator_Id());



    }


    @Test
    @Order(2)
    void read() {
        String url = baseURL + "/read/"+ educator.getEducator_Id();
        System.out.println("URL:" +url);
        ResponseEntity<Educator> response = restTemplate.getForEntity(url, Educator.class);

        assertEquals(educator.getEducator_Id(), response.getBody().getEducator_Id());
        System.out.println(response.getBody());
    }


    @Test
    @Order(3)
    void update() {
        Educator updated = new Educator.Builder().copy(educator).setEdu_Address("53 Richmond street")
                .setEdu_Gender("Female")
                .setEdu_Name("Laurence Moore")
                .build();
        String url = baseURL + "update";
        System.out.println("URL. "+ url);
        System.out.println("Post Educator data" + updated);
        ResponseEntity<Educator> response = restTemplate.postForEntity(url, updated, Educator.class);
        assertNotNull(response.getBody());
    }


    @Test
    @Order(4)
    @Disabled
    void delete() {
        String url = baseURL + "/delete" + educator.getEducator_Id();
        System.out.println("URL: "+ url);
        restTemplate.delete(url);
    }

    @Order(4)
    @Test
    void getall() {
        String url = baseURL + "/getall";
        HttpHeaders headers = new HttpHeaders();
        HttpEntity<String> entity = new HttpEntity<>(null, headers);
        HttpEntity<String> response = restTemplate.exchange(url, HttpMethod.GET, entity, String.class);
        System.out.println("Show ALL educator:");
        System.out.println(response);
        System.out.println(response.getBody());

    }
}