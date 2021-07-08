package com.example.demo.controllers;

import com.example.demo.services.ProducerService;
import org.springframework.web.bind.annotation.*;

@RestController
public class ProducerController {

    @GetMapping("/count")
    public Integer countNumberOfStudents() {
        return ProducerService.getCount();
    }

    @GetMapping("/getGpa/{id}")
    public Double findStudentGpaById(@PathVariable int id) {
        return ProducerService.getAverage(id);
    }

}
