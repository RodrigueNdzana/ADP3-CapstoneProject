package cput.ac.za.repository;
/*   CourseRepositoryTest.java
     Repository test for the Course
     Author:Rodrigue Ndzana Ngonga Beaubane (219384096)
     Date: 07 April 2023


import cput.za.ac.domain.Course;
import cput.za.ac.factory.CourseFactory;
//import cput.za.ac.repository.CourseRepository;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

import static org.junit.jupiter.api.Assertions.*;


import java.util.ArrayList;
import java.util.List;

@TestMethodOrder(MethodOrderer.MethodName.class) // help in testing our CRUD method in Alphabetically order
class CourseRepositoryTest {
    private static CourseRepository repository = CourseRepository.getRepository();
    public static List<String> enrolledStudents = new ArrayList<>(List.of("Neilyn", "Rodrigue", "Mxolisi", "Bavuyise", "Anne"));

    private Course course = CourseFactory.createCourse("Ctre45223", "ADP32S", "ADP3", "Mr Kruben Naidoo", "Information Technology", "room 1.3", enrolledStudents);

    @Test
    void a_create() {
        System.out.println("------------------------- Create Course ----------------------------------------");
        // since I have already created the repository now I am adding to the repository
        Course created = repository.create(course);
        // the assertEquals kinda check if the Course_code() we are getting from the Course repository is the same with the one created
        assertEquals(course.getCourse_code(), created.getCourse_code());
        System.out.println("Create Course: " + created+"\n");
    }

    @Test
    void b_read() {
        System.out.println("------------------------- Read Course ----------------------------------------");
        Course readCourse = repository.read(course.getCourse_code());
        assertNotNull(readCourse);
        System.out.println("Read Course: " + readCourse+"\n");
    }

    @Test
    void c_update() {
        System.out.println("------------------------- Update Course ----------------------------------------");
        List<String> updatedStudents = new ArrayList<>(List.of("Micheal", "Veronica", "Taina", "Voyutto", "Christelle"));
        // everything change here since we have to give in values
        Course updated = new Course.Builder().copy(course).setStudent_Id("TRe450012")
                .setSubject_Code("ITS345S")
                .setCourse_Name("ITS3")
                .setEducator("Ms Zietman")
                .setDepartment("Enviromental Science")
                .setDepartment("Electical Engineering")
                .setClassName("room E45")
                .setEnrolledStudents(updatedStudents)
                .build();
        assertNotNull(repository.update(updated)); // if this object return null that mean it going to fail
        System.out.println("updated Course: " + updated+"\n");
    }

    @Test
    void d_delete() {
        System.out.println("------------------------- Delete Course ----------------------------------------");
        boolean success = repository.delete(course.getCourse_code());
        assertTrue(success);
        System.out.println("Delete: " + success+"\n");
    }

    @Test
    void e_getAll() {
        System.out.println("------------------------- Show all Course ----------------------------------------");
        System.out.println("Show all: ");
        System.out.println(repository.getAll()+"\n");
    }

}

 */