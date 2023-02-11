package com.example.hello_world.api;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    @GetMapping("/hello-world")
    public String hello_world() {
        return "Hello World! \n Welcome to Spring boot Java";
    }
}
