package org.example.springmybatishomework02.service.impl;

import org.example.springmybatishomework02.model.dto.request.StudentResquest;
import org.example.springmybatishomework02.model.entity.Student;
import org.example.springmybatishomework02.repository.StudentRepository;
import org.example.springmybatishomework02.service.StudentService;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class StudentServiceImpl implements StudentService {
    private final StudentRepository studentRepository;

    public StudentServiceImpl(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    @Override
    public List<Student> getStudent() {
        return studentRepository.getStudent();
    }

    @Override
    public List<Student> addStudent(StudentResquest studentResquest) {
        return studentRepository.addStudent(studentResquest);
    }


}
