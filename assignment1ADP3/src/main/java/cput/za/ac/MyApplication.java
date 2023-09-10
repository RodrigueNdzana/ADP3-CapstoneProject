package cput.za.ac;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//import za.ac.cput.service.NationalityService;


@RestController
@EnableAutoConfiguration
@SpringBootApplication
public class MyApplication { public static void main(String[] args) {
        SpringApplication.run(MyApplication.class, args);
    }

}