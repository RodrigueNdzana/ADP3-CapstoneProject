package cput.za.ac.Service.impl;

import cput.za.ac.domain.Course;
import cput.za.ac.factory.CourseFactory;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@TestMethodOrder(MethodOrderer.MethodName.class)

class CoursesServiceImplTest {
    @Autowired
    private CoursesServiceImpl coursesService;
    //adding the enrolled student to the course
    private static Course course;

    @Test
    @Order(1)
    void create() {
        System.out.println("--------------- created a Course ------");
        //adding the enrolled student to the course
        List<String> enrolledStudents = new ArrayList<>();

        enrolledStudents.add("Neilyn");
        enrolledStudents.add("Rodrigue");
        enrolledStudents.add("Mxolisi");
        enrolledStudents.add("Bavuyise");
        enrolledStudents.add("Anne");
        course = CourseFactory.createCourse("219384096", "ADP3", "Application Development Pratice 3", "Mr Kruben Naidoo", "Information Technology", "room 1.3", enrolledStudents);

        assertNotNull(course);
        System.out.println(course);

    }

    @Test
    @Order(2)
    void read() {
        System.out.println("-------- Read data ---------");
       Course readCourse = coursesService.read(course.getCourse_code());
        assertNotNull(readCourse);
        System.out.println(readCourse);
        assertAll(() -> assertEquals(course.getCourse_code(),course.getCourse_code()));
        System.out.println();
    }

    @Order(3)
    @Test
    void update() {

    }

    @Test
    boolean delete(String course_Code) {
        boolean success = this.coursesService.delete(course.getCourse_code());
        return success;
    }

    @Test
    void getAll() {
    }
    @Test
    void getService() {
    }
}