package com.hazard.springdemo.student;

import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

interface StudentService {
    Student save(Student s);
    List<Student> findallstudents();
    Student findbyEmail(String email);
    Student update(Student s);
    Student delete(String email);

    }


