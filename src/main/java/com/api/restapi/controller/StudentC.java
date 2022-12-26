package com.api.restapi.controller;
import com.api.restapi.student.Student;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class StudentC {

    // Return Java Bean obj to the client
    @GetMapping("/student")
    public Student getStudent(){
        return new Student("Ram","Shyam");
    }


    //Return List as RestAPI Response
    @GetMapping("/students")
    public List<Student> getStudents(){
        List<Student> students = new ArrayList<>();

        students.add(new Student("R","M"));
        students.add(new Student("A","B"));
        students.add(new Student("D","C"));
        students.add(new Student("E","F"));
        students.add(new Student("R","G"));

        return students;
    }

    // http:localhost:8080/students/Ram/Shyam
    // Adding Path Variable
    @GetMapping("{firstName}/{lastName}")
    public Student studentPathVariable(@PathVariable("firstName") String firstName,
                                       @PathVariable("lastName") String lastName){

        return new Student(firstName,lastName);
    }

}
