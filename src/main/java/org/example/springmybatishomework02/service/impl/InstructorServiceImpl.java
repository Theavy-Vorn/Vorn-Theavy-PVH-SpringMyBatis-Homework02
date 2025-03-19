package org.example.springmybatishomework02.service.impl;

import org.example.springmybatishomework02.model.dto.request.InstructorRequest;
import org.example.springmybatishomework02.model.entity.Instructor;
import org.example.springmybatishomework02.repository.InstructorRepository;
import org.example.springmybatishomework02.service.InstrutorService;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class InstructorServiceImpl implements InstrutorService {
   private final InstructorRepository instructorRepository;

    public InstructorServiceImpl(InstructorRepository instructorRepository) {
        this.instructorRepository = instructorRepository;
    }

    @Override
    public List<Instructor> getInstructor() {
        return instructorRepository.getInstructor();
    }

    @Override
    public Instructor addInstructor(InstructorRequest instructorRequest) {
        return instructorRepository.addInstructor(instructorRequest);
    }

    @Override
    public Instructor searchInstructor(Integer instructor_id) {
        return instructorRepository.searchInstructor(instructor_id);
    }
}
