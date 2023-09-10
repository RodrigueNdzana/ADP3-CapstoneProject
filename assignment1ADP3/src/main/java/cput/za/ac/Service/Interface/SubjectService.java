package cput.za.ac.Service.Interface;

import cput.za.ac.domain.subject;

import java.util.List;

public interface SubjectService {
    subject createSubject(String subject_code, String subject_name);

    void deleteSubject(String subject_code);

    subject getSubjectByCode(String subject_code);

    List<subject> getAllSubjects();
}
