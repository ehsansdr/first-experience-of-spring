package com.amigoscode;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
//search localhost:(portNumber)(additional number that you may add)

//for changing web server paste this to src/main/resources/application.yml
//if you don't have it new file and nae it "application.yml"
//server :
//  port : (the number of port you want to have it)

//if you want list object without to create spesial one you cab declaye List.of( ,  ,  ,...)

/*
if you wan tto disable the server paste this to the src/main/resources/application.yml
if you don't have it new file and nae it "application.yml"

BE CAREFUL DON'T HAVE EXTRA SPACES BEFORE WORDS
spring :
  main:
    web-application-type : none

    none //for disabling
    servlet //it is default if you paste it ou nut it would run


*/
@SpringBootApplication//it should be here to declare this class is the spring application
@RestController//it should be here for detecting @GetMapping methods and ... in class
public class Main {
    public static void main(String[] args) {
        //System.out.println("hello ehsan");
        SpringApplication.run(Main.class,args);
    }

    @GetMapping("/")
    public String greet(){
        System.out.println("this method called");//if somone search or pull request to its annotation path
        //this SOUT print in you console how many times it will search
        return "fff";

    }

}
