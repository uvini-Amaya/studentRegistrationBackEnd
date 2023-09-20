package com.example.SpringMongoDBProgectStudentRegistration.Controller;

import com.example.SpringMongoDBProgectStudentRegistration.Entity.Student;
import com.example.SpringMongoDBProgectStudentRegistration.Service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("api/v/student")


public class StudentController {
    @Autowired
    private StudentService studentService;
    @PostMapping(value = "/save")
    private String saveStudent(@RequestBody Student student ){

        studentService.saveOrUpdate(student);
        return student.id;
    }

}
