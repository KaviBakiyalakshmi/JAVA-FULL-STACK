package com.simplilearn.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

    @RequestMapping("/")
    public String hello(){
        return "Hello This is my Spring Security Check project";
    }

    @RequestMapping("/protected")
    public String protectedHello(){
        return "Hello , i was protected";
    }

    @RequestMapping("/admin")
    public String admin(){
        return "Hello from admin";
    }

}