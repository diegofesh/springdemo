package com.dfesh.form.springdemo.student;

import com.dfesh.form.springdemo.student.model.Student.Student;

import java.time.LocalDate;
import java.util.List;

public interface StudentInterface {

    Student saveStudent(Student student);

    List<Student> findAllStudents();

    Student findByEmail(String email);

    Student updateStudent(Student student);

    void deleteStudentByEmail(String email);
}
