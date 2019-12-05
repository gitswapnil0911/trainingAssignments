package com.example.studentdetailproject.controller;

import com.example.studentdetailproject.entity.Student;
import com.example.studentdetailproject.services.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.annotation.Secured;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentController {

    @Autowired
    private StudentService service;

    @GetMapping(value = "/student")
    public List<Student> getStudent(){

        return this.service.getAll();
    }

    @Secured("ROLE_PROF")
    @GetMapping(value = "/student/name/{name}")
    public Student findStudentByName(@PathVariable("name") String studentName){

        return this.service.findStudentByStudentName(studentName);
    }

    @Secured("ROLE_PROF")
    @PostMapping(value = "/student", produces = "application/JSON", consumes = "application/JSON")
    public Student addStudent(@RequestBody Student Student){

        return this.service.addStudent(Student);
    }

    @Secured("ROLE_PROF")
    @GetMapping(value = "/student/dept/{dept}")
    public List<Student> findStudentByDepartement(@PathVariable("dept") String studentDepartement){

        return this.service.findStudentByStudentDepartement(studentDepartement);
    }

    @Secured("ROLE_PROF")
    @GetMapping(value = "/student/id/{id}")
    public Student findStudentById(@PathVariable("id") int id){

        return this.service.findStudentByStudentId(id);
    }

    @Secured("ROLE_PROF")
    @PutMapping(value = "/student", produces = "application/JSON", consumes = "application/JSON")
    public Student updateStudent(@RequestBody Student Student){

        return this.service.addStudent(Student);
    }

    @Secured("ROLE_PROF")
    @DeleteMapping(value = "/student/{id}")
    public void deleteStudent(@PathVariable("id") int id){

        this.service.deleteStudent(id);
    }
}
