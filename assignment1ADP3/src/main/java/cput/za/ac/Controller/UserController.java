package cput.za.ac.Controller;
/*UserController.Java
 Author: Bavuyise Mpila(216061067)
 Date September 2023
*/
import cput.za.ac.Service.impl.UserServiceImpl;
import cput.za.ac.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserServiceImpl userService;
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

}

