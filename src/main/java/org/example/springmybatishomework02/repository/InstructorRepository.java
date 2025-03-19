package org.example.springmybatishomework02.repository;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.example.springmybatishomework02.model.dto.request.InstructorRequest;
import org.example.springmybatishomework02.model.entity.Instructor;

import java.util.List;
@Mapper
public interface InstructorRepository {
    @Select("""
            SELECT * FROM instructors
            """)
    List<Instructor> getInstructor();
    @Select("""
            INSERT INTO instructors(instructor_name,email)
                VALUES (#{request.instructor_name},#{request.email})
            
            RETURNING *
            """
    )
    Instructor addInstructor(@Param("request") InstructorRequest instructorRequest);

    @Select("""
        SELECT * FROM instructors WHERE instructor_id = #{id}
    """)
    Instructor searchInstructor(@Param("id") Integer instructor_id);
}
