package cput.za.ac.Controller;

import cput.za.ac.domain.subject;
import cput.za.ac.Service.Interface.SubjectService;

import java.util.List;

public class SubjectController {
    private final SubjectService subjectService;

    public SubjectController(SubjectService subjectService) {
        this.subjectService = subjectService;
    }

    public subject createSubject(String subject_code, String subject_name) {
        return subjectService.createSubject(subject_code, subject_name);
    }

    public void deleteSubject(String subject_code) {
        subjectService.deleteSubject(subject_code);
    }

    public subject getSubjectByCode(String subject_code) {
        return subjectService.getSubjectByCode(subject_code);
    }

    public List<subject> getAllSubjects() {
        return subjectService.getAllSubjects();
    }
}
