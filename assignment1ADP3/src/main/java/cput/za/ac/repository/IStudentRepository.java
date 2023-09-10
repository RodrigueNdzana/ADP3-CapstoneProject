package cput.za.ac.repository;


/*IStudentRepository .java
 Author: Bavuyise Mpila(216061067)
 Date 07 April 2023
*/


import cput.za.ac.domain.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
import java.util.Set;
@Repository
public interface IStudentRepository extends JpaRepository<Student, String> {
    //public Set<Student> getAll();
    List<Student> findAll();
    Student findByStudentNum(String StudentNum);
}
