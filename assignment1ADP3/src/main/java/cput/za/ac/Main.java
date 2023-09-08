package cput.za.ac;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.web.bind.annotation.RestController;


@RestController
//@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
@SpringBootApplication

public class Main {
    public static void main(String[] args) {
            SpringApplication.run(za.ac.cput.MyApplication.class, args);
        }

    }
