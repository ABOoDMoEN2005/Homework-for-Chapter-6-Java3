package com.example.demo.model;
import jakarta.persistence.*;
@Entity
@Table(name = "student")
public class Student {
    @Id
    @GeneratedValue(strategy = 
            GenerationType.IDENTITY)
    private int id;
    private String name;
    private String major;
    private String grade;
    
// Getters
    public int getId() { 
        return id;
    }
    public String getName() {
        return name; }
    public String getMajor() {
        return major; }
    public String getGrade() { 
        return grade; }
// Setters
    public void setId(int id)
    { this.id = id; }
    public void setName(String name)
    { this.name = name; }
    public void setMajor(String major) 
    { this.major = major; }
    public void setGrade(String grade) 
    { this.grade = grade; }
}