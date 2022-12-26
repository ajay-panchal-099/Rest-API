package com.api.restapi.controller;
import com.api.restapi.student.Student;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentC {

    // Return Java Bean obj to the client
    @GetMapping("/student")
    public Student getStudent(){
        return new Student("Ram","Shyam");
    }
}
