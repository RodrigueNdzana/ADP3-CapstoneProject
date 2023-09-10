package cput.za.ac.domain;
/*   Educator.java
     Entity for the Educator
     Author:Rodrigue Ndzana Ngonga Beaubane (219384096)
     Date: 07 April 2023
*/

import java.util.Objects;

import jakarta.persistence.*;

@Entity
public class Educator {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="educator id", length = 255)
    private String educator_Id;
    @Column(name="educator name", length = 255)
    private String edu_Name;
    @Column(name="educator address", length = 255)
    private String edu_Address;

    @Column(name="educator gender", length = 255)
    private String edu_Gender;

   public Educator(){}

    public Educator(Builder builder){
        this.educator_Id = builder.educator_Id;
        this.edu_Name = builder.edu_Name;
        this.edu_Address = builder.edu_Address;
        this.edu_Gender = builder.edu_Gender;

    }
    public String getEducator_Id() {
        return educator_Id;
    }

    public String getEdu_Name() {
        return edu_Name;
    }

    public String getEdu_Address() {
        return edu_Address;
    }

    public String getEdu_Gender() {
        return edu_Gender;
    }
    public static class Builder{
        private String educator_Id;
        private String edu_Name;
        private String edu_Address;
        private String edu_Gender;

        // generate-insert the setter and make it return the Builder object instead of Void

        public Builder setEducator_Id(String educator_Id) {
            this.educator_Id = educator_Id;
            return this;
        }

        public Builder setEdu_Name(String edu_Name) {
            this.edu_Name = edu_Name;
            return this;
        }

        public Builder setEdu_Address(String edu_Address) {
            this.edu_Address = edu_Address;
            return this;
        }

        public Builder setEdu_Gender(String edu_Gender) {
            this.edu_Gender = edu_Gender;
            return this;
        }
        // inside the Builder class add the copy method to return the the copy of the class
        public Builder copy(Educator educator){
            this.educator_Id = educator.educator_Id;
            this.edu_Name = educator.edu_Name;
            this.edu_Address =educator.edu_Address;
            this.edu_Gender= educator.edu_Gender;
            return this;
        }
        public Educator build(){
            return new Educator(this);
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Educator educator = (Educator) o;
        return educator_Id == educator.educator_Id && Objects.equals(edu_Name, educator.edu_Name) && Objects.equals(edu_Address, educator.edu_Address) && Objects.equals(edu_Gender, educator.edu_Gender);
    }

    @Override
    public int hashCode() {
        return Objects.hash(educator_Id, edu_Name, edu_Address, edu_Gender);
    }

    @Override
    public String toString() {
        return "Educator{" +
                "educator_Id=" + educator_Id +
                ", edu_Name='" + edu_Name + '\'' +
                ", edu_Address='" + edu_Address + '\'' +
                ", edu_Gender='" + edu_Gender + '\'' +
                '}';
    }
}
