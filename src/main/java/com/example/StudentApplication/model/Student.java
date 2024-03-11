package com.example.StudentApplication.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "students")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "students_seq")
    @SequenceGenerator(name = "students_seq", sequenceName = "students_seq", initialValue = 1, allocationSize = 1)
    private Long id;
    @Column(unique = true)
    private String name;
    private int age;
}
