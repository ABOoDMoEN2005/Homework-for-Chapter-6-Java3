package com.example.demo.controller;

import com.example.demo.model.Student;
import com.example.demo.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/students")
public class StudentController {

    @Autowired
    private StudentService service;

    // Get all students
    @GetMapping
    public List<Student> getAll() {
        return service.getAll();
    }

    // Get student by ID
    @GetMapping("/{id}")
    public Student getById(@PathVariable int id) {
        return service.getById(id);
    }

    // Create new student
    @PostMapping
    public Student create(@RequestBody Student student) {
        return service.save(student);
    }

    // Update student
    @PutMapping("/{id}")
    public Student update(@PathVariable int id, @RequestBody Student student) {
        student.setId(id);
        return service.save(student);
    }

    // Delete student
    @DeleteMapping("/{id}")
    public String delete(@PathVariable int id) {
        service.delete(id);
        return "Deleted successfully";
    }
}
