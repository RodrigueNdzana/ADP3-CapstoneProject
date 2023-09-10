package cput.za.ac.Controller;
/*StudentController.Java
 Author: Bavuyise Mpila(216061067)
 Date September 2023

 */
import cput.za.ac.Service.impl.StudentServiceImpl;

import cput.za.ac.domain.Student;
import cput.za.ac.repository.IStudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@Controller
@CrossOrigin(origins = "http://localhost:3000") // allowing cross resource sharing on the server
@RequestMapping("/student")
public class StudentController {
    @Autowired
    private IStudentRepository studentService;

    // check if api woking
    @RequestMapping(value="check",method = RequestMethod.GET)
    @ResponseBody
    public String check(){
        return "api is working";
    }
    @RequestMapping(value="/addingStudent",method = RequestMethod.POST)
    @ResponseBody
    public Student addStudent(Student student) {
        return studentService.save(student);
    }

    @RequestMapping(value="/findingStudent",method = RequestMethod.GET)
    @ResponseBody
    public Student findByStudentNumber(@RequestParam("studentNum") String studentNum ) {
        return studentService.findByStudentNumber(studentNum);
    }
    @RequestMapping(value="/updatingStudent",method = RequestMethod.GET)
    @ResponseBody
    public Student updateStudent(@RequestBody Student student) {
        return studentService.save(student);
    }

    @RequestMapping(value="/deletingStudent",method = RequestMethod.GET)
    @ResponseBody
    public String deleteStudent(@RequestParam("studentNum") String studentNum) {
        studentService.deleteById(studentNum);
        return studentNum;
    }

//    @GetMapping("/getall") /// NB is a set
//    public List<Student> getall() {
//        //return studentService.getAll(); // return a set of user object
//    }


}


