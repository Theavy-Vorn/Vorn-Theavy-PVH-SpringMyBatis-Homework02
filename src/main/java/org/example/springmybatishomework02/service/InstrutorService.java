package org.example.springmybatishomework02.service;

import org.example.springmybatishomework02.model.dto.request.InstructorRequest;
import org.example.springmybatishomework02.model.entity.Instructor;
import org.springframework.http.ResponseEntity;


import java.util.List;

public interface InstrutorService {
    List<Instructor> getInstructor();
    Instructor addInstructor(InstructorRequest instructorRequest);
    Instructor searchInstructor(Integer instructor_id);

    Instructor updateInstructor(int instructorId, InstructorRequest instructorRequest);

    void deleteInstructor(Integer instructorId);
}
