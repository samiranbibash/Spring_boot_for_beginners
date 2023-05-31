package com.hazard.springdemo.student;

import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class InMemoryStudentService implements StudentService{
    private final InMemoryStudentDao dao;

    public InMemoryStudentService(InMemoryStudentDao dao) {
        this.dao = dao;
    }

    @Override
    public Student save(Student s) {
        return dao.save(s);
    }

    @Override
    public List<Student> findallstudents() {
            return dao.findallstudents();
    }

    @Override
    public Student findbyEmail(String email) {
        return dao.findbyEmail(email);
    }

    @Override
    public Student update(Student s) {
        return dao.update(s);
    }

    @Override
    public Student delete(String email) {
        return dao.delete(email);
    }
}
