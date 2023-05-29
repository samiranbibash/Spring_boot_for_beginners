package com.hazard.springdemo.student;

import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class StudentService {
    public List<Student> findallstudnets()
    {
        return List.of(
                new Student("Samiran",
                        "Bibash",
                        LocalDate.now(),
                        "samiranbibash2218@gmail.com",
                        23),
                new Student("Eden",
                        "Hazard",
                        LocalDate.now(),
                        "edenhazard@gmail.com",
                        32)
        );
    }
}
