package cput.za.ac.Service.Interface;
/*IStudentService.Java
 Author: Bavuyise Mpila(216061067)
 Date September 2023
*/
import cput.za.ac.Service.IService;
import cput.za.ac.LoginDTO;
import cput.za.ac.LoginMesage;
import cput.za.ac.domain.Student;

public interface IStudentService extends IService<Student, String> {
    String addStudent(Student student);
    LoginMesage loginStudent(LoginDTO loginDTO);
}