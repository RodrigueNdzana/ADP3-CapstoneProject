package cput.za.ac.Service.Interface;

import cput.za.ac.Service.IService;
import cput.za.ac.domain.Course;

import java.util.List;
import java.util.Set;

public interface ICourseService extends IService<Course,String> {
    List<Course> getAll();
}
