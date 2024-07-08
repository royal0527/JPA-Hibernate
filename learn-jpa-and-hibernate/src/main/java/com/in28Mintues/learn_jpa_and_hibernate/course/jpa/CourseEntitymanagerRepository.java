package com.in28Mintues.learn_jpa_and_hibernate.course.jpa;

import com.in28Mintues.learn_jpa_and_hibernate.course.jdbc.Course;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;

@Repository
public class CourseEntitymanagerRepository {

    @PersistenceContext
    private EntityManager entityManager;

    public void insert(Course course){
        entityManager.merge(course);
    }

    public Course findById(Long id){
        return entityManager.find(Course.class,id);
    }

    public void delete(Long id){
        Course course=entityManager.find(Course.class,id);
        entityManager.remove(course);
    }
}
