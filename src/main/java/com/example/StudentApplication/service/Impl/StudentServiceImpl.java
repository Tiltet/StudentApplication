package com.example.StudentApplication.service.Impl;

import com.example.StudentApplication.model.Student;
import com.example.StudentApplication.repository.StudentRepository;
import com.example.StudentApplication.service.StudentService;
import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
@Primary
public class StudentServiceImpl implements StudentService {
    private final StudentRepository repository;
    @Override
    public List<Student> findAllStudent()
    {
        return repository.findAll();
    }

    @Override
    public Student saveStudent(Student student)
    {
        return repository.save(student);
    }

    @Override
    public Student findByName(String name)
    {
        return repository.findByName(name);
    }

    @Override
    public Student updateStudent(Student student)
    {
        return repository.save(student);
    }

    @Override
    @Transactional
    public void deleteStudent(String name)
    {
        repository.deleteByName(name);
    }
}
