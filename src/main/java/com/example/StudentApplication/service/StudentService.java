package com.example.StudentApplication.service;

import com.example.StudentApplication.model.Student;

import java.util.List;

public interface StudentService {
    List<Student> findAllStudent();
    Student saveStudent(Student student);
    Student findByName(String name);
    Student updateStudent(Student student);
    void deleteStudent(String name);
}
