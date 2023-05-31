package com.hazard.springdemo.student;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;
@Repository
public class InMemoryStudentDao {
    private final List<Student> Students = new ArrayList<>();
    public Student save(Student s) {
        Students.add(s);
        return s;
    }
    public List<Student> findallstudents() {
        return Students;
    }

    public Student findbyEmail(String email) {
        return Students.stream()
                .filter(s -> email.equals(s.getEmail()))
                .findFirst()
                .orElse(null);
    }


    public Student update(Student s) {
        var studentIndex = IntStream.range(0, Students.size())
                .filter(index -> Students.get(index).getEmail().equals(s.getEmail()))
                .findFirst()
                .orElse(-1);
        if (studentIndex > -1){
            Students.set(studentIndex, s);
            return s;
        }
        return null;
    }

    public Student delete(String email) {
        var student = findbyEmail(email);
        if (student != null){
            Students.remove(student);
        }

        return student;
    }
}
