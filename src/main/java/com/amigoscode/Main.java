package com.amigoscode;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication//it should be here to declare this class is the spring application
@RestController//it should be here for detecting @GetMapping methods and ... in class
public class Main {
    public static void main(String[] args) {
        //System.out.println("hello ehsan");
        SpringApplication.run(Main.class,args);
    }

    @GetMapping("/")
    public String greet(){
        return "fff";
    }

}
