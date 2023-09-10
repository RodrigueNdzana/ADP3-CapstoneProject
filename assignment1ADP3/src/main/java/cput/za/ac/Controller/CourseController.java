package cput.za.ac.Controller;

import cput.za.ac.Service.Interface.ICourseService;
import cput.za.ac.Service.impl.CoursesServiceImpl;
import cput.za.ac.Service.impl.EducatorServiceImpl;
import cput.za.ac.domain.Course;
import cput.za.ac.domain.Educator;
import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
//@EnableJpaRepositories
@RequestMapping("/course")
public class CourseController {
        @Autowired
        public ICourseService coursesService;

        @PostMapping("/create")
        public Course create (@RequestBody Course course){
            return coursesService.create(course);
        }
        @GetMapping("/read/{course_code}")
        public Course read(@PathVariable String course_code) {
            return coursesService.read(course_code);
        }
        @PostMapping("/update")
        public Course update(@RequestBody Course course) {
            return coursesService.update(course);
        }
        @DeleteMapping("delete/{course_code}")
        public boolean delete(@PathVariable String course_code){
            return coursesService.delete(course_code);
        }
        @GetMapping("/getall") /// NB is a set
        public List<Course> getall(){
            return coursesService.getAll(); }
}
