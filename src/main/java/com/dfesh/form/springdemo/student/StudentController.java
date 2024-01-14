package com.dfesh.form.springdemo.student;

import com.dfesh.form.springdemo.student.model.Student;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping("/api/v1/students")
public class StudentController {

    @GetMapping
    public List<Student> findAllStudents() {
        return List.of(
                new Student("Diego", "Santander", LocalDate.now(), "diegofesh@gmail.com", "39"),
                new Student("Martha", "Sierra", LocalDate.now(), "martha@gmail.com", "31")
        );
    }

}
