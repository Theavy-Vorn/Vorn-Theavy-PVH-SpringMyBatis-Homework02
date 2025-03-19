package org.example.springmybatishomework02.repository;

import org.apache.ibatis.annotations.*;
import org.example.springmybatishomework02.model.dto.request.CourseRequest;
import org.example.springmybatishomework02.model.entity.Course;

import java.util.List;
@Mapper
public interface CourseRepository {
    @Select("""
    SELECT * FROM courses;
""")
    @Results(id="CoursMapper",value = {
            @Result(property = "instructor",
                    column = "instructor_id",
                    one = @One(select = "org.example.springmybatishomework02.repository.InstructorRepository.searchInstructor")),
    })
    List<Course> getCourse();
    @Select("""
    SELECT * FROM courses WHERE course_id =#{coureId}
""")
    @ResultMap("CoursMapper")
    List<Course> SearcCourseById(Integer courseId);
    @Select("""
    INSERT INTO courses (course_name,description)
    VALUES (#{request.course_name},#{request.description})
    RETURNING *
""")
    @ResultMap("CoursMapper")
    List<Course> addCourse(@Param("request") CourseRequest courseRequest);
    @Select("""
    UPDATE courses SET course_name=#{request.course_name},description=#{request.description}
    WHERE course_id = #{courseId}
    RETURNING *
""")
    @ResultMap("CoursMapper")
    List<Course> updateCourse(Integer courseId,@Param("request") CourseRequest courseRequest);
    @Delete("""
        DELETE FROM courses where course_id = #{courseId}
 """)
    @ResultMap("CoursMapper")
    void deleteCourseById(Integer courseId);
}
