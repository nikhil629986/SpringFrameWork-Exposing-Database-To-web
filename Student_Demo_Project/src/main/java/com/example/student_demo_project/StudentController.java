package com.example.student_demo_project;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class StudentController {
    @Autowired
    private StudentService studentService;
    @GetMapping("stu")
    public ResponseEntity<List<Student>> getAllstu()
    {
        return  new ResponseEntity<List<Student>>(studentService.findAllstu(), HttpStatus.OK);
    }

}
