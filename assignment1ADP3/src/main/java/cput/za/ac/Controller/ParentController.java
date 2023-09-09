package cput.za.ac.Controller;

import cput.za.ac.domain.Parent;
import cput.za.ac.Service.Interface.ParentService;

import java.util.List;

public class ParentController {
    private final ParentService parentService;

    public ParentController(ParentService parentService) {
        this.parentService = parentService;
    }

    public Parent createParent(int parent_id, String parent_name, String phone_number) {
        return parentService.createParent(parent_id, parent_name, phone_number);
    }

    public void deleteParent(int parentId) {
        parentService.deleteParent(parentId);
    }

    public Parent getParentById(int parentId) {
        return parentService.getParentById(parentId);
    }

    public List<Parent> getAllParents() {
        return parentService.getAllParents();
    }
}
