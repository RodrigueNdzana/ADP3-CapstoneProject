package cput.za.ac.factory;
/*   CourseFactoryTest.java
     FactoryTest  for course
     Author:Rodrigue Ndzana Ngonga Beaubane (219384096)
     Date: 07 April 2023
*/

import cput.za.ac.factory.CourseFactory;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import cput.za.ac.domain.Course;

import java.util.ArrayList;
import java.util.List;

class CourseFactoryTest {
    @Test
    void createCourse() {
        //adding the enrolled student to the course
        List<String> enrolledStudents = new ArrayList<>();

        enrolledStudents.add("Neilyn");
        enrolledStudents.add("Rodrigue");
        enrolledStudents.add("Mxolisi");
        enrolledStudents.add("Bavuyise");
        enrolledStudents.add("Anne");
        Course course = CourseFactory.createCourse("219384096", "ADP3", "Application Development Pratice 3", "Mr Kruben Naidoo", "Information Technology", "room 1.3", enrolledStudents);
        Assertions.assertNotNull(course);
        System.out.println(course.toString());
    }
}