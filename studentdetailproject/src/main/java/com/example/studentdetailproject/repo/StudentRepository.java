package com.example.studentdetailproject.repo;

import com.example.studentdetailproject.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentRepository extends JpaRepository<Student, Integer> {

    public Student findStudentByStudentName(String studentName);
    public Student findStudentByStudentId(int studentId);
    public List<Student> findStudentByStudentDepartement(String studentDepartement);

}
