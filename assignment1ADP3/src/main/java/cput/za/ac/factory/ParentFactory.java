package cput.za.ac.factory;

import cput.za.ac.domain.Parent;

public class ParentFactory {
    public static Parent createParent(int parent_id, String parent_name, String phone_number) {
        return new Parent.Builder()
                .parentId(parent_id)
                .parentName(parent_name)
                .phoneNumber(phone_number)
                .build();
    }
    Parent parent = ParentFactory.createParent(1, "Enzo", "0719449412");
}
