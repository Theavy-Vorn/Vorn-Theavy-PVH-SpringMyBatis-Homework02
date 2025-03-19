package org.example.springmybatishomework02.controller;

import org.example.springmybatishomework02.model.dto.request.InstructorRequest;
import org.example.springmybatishomework02.model.dto.respone.ApiRespone;
import org.example.springmybatishomework02.model.entity.Instructor;
import org.example.springmybatishomework02.service.InstrutorService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.List;

@RestController
@RequestMapping("/api/v1/instructors")
public class InstructorController {
    private final InstrutorService instrutorService;

    public InstructorController(InstrutorService instrutorService) {
        this.instrutorService = instrutorService;
    }

    @GetMapping
    public ResponseEntity<ApiRespone<List<Instructor>>> getInstructor() {
        ApiRespone<List<Instructor>> response = ApiRespone.<List<Instructor>>builder()
                .message("Get instructor successful")
                .status(HttpStatus.OK)
                .success(true)
                .payload(instrutorService.getInstructor())
                .timestamp(LocalDateTime.now())
                .build();
        return ResponseEntity.ok(response);
    }

    @PostMapping
        public  ResponseEntity<ApiRespone<Instructor>> addInstructor(@RequestBody InstructorRequest instructorRequest){
        ApiRespone<Instructor> respone = ApiRespone.<Instructor>builder()
                .message("Add Instructor succeddful")
                .status(HttpStatus.OK)
                .success(true)
                .payload(instrutorService.addInstructor(instructorRequest))
                .timestamp(LocalDateTime.now())
                .build();

        return ResponseEntity.ok(respone);
    }
    @GetMapping("/{instructor_id}")
    public  ResponseEntity<ApiRespone<Instructor>> searchInstructor(@PathVariable Integer instructor_id) {
        ApiRespone<Instructor> respone = ApiRespone.<Instructor>builder()
                .message("Search Instructor by id succeddful")
                .status(HttpStatus.OK)
                .success(true)
                .payload(instrutorService.searchInstructor(instructor_id))
                .timestamp(LocalDateTime.now())
                .build();

        return ResponseEntity.ok(respone);

    }

    @PutMapping("/{instructor_id}")
    public ResponseEntity<ApiRespone<Instructor>> updateInstructor(@PathVariable("instructor_id") int instructorId,@RequestBody InstructorRequest instructorRequest){
        ApiRespone<Instructor> respone = ApiRespone.<Instructor>builder()
                .message("Update Instructor by id succeddful")
                .status(HttpStatus.OK)
                .success(true)
                .payload(instrutorService.updateInstructor(instructorId,instructorRequest))
                .timestamp(LocalDateTime.now())
                .build();
        return ResponseEntity.ok(respone);
    }

    @DeleteMapping("/{instructor_id}")
    public ResponseEntity<?> deleteInstructor(@PathVariable Integer instructor_id) {
        //delete
        instrutorService.deleteInstructor(instructor_id);
        ApiRespone<String> respone = ApiRespone.<String>builder()
                .message("Delete Instructor successful")
                .status(HttpStatus.OK)
                .success(true)
                .payload("Success")
                .build();
        return ResponseEntity.ok(respone);
    }
}
