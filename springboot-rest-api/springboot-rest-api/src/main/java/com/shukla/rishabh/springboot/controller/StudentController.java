package com.shukla.rishabh.springboot.controller;

import com.shukla.rishabh.springboot.bean.Student;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class StudentController {
    @GetMapping("/student")
    public Student getStudent() {
        return new Student(1, "Rishabh", "Shukla");
    }


    @GetMapping("/students")
    public List<Student> getStudents() {
        List<Student> students = new ArrayList<>();
        students.add(new Student(1, "Rishabh", "Shukla"));
        students.add(new Student(2, "Utkarsh", "Gupta"));
        students.add(new Student(3, "Anurag", "Tiwari"));
        return students;
    }
}
