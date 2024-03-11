package com.example.StudentApplication.controller;

import com.example.StudentApplication.model.Student;
import com.example.StudentApplication.service.StudentService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
@AllArgsConstructor
public class StudentController {

    private final StudentService service;

    @GetMapping
    public List<Student> findAllStudents()
    {
        return service.findAllStudent();
    }

    @PostMapping("/save_student")
    public Student saveStudent(@RequestBody Student student)
    {
        return service.saveStudent(student);
    }

    @GetMapping("/{name}")
    public Student findByName(@PathVariable String name)
    {
        return service.findByName(name);
    }

    @PutMapping("update_student")
    public Student updateStudent(@RequestBody Student student)
    {
        return service.updateStudent(student);
    }

    @DeleteMapping("delete_student/{name}")
    public void deleteStudent(@PathVariable String name)
    {
        service.deleteStudent(name);
    }
}