package cput.za.ac.Controller;

import cput.za.ac.Service.impl.StudentServiceImpl;
import cput.za.ac.LoginDTO;
import cput.za.ac.LoginMesage;
import cput.za.ac.domain.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
/*
@RestController
@CrossOrigin
@RequestMapping("api/log/student")
public class LoginController {

        @Autowired
        private StudentServiceImpl studentService;
        @PostMapping(path = "/save")
        public String saveEmployee(@RequestBody Student student)
        {
            String id = studentService.addStudent(student);
            return id;
        }
        @PostMapping(path = "/login")
        public ResponseEntity<?> loginStudent(@RequestBody LoginDTO loginDTO)
        {
            LoginMesage loginResponse = studentService.loginStudent(loginDTO);
            return ResponseEntity.ok(loginResponse);
        }
    }

 */

