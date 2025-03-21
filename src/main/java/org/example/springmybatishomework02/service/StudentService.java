package org.example.springmybatishomework02.service;

import org.example.springmybatishomework02.model.entity.Student;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface StudentService {
    List<Student> getStudent();
}
