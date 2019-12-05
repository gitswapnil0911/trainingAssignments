package com.training.myapp.model;

import javax.persistence.*;

@Entity
@Table(name="courses")
public class Course {

    @Id
    private int courseId;
    private String courseName;
    private int courseFee;
    @ManyToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name="student_id")
    private Student student;

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }



    public Course(){}

public int getCourseId() {
        return courseId;
    }

    public void setCourseId(int courseId) {
        this.courseId = courseId;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public int getCourseFee() {
        return courseFee;
    }

    public void setCourseFee(int courseFee) {
        this.courseFee = courseFee;
    }
}
