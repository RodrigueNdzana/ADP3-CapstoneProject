package cput.za.ac.repository;

import cput.za.ac.domain.subject;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SubjectRepository {
    private final Map<String, subject> subjects;

    public SubjectRepository() {
        subjects = new HashMap<>();
    }

    public void save(subject subject) {
        subjects.put(subject.getSubjectCode(), subject);
    }

    public void delete(subject subject) {
        subjects.remove(subject.getSubjectCode());
    }

    public subject findBySubjectCode(String subjectCode) {
        return subjects.get(subjectCode);
    }

    public List<subject> findAll() {
        return new ArrayList<>(subjects.values());
    }
}
