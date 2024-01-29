package com.dfesh.form.springdemo.student;

import com.dfesh.form.springdemo.student.model.Student.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Integer> {

    Student findByEmail(String email);

    void deleteByEmail(String email);
}
