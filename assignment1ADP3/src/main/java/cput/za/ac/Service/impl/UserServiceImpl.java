package cput.za.ac.Service.impl;
/*UserServiceImpl.Java
 Author: Bavuyise Mpila(216061067)
 Date September 2023
*/

import cput.za.ac.Service.Interface.IUserService;
import cput.za.ac.domain.Course;
import cput.za.ac.domain.User;

import cput.za.ac.repository.IUserRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements IUserService {
    private UserServiceImpl service;
    private IUserRepository repository;
    @Autowired
    private UserServiceImpl(IUserRepository repository){
        this.repository = repository;
    }

    @Override
    public User create(User user) {
        return this.repository.save(user);
    }

    @Override
    public User read(String userId) {
        return this.repository.findById(userId).orElse(null);
    }

    @Override
    public User update(User user) {
        if (this.repository.existsById(user.getUserId())){
            // System.out.println("debug update: true");
            return this.repository.save(user);
        }
        return null;
    }
    @Override
    public boolean delete(String userId) {
        if(this.repository.existsById(userId)){
            this.repository.deleteById(userId);
            return true;
        }
        return false;
    }
    @Override
    public List<User> getAll() {
        return this.repository.findAll();
    }


}

