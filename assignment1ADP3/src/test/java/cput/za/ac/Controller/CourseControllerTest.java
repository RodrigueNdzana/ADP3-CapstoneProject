package cput.za.ac.Controller;

import cput.za.ac.domain.Course;
import cput.za.ac.domain.Educator;import cput.za.ac.factory.CourseFactory;

import org.junit.jupiter.api.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;


import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

@TestMethodOrder(MethodOrderer.MethodName.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class CourseControllerTest {

    //private static List<String> enrolledStudents = new ArrayList<>(List.of("Neilyn", "Rodrigue", "Mxolisi", "Bavuyise", "Anne"));
    private static Course course= CourseFactory.createCourse("219384096", "ADT 3", "Application Dvelopment Theory","Ms Allie","Information Development Technology","room 1.3",new ArrayList<>(List.of("Neilyn", "Rodrigue", "Mxolisi", "Bavuyise", "Anne")));

    @Autowired
    private TestRestTemplate restTemplate;
    private final String baseURL = "http://localhost:8080/course";
    @Test
    @Order(1)
    void create() {
        String url = baseURL + "/create";
        ResponseEntity<Course> postResponse = restTemplate.postForEntity(url, course,Course.class);
        assertNotNull(postResponse);
        assertNotNull(postResponse.getBody());
        Course savedCourse= postResponse.getBody();
        assertEquals(course.getCourse_code(), savedCourse.getCourse_code());
        System.out.println("Saved course:"+savedCourse);

        }

    @Test
    @Order(2)
    void read() {
        String url = baseURL + "/read/"+ course.getCourse_code();
        System.out.println("URL:" +url);
        ResponseEntity<Course> response = restTemplate.getForEntity(url, Course.class);
        assertEquals(course.getCourse_code(), response.getBody());
        //assertEquals(employee.getEmployeeNumber(), savedEmployee.getEmployeeNumber());
        System.out.println(response.getBody());
    }

    @Test
    @Order(3)
    void update() {
        Course updated = new Course.Builder().copy(course).setCourse_Name("Application Development Pratice")
                .setEducator("Mr Kruben Naidoo")
                .setCourse_code("ADP 3 ")
                .setClassName("room 1.27")
                .build();
        String url = baseURL + "update course";
        System.out.println("URL. "+ url);
        System.out.println("Post Educator data" + updated);
        ResponseEntity<Course> response = restTemplate.postForEntity(url, updated, Course.class);
        assertNotNull(response.getBody());
    }

    @Test
    @Order(4)
    @Disabled
    void delete() {
        String url = baseURL + "/delete" + course.getCourse_code();
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
        System.out.println("Show ALL course:");
        System.out.println(response);
        System.out.println(response.getBody());

    }
}