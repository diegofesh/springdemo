package com.dfesh.form.springdemo.student.model.Student;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
public class Student {

    private String firstname;

    private String lastname;

    private LocalDate dateOfBirth;

    private String email;

    private String age;

    public Student() {
    }

    public Student(String firstname, String lastname, LocalDate dateOfBirth, String email, String age) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.dateOfBirth = dateOfBirth;
        this.email = email;
        this.age = age;
    }
}
