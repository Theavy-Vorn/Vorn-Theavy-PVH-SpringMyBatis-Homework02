package org.example.springmybatishomework02.controller;

import org.example.springmybatishomework02.model.dto.request.CourseRequest;
import org.example.springmybatishomework02.model.dto.respone.ApiRespone;
import org.example.springmybatishomework02.model.entity.Course;
import org.example.springmybatishomework02.service.CourseService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.List;

@RestController
@RequestMapping("/api/v1/courses")
public class CourseController {
    private final CourseService courseService;

    public CourseController(CourseService courseService) {
        this.courseService = courseService;
    }

    @GetMapping
    public ResponseEntity<ApiRespone <List<Course>>> getCourse(){
       ApiRespone<List<Course>> respone = ApiRespone.<List<Course>>builder()
               .message("Get course successful")
               .status(HttpStatus.OK)
               .success(true)
               .payload(courseService.getCourse())
               .timestamp(LocalDateTime.now())
               .build();

        return ResponseEntity.ok(respone);
    }
    @PostMapping
    public ResponseEntity<ApiRespone <List<Course>>> addCourse(@RequestBody CourseRequest courseRequest){
        ApiRespone<List<Course>> respone = ApiRespone.<List<Course>>builder()
                .message("Add course successful")
                .status(HttpStatus.OK)
                .success(true)
                .payload(courseService.addCourse(courseRequest))
                .timestamp(LocalDateTime.now())
                .build();

        return ResponseEntity.ok(respone);
    }

    @GetMapping("{course_id}")
    public ResponseEntity<ApiRespone <List<Course>>> SearcCourseById(@PathVariable Integer course_id){
        ApiRespone<List<Course>> respone = ApiRespone.<List<Course>>builder()
                .message("search course by id successful")
                .status(HttpStatus.OK)
                .success(true)
                .payload(courseService.SearcCourseById(course_id))
                .timestamp(LocalDateTime.now())
                .build();

        return ResponseEntity.ok(respone);
    }
    @PutMapping("{course_id}")
    public ResponseEntity<ApiRespone <List<Course>>> updateCourse(@PathVariable Integer course_id ,@RequestBody CourseRequest courseRequest){
        ApiRespone<List<Course>> respone = ApiRespone.<List<Course>>builder()
                .message("update course successful")
                .status(HttpStatus.OK)
                .success(true)
                .payload(courseService.updateCourse(course_id,courseRequest))
                .timestamp(LocalDateTime.now())
                .build();

        return ResponseEntity.ok(respone);
    }
    @DeleteMapping("{course_id}")
    public ResponseEntity<?> deleteCourseById(@PathVariable Integer course_id){
        //delete do not return
        courseService.deleteCourseById(course_id);
        ApiRespone<String> respone = ApiRespone.<String>builder()
                .message("search course by id successful")
                .status(HttpStatus.OK)
                .success(true)
                .payload("success")
                .timestamp(LocalDateTime.now())
                .build();

        return ResponseEntity.ok(respone);
    }
}
