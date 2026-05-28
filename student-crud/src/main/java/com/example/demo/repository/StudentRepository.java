package com.example.demo.repository;
// Abd Al-Rahman Moen Hemaid
// 120240672
import com.example.demo.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Integer> {
}
