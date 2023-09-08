package cput.za.ac.Service.impl;

import cput.za.ac.Service.Interface.ICourseService;
import cput.za.ac.domain.Course;
//import cput.za.ac.repository.CourseRepository;
import cput.za.ac.repository.ICourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Set;
@Service
public class CoursesServiceImpl implements ICourseService {
    //private CoursesServiceImpl service;

    private ICourseRepository repository;
    @Autowired
    private CoursesServiceImpl(ICourseRepository repository){
        this.repository = repository;
    }

    @Override
    public Course create(Course course) {
        return this.repository.save(course);
    }

    @Override
    public Course read(String course_Code) {
        return this.repository.findById(course_Code).orElse(null);
}

    @Override
    public Course update(Course course) {
        if (this.repository.existsById(course.getCourse_code())){
            // System.out.println("debug update: true");
            return this.repository.save(course);
        }
        return null;
    }

    @Override
    public boolean delete(String course_code) {
        if(this.repository.existsById(course_code)){
            this.repository.deleteById(course_code);
            return true;
        }
        return false;
    }

    @Override
    public List<Course> getAll() {
        return this.repository.findAll();
    }
}
