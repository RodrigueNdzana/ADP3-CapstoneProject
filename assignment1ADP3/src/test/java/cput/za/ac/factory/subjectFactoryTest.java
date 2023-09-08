package cput.za.ac.factory;

import cput.za.ac.domain.subject;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class subjectFactoryTest {

    @Test
    public void testCreateSubject() {
        // Arrange
        String subject_code = "ADP360S";
        String subject_name = "Applications Development";

        // Act
        subject subject = subjectFactory.createSubject(subject_code, subject_name);

        // Assert
        Assertions.assertNotNull(subject);
        Assertions.assertEquals(subject_code, subject.getSubjectCode());
        Assertions.assertEquals(subject_name, subject.getSubjectName());
    }
}
