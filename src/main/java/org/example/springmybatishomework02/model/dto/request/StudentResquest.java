package org.example.springmybatishomework02.model.dto.request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.example.springmybatishomework02.model.entity.Course;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class StudentResquest {
    private String student_name;
    private String email;
    private String phone_number;
    private List<Course> Courses;
}
