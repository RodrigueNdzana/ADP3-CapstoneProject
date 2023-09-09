package cput.za.ac.Service.impl;
/*StudentServiceImplTest.Java
 Author: Bavuyise Mpila(216061067)
 Date September 2023
*/
import cput.za.ac.domain.Student;

import cput.za.ac.factory.StudentFactory;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;


@TestMethodOrder(MethodOrderer.MethodName.class)
@SpringBootTest

class StudentServiceImplTest {
    @Autowired
    private StudentServiceImpl service;
    private static Student student = StudentFactory.createStudent("Sinentle", "Mpi@2023",
            "216061089@mycput.ac.za");


    @Test
    void a_create() {
        Student created = service.create(student);
        assertEquals(student.getStudentNum(), created.getStudentNum());
        System.out.println("Created: " + created);
    }

    @Test
    void b_read() {
        Student read = service.read(student.getStudentNum());
        assertNotNull(read);
        System.out.println("Read: " + read);
    }

    @Test
    void c_update() {
        Student newStudent = new Student.Builder().copy(student).setName("Asekho").build();
        Student updated = service.update(newStudent);
        assertEquals(newStudent.getName(), updated.getName());
        System.out.println("Updated" + updated
        );

    }

    @Test
    @Disabled
    void d_delete() {
    }

    @Test
    void e_getAll() {
        System.out.println("Get all: ");
        System.out.println(service.getAll());
    }
}