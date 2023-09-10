package cput.za.ac.domain;

import jakarta.persistence.*;

/*Student.java
 Entity for the Student
 Author: Bavuyise Mpila(216061067)
 Date 07 April 2023
*/
@Entity
public class Student {
    @Column(name = "subjectnumber")
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String studentNum;
    @Column(name="studentName", length = 255)
     private String name;
    @Column(name="studentPassword", length = 255)
    private String password;
    @Column(name="StudentEmail", length = 255)
    private String email;

    public Student(String studentNum, String name, String password, String email) {
        this.studentNum = studentNum;
        this.name = name;
        this.password = password;
        this.email = email;
    }

    private Student(Student.Builder builder){
        this.studentNum = builder.studentNum;
        this.name = builder.name;
        this.password = builder.password;
        this.email = builder.email;

    }

    public String getStudentNum() {
        return studentNum;
    }

    public void setStudentNum(String studentNum) {
        this.studentNum = studentNum;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentNum='" + studentNum + '\'' +
                ", name='" + name + '\'' +
                ", password='" + password + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
    public static class Builder{
        private String studentNum;
        private String name;
        private String password;
        private String email;

        public Builder setStudentNum(String studentNum) {
            this.studentNum = studentNum;
            return this;
        }

        public Builder  setName(String name) {
            this.name = name;
            return this;
        }

        public Builder  setPassword(String password) {
            this.password = password;
            return this;
        }

        public Builder setEmail(String email) {
            this.email = email;
            return this;
        }
        public Student.Builder copy(Student student) {
            this.studentNum = student.studentNum;
            this.name= student.name;
            this.password = student.password;
            this.email = student.email;
            return this;
        }
        public Student build(){
            return new Student(this);
        }

    }
}


