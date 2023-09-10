package cput.za.ac.Service.impl;

import cput.za.ac.Service.Interface.SubjectService;
import cput.za.ac.domain.subject;
import cput.za.ac.repository.SubjectRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class SubjectServiceImplTest {
    private SubjectService subjectService;

    @BeforeEach
    void setUp() {
        subjectService = new SubjectServiceImpl();
    }

    @Test
    void testCreateSubject() {
        // Create a subject
        subject createdSubject = subjectService.createSubject("ADP360S", "Applications Development");

        // Retrieve the same subject
        subject retrievedSubject = subjectService.getSubjectByCode("ADP360S");

        assertNotNull(createdSubject);
        assertEquals("ADP360S", createdSubject.getSubjectCode());
        assertEquals("Applications Development", createdSubject.getSubjectName());

        // Make sure the retrieved subject matches the created subject
        assertNotNull(retrievedSubject);
        assertEquals(createdSubject, retrievedSubject);
    }

    @Test
    void testDeleteSubject() {
        // Create a subject
        subject createdSubject = subjectService.createSubject("MTH101", "Mathematics");

        // Delete the subject
        subjectService.deleteSubject("MTH101");

        // Attempt to retrieve the deleted subject
        subject deletedSubject = subjectService.getSubjectByCode("MTH101");

        assertNull(deletedSubject);
    }

    @Test
    void testGetAllSubjects() {
        // Create some subjects
        subjectService.createSubject("PHY202", "Physics");
        subjectService.createSubject("CHEM101", "Chemistry");

        // Retrieve all subjects
        List<subject> subjects = subjectService.getAllSubjects();

        assertNotNull(subjects);
        assertEquals(2, subjects.size());
    }
}
