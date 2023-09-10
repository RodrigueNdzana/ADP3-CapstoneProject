package cput.za.ac.Service.impl;

import cput.za.ac.Service.Interface.ParentService;
import cput.za.ac.domain.Parent;
import cput.za.ac.factory.ParentFactory;
import cput.za.ac.repository.ParentRepository;

import java.util.List;

public class ParentServiceImpl implements ParentService {
    private final ParentRepository parentRepository;

    public ParentServiceImpl() {
        parentRepository = new ParentRepository();
    }

    @Override
    public Parent createParent(int parent_id, String parent_name, String phone_number) {
        Parent parent = ParentFactory.createParent(parent_id, parent_name, phone_number);
        parentRepository.save(parent);
        return parent;
    }

    @Override
    public void deleteParent(int parentId) {
        Parent parent = parentRepository.findById(parentId);
        if (parent != null) {
            parentRepository.delete(parent);
        }
    }

    @Override
    public Parent getParentById(int parentId) {
        return parentRepository.findById(parentId);
    }

    @Override
    public List<Parent> getAllParents() {
        return parentRepository.findAll();
    }
}
