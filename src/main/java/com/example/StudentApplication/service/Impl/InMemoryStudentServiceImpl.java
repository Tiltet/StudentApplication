package com.example.StudentApplication.service.Impl;

import com.example.StudentApplication.model.Student;
import com.example.StudentApplication.repository.InMemoryStudentDAO;
import com.example.StudentApplication.service.StudentService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class InMemoryStudentServiceImpl implements StudentService {
    private final InMemoryStudentDAO repository;

    @Override
    public List<Student> findAllStudent() {
        return repository.findAllStudent();
    }

    @Override
    public Student saveStudent(Student student) {
        return repository.saveStudent(student);
    }

    @Override
    public Student findByName(String name) {
        return repository.findByName(name);
    }

    @Override
    public Student updateStudent(Student student)
    {
        return repository.updateStudent(student);
    }

    @Override
    public void deleteStudent(String name)
    {
        repository.deleteStudent(name);
    }
}