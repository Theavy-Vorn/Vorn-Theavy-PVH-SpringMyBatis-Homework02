package org.example.springmybatishomework02.service;
import org.example.springmybatishomework02.model.dto.request.CourseRequest;
import org.example.springmybatishomework02.model.entity.Course;

import java.util.List;


public interface CourseService {
    List<Course> getCourse();
    List<Course> SearcCourseById(Integer courseId);

    List<Course> addCourse(CourseRequest courseRequest);

    List<Course> updateCourse(Integer courseId, CourseRequest courseRequest);
    void deleteCourseById(Integer courseId);
}
