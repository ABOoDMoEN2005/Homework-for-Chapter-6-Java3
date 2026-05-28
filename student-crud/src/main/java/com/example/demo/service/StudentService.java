package com.example.demo.service;
// Abd Al-Rahman Moen Hemaid
// 120240672
import com.example.demo.model.Student;
import com.example.demo.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    @Autowired
    private StudentRepository repo;

    public List<Student> getAll() {
        return repo.findAll();
    }

    public Student getById(int id) {
        return repo.findById(id).orElse(null);
    }

    public Student save(Student student) {
        return repo.save(student);
    }

    public void delete(int id) {
        repo.deleteById(id);
    }
}
