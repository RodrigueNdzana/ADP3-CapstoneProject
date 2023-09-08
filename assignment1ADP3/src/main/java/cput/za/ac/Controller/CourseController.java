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
        private ICourseService coursesService;

        @PostMapping("/create")
        public Course create (@RequestBody Course course){
            return coursesService.create(course);
        }
        @GetMapping("/read/{id}")
        public Course read(@PathVariable String id) {
            return coursesService.read(id);
        }
        @PostMapping("/update")
        public Course update(@RequestBody Course course) {
            return coursesService.update(course);
        }
        @DeleteMapping("delete/{id}")
        public boolean delete(@PathVariable String id){
            return coursesService.delete(id);
        }
        @GetMapping("/getall") /// NB is a set
        public List<Course> getall(){
            return coursesService.getAll(); }
}
