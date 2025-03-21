package org.example.springmybatishomework02.model.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Student {
    private Integer student_id;
    private String student_name;
    private String email;
    private String phone_number;
    private List <Course> Courses;
}
