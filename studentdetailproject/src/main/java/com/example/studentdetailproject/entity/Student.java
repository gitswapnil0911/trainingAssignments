package com.example.studentdetailproject.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "JPSTUDENT")
public class Student {

    @Id
    private int studentId;
    private String studentName;
    private String studentDepartement;

}
