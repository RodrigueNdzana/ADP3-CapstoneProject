package cput.za.ac.Service.impl;

import cput.za.ac.Service.Interface.ParentService;
import cput.za.ac.domain.Parent;
import cput.za.ac.repository.ParentRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class ParentServiceImplTest {
    private ParentService parentService;

    @BeforeEach
    void setUp() {
        parentService = new ParentServiceImpl();
    }

    @Test
    void testCreateParent() {
        // Create a parent
        Parent createdParent = parentService.createParent(1, "John Doe", "1234567890");

        // Retrieve the same parent
        Parent retrievedParent = parentService.getParentById(1);

        assertNotNull(createdParent);
        assertEquals(1, createdParent.getParentId());
        assertEquals("John Doe", createdParent.getParentName());
        assertEquals("1234567890", createdParent.getPhoneNumber());

        // Make sure the retrieved parent matches the created parent
        assertNotNull(retrievedParent);
        assertEquals(createdParent, retrievedParent);
    }

    @Test
    void testDeleteParent() {
        // Create a parent
        Parent createdParent = parentService.createParent(2, "Jane Doe", "9876543210");

        // Delete the parent
        parentService.deleteParent(2);

        // Attempt to retrieve the deleted parent
        Parent deletedParent = parentService.getParentById(2);

        assertNull(deletedParent);
    }

    @Test
    void testGetAllParents() {
        // Create some parents
        parentService.createParent(3, "Alice", "1111111111");
        parentService.createParent(4, "Bob", "2222222222");

        // Retrieve all parents
        List<Parent> parents = parentService.getAllParents();

        assertNotNull(parents);
        assertEquals(2, parents.size());
    }
}
