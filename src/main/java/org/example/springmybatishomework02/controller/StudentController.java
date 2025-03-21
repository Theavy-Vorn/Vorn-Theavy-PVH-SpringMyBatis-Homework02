package org.example.springmybatishomework02.controller;

import org.example.springmybatishomework02.model.dto.request.StudentResquest;
import org.example.springmybatishomework02.model.dto.respone.ApiRespone;
import org.example.springmybatishomework02.model.entity.Course;
import org.example.springmybatishomework02.model.entity.Student;
import org.example.springmybatishomework02.service.StudentService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.List;

@RestController
@RequestMapping("api/v1/students")
public class StudentController {
    private final StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }


    @GetMapping
    public ResponseEntity<ApiRespone<List<Student>>> getStudent(){
        ApiRespone<List<Student>> respone = ApiRespone.<List<Student>>builder()
                .message("Get course successful")
                .status(HttpStatus.OK)
                .success(true)
                .payload(studentService.getStudent())
                .timestamp(LocalDateTime.now())
                .build();

        return ResponseEntity.ok(respone);
    }
    @PostMapping
    public ResponseEntity<ApiRespone<List<Student>>> addStudent(@RequestBody StudentResquest studentResquest){
        ApiRespone<List<Student>> respone = ApiRespone.<List<Student>>builder()
                .message("Get course successful")
                .status(HttpStatus.OK)
                .success(true)
                .payload(studentService.addStudent(studentResquest))
                .timestamp(LocalDateTime.now())
                .build();

        return ResponseEntity.ok(respone);
    }

}
