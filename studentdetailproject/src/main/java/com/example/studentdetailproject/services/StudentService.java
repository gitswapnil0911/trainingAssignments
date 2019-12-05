package com.example.studentdetailproject.services;

import com.example.studentdetailproject.entity.Student;
import com.example.studentdetailproject.repo.StudentRepository;
import lombok.var;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    @Autowired
    private StudentRepository repo;

    public List<Student> getAll(){

        return this.repo.findAll();
    }


    public Student addStudent(Student student){

        return this.repo.save(student);
    }

    // method should have a return a value
    public String deleteStudent(int id){
        String message="";
        this.repo.deleteById(id);
        boolean isDeleted = this.repo.existsById(id);
        if(isDeleted){
            message = "Student with ID " + id + "is not deleted";
        }
        else{
            message = "Student with ID " + id + "is deleted";
        }
        return message;
    }

    public Student findStudentByStudentName(String studentName){

        return this.repo.findStudentByStudentName(studentName);
    }

    public Student findStudentByStudentId(int studentId){

        return this.repo.findStudentByStudentId(studentId);
    }

    public List<Student> findStudentByStudentDepartement(String studentDepartement){

        return this.repo.findStudentByStudentDepartement(studentDepartement);
    }

}
