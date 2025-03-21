package org.example.springmybatishomework02.service;

import org.example.springmybatishomework02.model.dto.request.StudentResquest;
import org.example.springmybatishomework02.model.entity.Student;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;
@Service
public interface StudentService {
    List<Student> getStudent();


    List<Student> addStudent(StudentResquest studentResquest);
}
