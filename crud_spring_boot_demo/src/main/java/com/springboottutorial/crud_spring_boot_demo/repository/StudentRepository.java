package com.springboottutorial.crud_spring_boot_demo.repository;

import com.springboottutorial.crud_spring_boot_demo.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {

//    public Student saveStudent(Student studentReq){
//        // save to db
//        System.out.println("Inside student repository");
//        System.out.println("Exiting student repository");
//
//        Student dummyStudent = new Student();
//
//        dummyStudent.setAge(150);
//        dummyStudent.setName("Tuntun");
//        dummyStudent.setEmail("tuntun.official@gmail.com");
//        dummyStudent.setSubject("Laddo making");
//
//        return dummyStudent; // sending dummy data as response
//    }

    Optional<Student> findByIdAndDeletedIsFalse(Long id);

    List<Student> findAllAndDeletedIsFalse();
}

/*
    JpaRepository<which repository it handles, type of the primary key>.
    We don't need to implement the methods as spring jpa provides the implementation at runtime
    @Repository is optional here as it is an interface and the container doesn't create bean of an interface.
    But an implementation of the interface can be stored in the container.

    We can use this repository by creating our own methods which are complex and haven't provided by jpa
 */