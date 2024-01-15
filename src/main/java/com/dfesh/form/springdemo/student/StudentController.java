package com.dfesh.form.springdemo.student;

import com.dfesh.form.springdemo.student.model.Student;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/students")
public class StudentController {

    private final StudentService service = new StudentService();

    @GetMapping
    public List<Student> findAllStudents() {
        return service.findAllStudents();
    }

}
