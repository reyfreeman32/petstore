package com.itvedant.petstoreprac.Controllers;




// import java.util.ArrayList;
// import java.util.List;

// import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
// import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import lombok.Data;


@Data
class Student{
    private int id;
    private String name;
    private String email;
    
    public Student(int id, String name, String email) {
        this.id = id;
        this.name = name;
        this.email = email;
    }

    // public int getId() {
    //     return id;
    // }

    // public void setId(int id) {
    //     this.id = id;
    // }

    // public String getName() {
    //     return name;
    // }

    // public void setName(String name) {
    //     this.name = name;
    // }

    // public String getEmail() {
    //     return email;
    // }

    // public void setEmail(String email) {
    //     this.email = email;
    // }
}

@RestController
// @Controller
public class FirstController {
    @RequestMapping("/message")
    // @ResponseBody // this message will convert/serialize the string data in JSON format
    public String getMessage() {
        // we are geeting error herer
        // because front was expecting the name of some html file
        // but we don't want to send some html file
        // rather we want to send the string data embedded as JSON
        // bydefault it will expect the html file
        return "Welcome to Rest API";
    }

    @RequestMapping("/marks")
    // @ResponseBody
    public Integer getMarks() {
        return 59;
    }

    @RequestMapping("/student")
    // @ResponseBody
    public Student getStudent(){
        return new Student (1, "Harry","harry@student.com");
    }

    // @RequestMapping("/student-lists")
    // // @ResponseBody
    // public List<Student> getStudents(){
    //     List<Student> students = new ArrayList<>();
    //     students.add(new Student (1,"harry","harry@student.com"));
    //     students.add(new Student (2,"max","max@student.com"));
    //     students.add(new Student (3,"checo","checo@student.com"));
    //     return students;
    // }
}
