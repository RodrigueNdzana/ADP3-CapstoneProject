package cput.za.ac.factory;

import cput.za.ac.domain.Parent;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ParentFactoryTest {

    @Test
    public void testCreateParent() {
        // Arrange
        int parent_id = 1;
        String parent_name = "Enzo";
        String phone_number = "0719449412";

        // Act
        Parent parent = ParentFactory.createParent(parent_id, parent_name, phone_number);

        // Assert
        Assertions.assertNotNull(parent);
        Assertions.assertEquals(parent_id, parent.getParentId());
        Assertions.assertEquals(parent_name, parent.getParentName());
        Assertions.assertEquals(phone_number, parent.getPhoneNumber());
    }
}
