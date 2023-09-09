package cput.za.ac.Service.impl;
/*StudentServiceImpl.Java
 Author: Bavuyise Mpila(216061067)
 Date September 2023
*/
import cput.za.ac.Service.Interface.IStudentService;

import cput.za.ac.domain.Student;

import cput.za.ac.repository.IStudentRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements IStudentService {

    //private StudentServiceImpl service;
    private IStudentRepository repository;
    @Autowired
    private StudentServiceImpl(IStudentRepository repository){
        this.repository = repository;
    }

    @Override
    public Student create(Student student) {
        return this.repository.save(student);
    }

    @Override
    public Student read(String studentNum) {
        return this.repository.findById(studentNum).orElse(null);
    }

    @Override
    public Student update(Student student) {
        if (this.repository.existsById(student.getStudentNum())){
            // System.out.println("debug update: true");
            return this.repository.save(student);
        }
        return null;
    }
    @Override
    public boolean delete(String studentNum) {
        if(this.repository.existsById(studentNum)){
            this.repository.deleteById(studentNum);
            return true;
        }
        return false;
    }
    @Override
    public List<Student> getAll() {
        return this.repository.findAll();
    }

}

