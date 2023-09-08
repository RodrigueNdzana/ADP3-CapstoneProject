package cput.za.ac.Controller;

import cput.za.ac.Service.impl.EducatorServiceImpl;
import cput.za.ac.domain.Educator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/educator")
public class EducatorController {
    @Autowired
    private EducatorServiceImpl educatorService;

    @PostMapping("/create")
    public Educator create (@RequestBody Educator educator){
        return educatorService.create(educator);
    }
    @GetMapping("/read/{id}")
    public Educator read(@PathVariable String id) {
        return educatorService.read(id);
    }
    @PostMapping("/update")
    public Educator update(@RequestBody Educator educator) {
        return educatorService.update(educator);
    }
    @DeleteMapping("delete/{id}")
    public boolean delete(@PathVariable String id){
        return educatorService.delete(id);
    }
    @GetMapping("/getall") /// NB is a set
    public List<Educator> getall(){
        return educatorService.getAll(); // return a set of employee object
    }
}
