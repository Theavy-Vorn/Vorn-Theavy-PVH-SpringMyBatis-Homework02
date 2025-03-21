package org.example.springmybatishomework02.repository;

import org.apache.ibatis.annotations.*;
import org.example.springmybatishomework02.model.entity.Student;

import java.util.List;
@Mapper
public interface StudentRepository {
    @Select("""
    SELECT * FROM students;
""")
    @Results(id = "StudentMapper", value = {
            @Result(property = "student_id", column = "student_id"),
            @Result(property = "student_name", column = "student_name"),
            @Result(property = "email", column = "email"),
            @Result(property = "phone_number", column = "phone_number"),
            @Result(property = "courses",
                    column = "student_id",
                    many = @Many(select = "org.example.springmybatishomework02.repository.CourseRepository.getAllCourseByStudentId"))
    })
    List<Student> getStudent();

}
