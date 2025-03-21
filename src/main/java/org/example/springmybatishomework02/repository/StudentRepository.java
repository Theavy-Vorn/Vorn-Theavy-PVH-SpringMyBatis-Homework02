package org.example.springmybatishomework02.repository;

import org.apache.ibatis.annotations.*;
import org.example.springmybatishomework02.model.dto.request.StudentResquest;
import org.example.springmybatishomework02.model.entity.Student;

import java.util.List;
@Mapper
public interface StudentRepository {
    @Select("""
    SELECT * FROM students;
""")
    @Results(id = "StudentMapper", value = {
            @Result(property = "studentId", column = "student_id"),
            @Result(property = "courses",
                    column = "student_id",
                    many = @Many(select = "org.example.springmybatishomework02.repository.CourseRepository.getAllCourseByStudentId"))
    })
    List<Student> getStudent();
    @Select("""
        INSERT INTO students (student_name, email, phone_number) VALUES (#{request.student_name},#{request.email},#{request.phone_number})
        RETURNING *
""")
    @ResultMap("StudentMapper")
    List<Student> addStudent(@Param("request") StudentResquest studentResquest);
}
