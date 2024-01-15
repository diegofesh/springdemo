package com.dfesh.form.springdemo.student;

import com.dfesh.form.springdemo.student.model.Student;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class StudentService {

    public List<Student> findAllStudents() {
        return List.of(
                new Student("Diego", "Santander", LocalDate.now(), "diegofesh@gmail.com", "39"),
                new Student("Martha", "Sierra", LocalDate.now(), "martha@gmail.com", "31")
        );
    }
}
