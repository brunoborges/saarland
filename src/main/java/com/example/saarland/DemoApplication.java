package com.example.saarland;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;



@SpringBootApplication
@RestController
public class DemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

    @RequestMapping("/")
    public String hello() {
        return "Hello";
    }

    @GetMapping(value = "/uppercase")
    public String getMethodName(@RequestParam String name) {
        return name.toUpperCase();
    }

    @PostMapping(value="/lowercase")
    public String postMethodName(@RequestBody String entity) {
        return entity.toLowerCase();
    }
    
}
