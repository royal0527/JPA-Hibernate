package com.in28Mintues.learn_jpa_and_hibernate.course.jpa;

import com.in28Mintues.learn_jpa_and_hibernate.course.jdbc.Course;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CourseSpringJpaRepository extends JpaRepository<Course,Long> {

    List<Course> findByAuthor(String author);


}
