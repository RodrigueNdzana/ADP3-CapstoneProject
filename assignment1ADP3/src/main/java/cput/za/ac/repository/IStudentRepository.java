package cput.za.ac.repository;


/*IStudentRepository .java
 Author: Bavuyise Mpila(216061067)
 Date 07 April 2023
*/


import cput.za.ac.domain.Student;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Set;

public interface IStudentRepository extends JpaRepository<Student, String> {
    //public Set<Student> getAll();
}
