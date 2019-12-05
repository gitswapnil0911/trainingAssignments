package com.training.myapp.client;

import com.training.myapp.model.Course;
import com.training.myapp.model.Student;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import java.util.Arrays;
import java.util.List;

public class ManyToOneDemo {
    public static void main(String[] args) {
        /*Course java = new Course();
        java.setCourseId(101);
        java.setCourseName("JAVA");
        java.setCourseFee(12000);

        Course python = new Course();
        python.setCourseId(102);
        python.setCourseName("Python");
        python.setCourseFee(15000);

        Student john = new Student();
        john.setStudentId(1);
        john.setStudentName("John Doe");

        java.setStudent(john);
        python.setStudent(john);

        List<Course> courses = Arrays.asList(java, python);
        john.setCourses(courses);
*/
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("myapp");
        EntityManager entityManager = factory.createEntityManager();

        EntityTransaction tx = entityManager.getTransaction();
        tx.begin();

        /*entityManager.persist(john);
        entityManager.persist(java);
        entityManager.persist(python);
*/
        Student john = entityManager.find(Student.class,1);
        System.out.println(john.getStudentId());
        System.out.println(john.getStudentName());

        List<Course>  courses = john.getCourses();
        for(Course course: courses){
            System.out.println(course.getCourseId() + " - " + course.getCourseName() + " - "+ course.getCourseFee());
        }

        Course course = entityManager.find(Course.class, 101);
        System.out.println(course.getCourseId() + " - " + course.getCourseName() + " - " + course.getCourseFee());

        Student student = course.getStudent();
        System.out.println(student.getStudentId() + " - " + student.getStudentName());

        tx.commit();
        entityManager.close();
        factory.close();
    }
}
