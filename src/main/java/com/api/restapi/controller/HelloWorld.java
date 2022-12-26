package com.api.restapi.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorld {

    //get
    //post
    //put
    //delete


    // Get http method (http:localhost:8080/hello-world)
    @GetMapping("/hello-world")
    public String helloWorld(){
        return "Hello World";
    }


}
