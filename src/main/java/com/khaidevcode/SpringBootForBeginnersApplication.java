package com.khaidevcode;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringBootForBeginnersApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootForBeginnersApplication.class, args);
    }

    @GetMapping
    public String helloWorld() {
        return "Hello World SpringBoot";
    }
}
