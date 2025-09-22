package com.shaktha.learnSpringProject;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyClass {
    @GetMapping("123")
    public String sayHello(){
        return "Hello! This is Spring Boot!!";

    }
}
