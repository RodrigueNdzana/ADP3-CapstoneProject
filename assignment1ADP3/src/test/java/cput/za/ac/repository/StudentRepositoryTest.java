package cput.za.ac.repository;

/*StudentRepositoryTest .java
 Author: Bavuyise Mpila(216061067)
 Date 07 April 2023
*/

import cput.za.ac.domain.Student;
import cput.za.ac.factory.StudentFactory;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;


import static org.junit.jupiter.api.Assertions.*;

@TestMethodOrder(MethodOrderer.MethodName.class)
class StudentRepositoryTest {
    private static StudentRepository repository = StudentRepository.getRepository();
    private static Student student = StudentFactory.createStudent("Amahle", "Cool2023", "2160@mycpu.ac.za");

    @Test
    void a_create() {
        Student created = repository.create(student);
        assertEquals(student.getStudentNum(), created.getStudentNum());
        System.out.println("Create: "+ created);
    }

    @Test
    void b_read() {
        Student read = repository.read(student.getStudentNum());
        assertNotNull(read);
        System.out.println("Read" + read);
    }

    @Test
    void c_update() {
        Student updated = new Student.Builder().copy(student).setName("Anam").setPassword("Saney257")
                .build();
        assertNotNull(repository.update(updated));
        System.out.println("Updated" + updated);
    }

    @Test
    void d_delete() {
        boolean success = repository.delete(student.getStudentNum());
        assertTrue(success);
        System.out.println("Deleted "+ success);
    }

    @Test
    void e_getAll() {
        System.out.println("Show all:");
        System.out.println(repository.getAll());
    }
}