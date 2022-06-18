package com.example.student_demo_project;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class StudentService {
    @Autowired
    private  StudentRepository repository;

    public  List<Student> findAllstu() {
        return (List<Student>) repository.findAll();
    }



}
