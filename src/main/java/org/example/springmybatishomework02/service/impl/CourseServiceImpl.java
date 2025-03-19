package org.example.springmybatishomework02.service.impl;

import org.example.springmybatishomework02.model.dto.request.CourseRequest;
import org.example.springmybatishomework02.model.entity.Course;
import org.example.springmybatishomework02.repository.CourseRepository;
import org.example.springmybatishomework02.service.CourseService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseServiceImpl implements CourseService {
    private final CourseRepository courseRepository;

    public CourseServiceImpl(CourseRepository courseRepository) {
        this.courseRepository = courseRepository;
    }

    @Override
    public List<Course> getCourse() {
        return courseRepository.getCourse();
    }

    @Override
    public List<Course> SearcCourseById(Integer courseId) {
        return courseRepository.SearcCourseById(courseId);
    }

    @Override
    public List<Course> addCourse(CourseRequest courseRequest) {
        return courseRepository.addCourse(courseRequest);
    }

    @Override
    public List<Course> updateCourse(Integer courseId, CourseRequest courseRequest) {
        return courseRepository.updateCourse(courseId,courseRequest);
    }

    @Override
    public void deleteCourseById(Integer courseId) {
       courseRepository.deleteCourseById(courseId);
    }
}
