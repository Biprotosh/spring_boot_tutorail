package com.springboottutorial.controller;

import com.springboottutorial.entity.Student;
import com.springboottutorial.service.StudentService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/students")
public class StudentController {

    private final StudentService studentService;

    public StudentController(StudentService studentService){
        this.studentService = studentService;
    }

    @PostMapping
    public ResponseEntity<Student> createStudent(@RequestBody Student studentReq){
        Student studentRes = studentService.createStudent(studentReq);

        return ResponseEntity.ok(studentRes);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Student> getStudent(@PathVariable Long id){
        Student studentRes = studentService.getStudent(id);

        if(studentRes == null){
            return ResponseEntity.notFound().build();
        }

        return ResponseEntity.ok(studentRes);
    }

    @GetMapping
    public ResponseEntity<List<Student>> getAllStudent(){
        List<Student> studentRes = studentService.getAllStudent();

        return ResponseEntity.ok(studentRes);
    }
}
