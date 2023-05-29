package com.hazard.springdemo.student;

import java.time.LocalDate;

public class Student {
    private String firstname;
    private String lastname;
    private LocalDate dateofBirth;
    private String email;
    private int age;

    public Student(String firstname, String lastname, LocalDate dateofBirth, String email, int age) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.dateofBirth = dateofBirth;
        this.email = email;
        this.age = age;
    }

    public Student() {
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public LocalDate getDateofBirth() {
        return dateofBirth;
    }

    public void setDateofBirth(LocalDate dateofBirth) {
        this.dateofBirth = dateofBirth;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
