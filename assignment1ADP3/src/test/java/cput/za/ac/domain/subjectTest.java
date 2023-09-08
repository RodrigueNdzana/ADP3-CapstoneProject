package cput.za.ac.domain;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
class SubjectTest {
    @Test
    void testGetSubjectCode() {
        subject subject = new subject.Builder()
                .subjectCode("ADP360S")
                .subjectName("Applications Development")
                .build();
        Assertions.assertEquals("ADP360S", subject.getSubjectCode());
    }

    @Test
    void testGetSubjectName() {
        subject subject = new subject.Builder()
                .subjectCode("ADP360S")
                .subjectName("Applications Development")
                .build();
        Assertions.assertEquals("Applications Development", subject.getSubjectName());
    }

}