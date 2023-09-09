package cput.za.ac.Service.Interface;

import cput.za.ac.domain.Parent;

import java.util.List;

public interface ParentService {
    Parent createParent(int parent_id, String parent_name, String phone_number);

    void deleteParent(int parentId);

    Parent getParentById(int parentId);

    List<Parent> getAllParents();
}

