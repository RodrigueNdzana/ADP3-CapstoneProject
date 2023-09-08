package cput.za.ac.factory;
/*   CourseFactory.java
     Factory for the Course
     Author:Rodrigue Ndzana Ngonga Beaubane (219384096)
     Date: 07 April 2022
*/
import cput.za.ac.domain.Course;
import cput.za.ac.util.Helper;

import java.util.List;

public class CourseFactory {
    public static Course createCourse(String student_Id, String subject_Code, String course_Name, String educator, String department, String className, List<String> enrolledStudents) {
        if (Helper.isNullOrEmpty(student_Id) || Helper.isNullOrEmpty(subject_Code) || Helper.isNullOrEmpty(course_Name) || Helper.isNullOrEmpty(educator) || Helper.isNullOrEmpty(department) || Helper.isNullOrEmpty(className) || enrolledStudents.isEmpty()) {
            System.out.println("Fields can not be empty. Please make sure you enter all the value");
        }
        // generate a new course ID
        String course_code = Helper.generatedId();


        Course course = new Course.Builder()
                .setCourse_code(course_code)
                .setStudent_Id(student_Id)
                .setSubject_Code(subject_Code)
                .setCourse_Name(course_Name)
                .setEducator(educator)
                .setDepartment(department)
                .setClassName(className)
                .setEnrolledStudents(enrolledStudents)
                .build();
        return course;
    }
}
