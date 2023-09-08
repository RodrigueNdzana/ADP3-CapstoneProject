package cput.za.ac.repository;

/*StudentRepository .java
 Author: Bavuyise Mpila(216061067)
 Date 07 April 2023
*/


import cput.za.ac.domain.Student;

import java.util.HashSet;
import java.util.Set;
public class StudentRepository implements IStudentRepository{
    private static StudentRepository repository = null;
    private Set<Student> studentDB = null;
    private StudentRepository(){
        studentDB = new HashSet<Student>();
    }
    public static StudentRepository getRepository(){
        if(repository == null){
            repository = new StudentRepository();

        }
        return repository;
    }

    @Override
    public Student create(Student student) {
        boolean success = studentDB.add(student);
        if (!success)
            return null;
        return  student;

    }
    @Override
    public Student read(String studentNum) {
     /* linear or sequential search for (User u : userDB) {
          if (u.getUserId().equals(userId))
              return u;
     }
      return null;*/
        //lambda expressions
        Student student = studentDB.stream()
                .filter (s->s.getStudentNum().equals(studentNum))
                .findAny()
                .orElse(null);
        return student;

    }

    @Override
    public Student update(Student student) {
        Student oldStudent = read(student.getStudentNum());
        if (oldStudent!= null){
            studentDB.remove(oldStudent);
            studentDB.add(student);
            return student;
        }
        return null;

    }

    @Override
    public boolean delete(String studentNum) {
        Student studentToDelete = read(studentNum);
        if (studentToDelete== null)
            return false;
        studentDB.remove(studentToDelete);
        return true;
    }

    @Override
    public Set<Student> getAll() {

        return studentDB;
    }
}


