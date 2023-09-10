package cput.za.ac.Controller;

import cput.za.ac.Controller.ParentController;
import cput.za.ac.domain.Parent;
import cput.za.ac.Service.Interface.ParentService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class ParentControllerTest {
    private ParentController parentController;

    @BeforeEach
    void setUp() {
        // Create a mock ParentService for testing
        ParentService parentService = new MockParentService();
        parentController = new ParentController(parentService);
    }

    @Test
    void testCreateParent() {
        Parent createdParent = parentController.createParent(1, "John Doe", "1234567890");

        assertNotNull(createdParent);
        assertEquals(1, createdParent.getParentId());
        assertEquals("John Doe", createdParent.getParentName());
        assertEquals("1234567890", createdParent.getPhoneNumber());
    }

    @Test
    void testDeleteParent() {
        parentController.createParent(2, "Jane Doe", "9876543210");

        parentController.deleteParent(2);

        Parent deletedParent = parentController.getParentById(2);
        assertNull(deletedParent);
    }

    @Test
    void testGetParentById() {
        parentController.createParent(3, "Alice", "1111111111");

        Parent retrievedParent = parentController.getParentById(3);

        assertNotNull(retrievedParent);
        assertEquals(3, retrievedParent.getParentId());
        assertEquals("Alice", retrievedParent.getParentName());
        assertEquals("1111111111", retrievedParent.getPhoneNumber());
    }

    @Test
    void testGetAllParents() {
        parentController.createParent(4, "Bob", "2222222222");
        parentController.createParent(5, "Eve", "3333333333");

        List<Parent> parents = parentController.getAllParents();

        assertNotNull(parents);
        assertEquals(2, parents.size());
    }

    // Mock ParentService for testing
    private static class MockParentService implements ParentService {
        private final List<Parent> parentList = new java.util.ArrayList<>();

        @Override
        public Parent createParent(int parent_id, String parent_name, String phone_number) {
            Parent parent = new Parent.Builder()
                    .parentId(parent_id)
                    .parentName(parent_name)
                    .phoneNumber(phone_number)
                    .build();
            parentList.add(parent);
            return parent;
        }

        @Override
        public void deleteParent(int parentId) {
            Parent parent = getParentById(parentId);
            if (parent != null) {
                parentList.remove(parent);
            }
        }

        @Override
        public Parent getParentById(int parentId) {
            return parentList.stream()
                    .filter(p -> p.getParentId() == parentId)
                    .findFirst()
                    .orElse(null);
        }

        @Override
        public List<Parent> getAllParents() {
            return parentList;
        }
    }
}
