package cput.za.ac.factory;

import cput.za.ac.domain.Educator;
import cput.za.ac.util.Helper;

public class EducatorFactory {
    public static Educator createEducator(String edu_Name, String edu_Address, String edu_Gender) {
        if (Helper.isNullOrEmpty(edu_Name) || Helper.isNullOrEmpty(edu_Address) || Helper.isNullOrEmpty(edu_Gender)) {
            System.out.println("Fields can not be empty. Please make sure you enter all the value");
        }

        String educator_Id = Helper.generatedId();
        Educator educator = (new Educator.Builder()).setEducator_Id(educator_Id).setEdu_Name(edu_Name).setEdu_Address(edu_Address).setEdu_Gender(edu_Gender).build();
        return educator;
    }
}
