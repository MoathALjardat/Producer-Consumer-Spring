package com.example.demo.models.Producers.controllers;

import com.example.demo.models.Producers.models.Student;
import com.example.demo.models.Producers.services.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProducerController {
    @Autowired
    StudentService studentService;

    @GetMapping("/count")
    public int countNumberOfStudents() {
        return studentService.getNumberOfStudents();
    }

    @GetMapping("/getGpa/{id}")
    public Student findStudentGpaById(@PathVariable int id) {
        return studentService.getStudentById(id);
    }

    @GetMapping("/getGpa/max")
    public Student getHighestMark() {
        return studentService.getHighestMark();
    }

    @GetMapping("/getGpa/above50")
    public List<Student> getStudentsThierMarkesAbove50() {
        return studentService.getStudentsThierMarkesAbove50();
    }
}