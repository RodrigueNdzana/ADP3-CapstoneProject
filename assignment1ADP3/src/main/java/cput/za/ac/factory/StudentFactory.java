package cput.za.ac.factory;

/*StudentFactory.java
 Author: Bavuyise Mpila(216061067)
 Date 07 April 2023
*/

import cput.za.ac.domain.Student;
import cput.za.ac.util.Helper;

public class StudentFactory {
    public static Student createStudent(String name, String password, String email){
        String studentNum = Helper.generatedId();
//        if (!Helper.isValidEmail(email))
//            return null;

        //if (Helper.isNullorEmpty(userId)||Helper.isNullorEmpty(firstName) ||Helper.isNullorEmpty(lastName)||Helper.isNullorEmpty(phoneNum)
        //||Helper.isNullorEmpty(address) )
        // return null;

        Student student= new Student.Builder().setStudentNum(studentNum)
                .setName(name)
                .setPassword(password)
                .setEmail(email)
                .build();
        return student;
    }
}

