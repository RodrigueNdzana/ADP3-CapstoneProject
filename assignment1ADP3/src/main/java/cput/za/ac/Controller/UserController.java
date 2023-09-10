package cput.za.ac.Controller;
/*UserController.Java
 Author: Bavuyise Mpila(216061067)
 Date September 2023
*/
//import cput.za.ac.Service.impl.UserServiceImpl;
import cput.za.ac.domain.User;
import cput.za.ac.repository.IUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import net.javaguides.springboot.exception.ResourceNotFoundException;
@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("api/user")
public class UserController {
    @Autowired
    private IUserRepository userService;
    /*
    @PostMapping("/create")
    public User create (@RequestBody User user){

        return userService.create(user);
    }
    @GetMapping("/read/{id}")
    public User read(@PathVariable String id) {
        return userService.read(id);
    }
    @PostMapping("/update")
    public User update(@RequestBody User user) {
        return userService.update(user);
    }
    @DeleteMapping("delete/{id}")
    public boolean delete(@PathVariable String id){
        return userService.delete(id);
    }
    @GetMapping("/getall") /// NB is a set
    public List<User> getall(){
        return userService.getAll(); // return a set of user object
    }

     */




        // get all employees
        @GetMapping("/users")
        public List<User> getAllUser(){
            return userService.findAll();
        }

        // create user rest api
        @PostMapping("/user")
        public User createUser(@RequestBody User user) {
            return userService.save(user);
        }

        // get user by id rest api
        @GetMapping("/users/{id}")
        public ResponseEntity<User> getEmployeeById(@PathVariable String id) {
            User user = userService.findById(id)
                    .orElseThrow(() -> new ResourceNotFoundException("user not exist with id :" + id));
            return ResponseEntity.ok(user);
        }

        // update user rest api

        @PutMapping("/users/{id}")
        public ResponseEntity<User> updateEmployee(@PathVariable String id, @RequestBody User userDetails){
            User user = userService.findById(id)
                    .orElseThrow(() -> new ResourceNotFoundException("user not exist with id :" + id));

            user.setFirstname(userDetails.getFirstname());
            user.setLastname(userDetails.getLastname());
            user.setPhoneNum(userDetails.getPhoneNum());
            user.setEmail(userDetails.getEmail());
            user.setAddress(userDetails.getAddress());

            User updatedUser = userService.save(user);
            return ResponseEntity.ok(updatedUser);
        }

        // delete user rest api
        @DeleteMapping("/users/{id}")
        public ResponseEntity<Map<String, Boolean>> deleteEmployee(@PathVariable String id){
            User user = userService.findById(id)
                    .orElseThrow(() -> new ResourceNotFoundException("USER not exist with id :" + id));

            userService.delete(user);
            Map<String, Boolean> response = new HashMap<>();
            response.put("deleted", Boolean.TRUE);
            return ResponseEntity.ok(response);
        }


    }






