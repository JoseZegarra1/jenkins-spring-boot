package com.jos3zy.azuredockerapp.Controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWordController {
    @RequestMapping("/hello")
    public String hello() {
        return "Hello World RESTful with Spring Boot";
    }
}
