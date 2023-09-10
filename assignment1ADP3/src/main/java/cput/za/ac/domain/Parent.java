package cput.za.ac.domain;

import jakarta.persistence.*;

@Entity
public class Parent {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "parent id",length = 255)
    private final int parent_id;
    @Column(name="parent name", length = 255)
    private final String parent_name;
    @Column(name="parent number", length = 255)
    private final String phone_number;
    @Column(name="parent address", length = 255)
    private String Address;
    @Column(name="parent email", length = 255)
    private String email;
//    @Column(name=" number", length = 255)
//    private int number;

    public static class Builder {
        private int parent_id;
        private String parent_name;
        private String phone_number;

        public Builder parentId(int value) {
            parent_id = value;
            return this;
        }

        public Builder parentName(String value) {
            parent_name = value;
            return this;
        }

        public Builder phoneNumber(String value) {
            phone_number = value;
            return this;
        }

        public Parent build() {
            return new Parent(this);
        }
    }

    private Parent(Builder builder) {
        parent_id = builder.parent_id;
        parent_name = builder.parent_name;
        phone_number = builder.phone_number;
    }

    public int getParentId() {
        return parent_id;
    }

    public String getParentName() {
        return parent_name;
    }

    public String getPhoneNumber() {
        return phone_number;
    }
}
