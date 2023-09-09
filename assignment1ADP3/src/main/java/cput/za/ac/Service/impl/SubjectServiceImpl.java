package cput.za.ac.Service.impl;

import cput.za.ac.Service.Interface.SubjectService;
import cput.za.ac.domain.subject;
import cput.za.ac.factory.subjectFactory;
import cput.za.ac.repository.SubjectRepository;

import java.util.List;

public class SubjectServiceImpl implements SubjectService {
    private final SubjectRepository subjectRepository;

    public SubjectServiceImpl() {
        subjectRepository = new SubjectRepository();
    }

    @Override
    public subject createSubject(String subject_code, String subject_name) {
        subject subject = subjectFactory.createSubject(subject_code, subject_name);
        subjectRepository.save(subject);
        return subject;
    }

    @Override
    public void deleteSubject(String subject_code) {
        subject subject = subjectRepository.findBySubjectCode(subject_code);
        if (subject != null) {
            subjectRepository.delete(subject);
        }
    }

    @Override
    public subject getSubjectByCode(String subject_code) {
        return subjectRepository.findBySubjectCode(subject_code);
    }

    @Override
    public List<subject> getAllSubjects() {
        return subjectRepository.findAll();
    }
}
