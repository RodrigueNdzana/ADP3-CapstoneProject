package cput.za.ac.Service.impl;
/*StudentServiceImpl.Java
 Author: Bavuyise Mpila(216061067)
 Date September 2023
*/
import cput.za.ac.Service.Interface.IStudentService;

import cput.za.ac.LoginDTO;
import cput.za.ac.LoginMesage;
import cput.za.ac.domain.Student;

import cput.za.ac.repository.IStudentRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class StudentServiceImpl {

    //private StudentServiceImpl service;
    // @Autowired
    //private IStudentRepository repository;

    //    @Autowired
//    private StudentServiceImpl(IStudentRepository repository){
//        this.repository = repository;
//    }
//    @Autowired
//    private PasswordEncoder passwordEncoder;
    //@Override
//    public String addStudent(Student student) {
//        Student studentAdd = new Student(
//                student.getStudentNum(),
//                student.getName(),
//                student.getPassword(),
//                student.getEmail()
//                //this.passwordEncoder.encode(student.getPassword())
//        );
//        repository.save(student);
//        return student.getStudentNum();
//    }
//
//    Student student;
//
//    //@Override
//    public LoginMesage loginStudent(LoginDTO loginDTO) {
//        String msg = "";
//        Student student1 = repository.findByEmail(loginDTO.getEmail());
//        if (student1 != null) {
//            String password = loginDTO.getPassword();
//            String encodedPassword = student1.getPassword();
////            Boolean isPwdRight = passwordEncoder.matches(password, encodedPassword);
////            if (isPwdRight) {
////                Optional<Student> student = repository.findOneByEmailAndPassword(loginDTO.getEmail(), encodedPassword);
////                if (student.isPresent()) {
////                    return new LoginMesage("Login Success", true);
////                } else {
////                    return new LoginMesage("Login Failed", false);
////                }
////            } else {
////                return new LoginMesage("password Not Match", false);
////            }
////        }else {
////            return new LoginMesage("Email not exits", false);
////        }
////        }}
//    /*
//    @Override
//    public Student create(Student student) {
//        return this.repository.save(student);
//    }
//
//    @Override
//    public Student read(String studentNum) {
//        return this.repository.findById(studentNum).orElse(null);
//    }
//
//    @Override
//    public Student update(Student student) {
//        if (this.repository.existsById(student.getStudentNum())){
//            // System.out.println("debug update: true");
//            return this.repository.save(student);
//        }
//        return null;
//    }
//    @Override
//    public boolean delete(String studentNum) {
//        if(this.repository.existsById(studentNum)){
//            this.repository.deleteById(studentNum);
//            return true;
//        }
//        return false;
//    }
//    @Override
//    public List<Student> getAll() {
//        return this.repository.findAll();
//    }
//
}