package cput.za.ac.Controller;
/*StudentControllerTest.Java
 Author: Bavuyise Mpila(216061067)
 Date September 2023
*/


import cput.za.ac.domain.Student;
import cput.za.ac.factory.StudentFactory;
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
class StudentControllerTest {
    private static Student student = StudentFactory.createStudent("Sinentle", "Mpi@2023",
            "216061089@mycput.ac.za");
    @Autowired
    private TestRestTemplate restTemplate;
    private final String baseURL = "http://localhost:8080/student";

    /* @BeforeAll
      public static void setup(){

      }*/
    @Test
    @Order(1)

    void create() {
        String url = baseURL + "/create";
        ResponseEntity<Student> postResponse = restTemplate.postForEntity(url, student,Student.class);
        assertNotNull(postResponse);
        assertNotNull(postResponse.getBody());
        Student savedStudent = postResponse.getBody();
        System.out.println("Saved data:"+savedStudent);
        assertEquals(student.getStudentNum(), savedStudent.getStudentNum());

    }

    @Test
    @Order(2)
    void read() {
        String url = baseURL + "/read/"+ student.getStudentNum();
        System.out.println("URL:" +url);
        ResponseEntity<Student> response = restTemplate.getForEntity(url, Student.class);
        assertEquals(student.getStudentNum(), response.getBody().getStudentNum());
        System.out.println(response.getBody());
    }

    @Test
    @Order(3)
    void update() {
        Student updated = new Student.Builder().copy(student).setName("Zingce").build();
        String url = baseURL + "update";
        System.out.println("URL. "+ url);
        System.out.println("Post data" + updated);
        ResponseEntity<Student> response = restTemplate.postForEntity(url, updated, Student.class);
        assertNotNull(response.getBody());
    }

    @Test
    @Order(4)
    @Disabled

    void delete() {
        String url = baseURL + "/delete" + student.getStudentNum();
        System.out.println("URL: "+ url);
        restTemplate.delete(url);
    }

    @Test
    @Order(5)
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