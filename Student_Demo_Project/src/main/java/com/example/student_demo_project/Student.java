package com.example.student_demo_project;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "stu")
@Data
public class Student {
 @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
private String name;
private Long phone_no;
private String section;
private String address;
private String feesstatus;

}
