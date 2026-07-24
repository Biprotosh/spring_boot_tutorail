package com.springboottutorial.crud_spring_boot_demo.controller;

import com.springboottutorial.crud_spring_boot_demo.service.StudentService;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.springboottutorial.crud_spring_boot_demo.entity.Student;

import java.util.List;

@RestController
@RequestMapping("/api/students") // all the endpoints start with /api/students
public class StudentController {

    private StudentService studentService;

    public StudentController(StudentService studentService){
        this.studentService = studentService;
    }

    // create a student
    @PostMapping // for POST http operation. If anyone hit the endpoint createStudent() will get call
    public ResponseEntity<Student> createStudent(@RequestBody Student student){
        System.out.println("Inside student controller");

        Student createdStudent = studentService.createStudent(student);

        System.out.println("Exiting student controller");

        return ResponseEntity
                .status(201)
                .body(createdStudent);
    }

    // get a student. the id var in url and in the function parameter need to be same for request parameter
    @GetMapping("/get")
    public ResponseEntity<Student> getStudent(@RequestParam Long id){
        Student studentRes = studentService.getStudent(id);

        if(studentRes == null)
            return ResponseEntity.notFound().build();

        return ResponseEntity
                .status(200)
                .body(studentRes);
    }

    // get all student
    @GetMapping("/")
    public ResponseEntity<List<Student>> getAllStudent(){
        List<Student> studentList = studentService.getAllStudent();

        if(studentList.isEmpty())
            return ResponseEntity.notFound().build();

        return ResponseEntity
                .status(200)
                .body(studentList);
    }

    // update a student
    @PutMapping("/{id}")
    public ResponseEntity<Student> updateStudent(@PathVariable Long id, @RequestBody Student studentReq){
        Student studentRes = studentService.updateStudent(id, studentReq);

        if(studentRes == null)
            return ResponseEntity.notFound().build();

        return ResponseEntity
                .status(200)
                .body(studentRes);
    }

    //delete a student
    @DeleteMapping("/{id}")
    public ResponseEntity<Student> deleteStudent(@PathVariable Long id){
        Student deletedStudent = studentService.deleteStudent(id);

        if(deletedStudent == null)
            return ResponseEntity.notFound().build();

        return ResponseEntity.status(HttpStatus.GONE).body(deletedStudent);
    }

    @PatchMapping("/{id}")
    public ResponseEntity<String> deleteStudentSoftly(@PathVariable Long id){
        Boolean isDeleted = studentService.deleteStudentSoftly(id);

        if(!isDeleted)
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Record not found");

        return ResponseEntity.status(HttpStatus.OK).body("Record Deleted");
    }

}

/*
    @Component is a very generic annotation which says create the bean in IOC container and manage it.
    But as we are following the controller-service-repository architecture we have specific methods like
    @RestController it takes a request and give a response and internally it uses @Component

    To send status code we return ResponseEntity because it helps us to send status code also

    In get a student we can get the id in 2 ways
    1. With path variable - /get/1
    2. With query parameters - /get?id=1&name=bheem

    Patch is used to changa a particular key from a row of data
 */