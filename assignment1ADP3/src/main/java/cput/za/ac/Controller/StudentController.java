package cput.za.ac.Controller;
/*StudentController.Java
 Author: Bavuyise Mpila(216061067)
 Date September 2023
*/

import cput.za.ac.Service.impl.StudentServiceImpl;

import cput.za.ac.domain.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/student")
public class StudentController {
    @Autowired
    private StudentServiceImpl studentService;
    @PostMapping("/create")
    public Student create (@RequestBody Student student){

        return studentService.create(student);
    }
    @GetMapping("/read/{id}")
    public Student read(@PathVariable String id) {
        return studentService.read(id);
    }
    @PostMapping("/update")
    public Student update(@RequestBody Student student) {
        return studentService.update(student);
    }
    @DeleteMapping("delete/{id}")
    public boolean delete(@PathVariable String id){
        return studentService.delete(id);
    }
    @GetMapping("/getall") /// NB is a set
    public List<Student> getall(){
        return studentService.getAll(); // return a set of user object
    }
}

