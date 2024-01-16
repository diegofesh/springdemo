package com.dfesh.form.springdemo.student;

import com.dfesh.form.springdemo.student.model.Student.Student;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService implements StudentInterface {

    private final StudentDao studentDao;

    public StudentService(StudentDao studentDao) {
        this.studentDao = studentDao;
    }

    @Override
    public Student saveStudent(Student student) {
        return studentDao.save(student);
    }

    @Override
    public List<Student> findAllStudents() {
        return studentDao.findAllStudents();
    }

    @Override
    public Student findByEmail(String email) {
        return studentDao.findByEmail(email);
    }

    @Override
    public Student updateStudent(Student student) {
        return studentDao.update(student);
    }

    @Override
    public void deleteStudentByEmail(String email) {
        studentDao.delete(email);
    }


}
