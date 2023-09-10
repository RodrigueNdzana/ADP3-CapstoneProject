package cput.za.ac.Service.Interface;
/*IUserService.Java
 Author: Bavuyise Mpila(216061067)
 Date September 2023
*/
import cput.za.ac.Service.IService;

import cput.za.ac.domain.User;

import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface IUserService extends IService<User, String> {
    List<User> getAll();
}

