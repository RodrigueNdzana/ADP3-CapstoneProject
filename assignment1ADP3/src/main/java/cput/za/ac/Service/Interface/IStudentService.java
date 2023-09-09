package cput.za.ac.Service.Interface;
/*IStudentService.Java
 Author: Bavuyise Mpila(216061067)
 Date September 2023
*/
import cput.za.ac.Service.IService;
import cput.za.ac.domain.Student;

import java.util.List;

public interface IStudentService extends IService<Student, String> {
    List<Student> getAll();
}