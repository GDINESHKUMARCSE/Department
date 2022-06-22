package com.dailycodebuffer.springboot.tutorial.Controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/welcome")
   public String helloWorld(){
       return "Welcome NEw ";
   }

}
