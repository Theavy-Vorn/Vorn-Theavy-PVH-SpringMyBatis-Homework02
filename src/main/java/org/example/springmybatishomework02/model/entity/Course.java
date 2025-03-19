package org.example.springmybatishomework02.model.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Course {
    private Integer course_id;
    private String course_name;
    private String description;
    private Instructor instructor;

}
