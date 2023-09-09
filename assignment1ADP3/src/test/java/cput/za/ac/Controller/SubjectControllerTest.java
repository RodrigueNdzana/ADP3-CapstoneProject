package cput.za.ac.Controller;

import cput.za.ac.Controller.SubjectController;
import cput.za.ac.Service.Interface.SubjectService;
import cput.za.ac.domain.subject;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class SubjectControllerTest {
    private SubjectController subjectController;

    @BeforeEach
    void setUp() {
        // Create a mock SubjectService for testing
        SubjectService subjectService = new MockSubjectService();
        subjectController = new SubjectController(subjectService);
    }

    @Test
    void testCreateSubject() {
        subject createdSubject = subjectController.createSubject("ADP360S", "Applications Development");

        assertNotNull(createdSubject);
        assertEquals("ADP360S", createdSubject.getSubjectCode());
        assertEquals("Applications Development", createdSubject.getSubjectName());
    }

    @Test
    void testDeleteSubject() {
        subjectController.createSubject("MTH101", "Mathematics");

        subjectController.deleteSubject("MTH101");

        subject deletedSubject = subjectController.getSubjectByCode("MTH101");
        assertNull(deletedSubject);
    }

    @Test
    void testGetSubjectByCode() {
        subjectController.createSubject("PHY202", "Physics");

        subject retrievedSubject = subjectController.getSubjectByCode("PHY202");

        assertNotNull(retrievedSubject);
        assertEquals("PHY202", retrievedSubject.getSubjectCode());
        assertEquals("Physics", retrievedSubject.getSubjectName());
    }

    @Test
    void testGetAllSubjects() {
        subjectController.createSubject("CHEM101", "Chemistry");
        subjectController.createSubject("BIO101", "Biology");

        List<subject> subjects = subjectController.getAllSubjects();

        assertNotNull(subjects);
        assertEquals(2, subjects.size());
    }

    // Mock SubjectService for testing
    private static class MockSubjectService implements SubjectService {
        private final List<subject> subjectList = new java.util.ArrayList<>();

        @Override
        public subject createSubject(String subject_code, String subject_name) {
            subject subject = new subject.Builder()
                    .subjectCode(subject_code)
                    .subjectName(subject_name)
                    .build();
            subjectList.add(subject);
            return subject;
        }

        @Override
        public void deleteSubject(String subject_code) {
            subject subject = getSubjectByCode(subject_code);
            if (subject != null) {
                subjectList.remove(subject);
            }
        }

        @Override
        public subject getSubjectByCode(String subject_code) {
            return subjectList.stream()
                    .filter(s -> s.getSubjectCode().equals(subject_code))
                    .findFirst()
                    .orElse(null);
        }

        @Override
        public List<subject> getAllSubjects() {
            return subjectList;
        }
    }
}
