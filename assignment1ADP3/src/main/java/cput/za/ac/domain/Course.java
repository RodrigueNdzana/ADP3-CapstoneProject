package cput.za.ac.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import java.io.Serializable;
import java.util.List;
import java.util.Objects;

/*   Course.java
     Entity for the Course
     Author:Rodrigue Ndzana Ngonga Beaubane (219384096)
     Date: 07 April 2023
*/
@Entity
public class Course{
    @Id
    private String course_code;

    private String student_Id;
    private String subject_Code;
    private String course_Name;
    private String educator;
    private String department;
    private String className;
    private List<String> enrolledStudents;

    private Course(){

    }
    private Course(Builder builder){
        this.course_code = builder.course_code;
        this.student_Id = builder.student_Id;
        this.subject_Code = builder.subject_Code;
        this.course_Name = builder.course_Name;
        this.educator= builder.educator;
        this.department = builder.department;
        this.className = builder.className;
        this.enrolledStudents = builder.enrolledStudents;
    }
    public String getCourse_code() {
        return course_code;
    }

    public String getStudent_Id() {
        return student_Id;
    }

    public String getSubject_Code() {
        return subject_Code;
    }

    public String getCourse_Name() {
        return course_Name;
    }

    public String getEducator() {
        return educator;
    }

    public String getDepartment() {
        return department;
    }

    public String getClassName() {
        return className;
    }

    public List<String> getEnrolledStudents() {
        return enrolledStudents;
    }
    public static class Builder{
        private String course_code;
        private String student_Id;
        private String subject_Code;
        private String course_Name;
        private String educator;
        private String department;
        private String className;
        private List<String> enrolledStudents;

        public Builder setCourse_code(String course_code) {
            this.course_code = course_code;
            return this;
        }

        public Builder setStudent_Id(String student_Id) {
            this.student_Id = student_Id;
            return this;
        }

        public Builder setSubject_Code(String subject_Code) {
            this.subject_Code = subject_Code;
            return this;
        }

        public Builder setCourse_Name(String course_Name) {
            this.course_Name = course_Name;
            return this;
        }

        public Builder setEducator(String educator) {
            this.educator = educator;
            return this;
        }

        public Builder setDepartment(String department) {
            this.department = department;
            return this;
        }

        public Builder setClassName(String className) {
            this.className = className;
            return this;
        }

        public Builder setEnrolledStudents(List<String> enrolledStudents) {
            this.enrolledStudents = enrolledStudents;
            return this;
        }
        public Builder copy(Course course){
            this.course_code = course.course_code;
            this.student_Id= course.student_Id;
            this.subject_Code = course.subject_Code;
            this.course_Name = course.course_Name;
            this.educator = course.educator;
            this.department = course.department;
            this.className = course.className;
            this.enrolledStudents= course.enrolledStudents;
            return this;
        }
        public Course build(){
            return new Course(this);
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Course course = (Course) o;
        return Objects.equals(course_code, course.course_code) && Objects.equals(student_Id, course.student_Id) && Objects.equals(subject_Code, course.subject_Code) && Objects.equals(course_Name, course.course_Name) && Objects.equals(educator, course.educator) && Objects.equals(department, course.department) && Objects.equals(className, course.className) && Objects.equals(enrolledStudents, course.enrolledStudents);
    }

    @Override
    public int hashCode() {
        return Objects.hash(course_code, student_Id, subject_Code, course_Name, educator, department, className, enrolledStudents);
    }

    @Override
    public String toString() {
        return "Course{" +
                "course_code='" + course_code + '\'' +
                ", student_Id='" + student_Id + '\'' +
                ", subject_Code='" + subject_Code + '\'' +
                ", course_Name='" + course_Name + '\'' +
                ", educator='" + educator + '\'' +
                ", department='" + department + '\'' +
                ", className='" + className + '\'' +
                ", enrolledStudents=" + enrolledStudents +
                '}';
    }
}
