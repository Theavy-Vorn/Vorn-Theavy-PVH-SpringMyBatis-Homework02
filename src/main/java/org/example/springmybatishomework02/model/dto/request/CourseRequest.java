package org.example.springmybatishomework02.model.dto.request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.example.springmybatishomework02.model.entity.Instructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CourseRequest {
    private String course_name;
    private String description;
    private Integer instructorId;
}
