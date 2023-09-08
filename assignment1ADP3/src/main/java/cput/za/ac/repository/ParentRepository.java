package cput.za.ac.repository;

import cput.za.ac.domain.Parent;

import java.util.ArrayList;
import java.util.List;

public class ParentRepository {
    private final List<Parent> parents;

    public ParentRepository() {
        parents = new ArrayList<>();
    }

    public void save(Parent parent) {
        parents.add(parent);
    }

    public void delete(Parent parent) {
        parents.remove(parent);
    }

    public Parent findById(int parentId) {
        for (Parent parent : parents) {
            if (parent.getParentId() == parentId) {
                return parent;
            }
        }
        return null;
    }

    public List<Parent> findAll() {
        return parents;
    }
}

