package com.example.StudentApplication.repository;

import com.example.StudentApplication.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Long> {
    void deleteByName(String name);
    Student findByName(String name);
}