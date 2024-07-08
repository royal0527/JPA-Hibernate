package com.in28Mintues.learn_jpa_and_hibernate.course.jpa;

import com.in28Mintues.learn_jpa_and_hibernate.course.jdbc.Course;
import jakarta.transaction.Transactional;
import lombok.extern.java.Log;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
@Transactional
@Log
public class CourseCommandLineRunner implements CommandLineRunner {

    @Autowired
    private CourseEntitymanagerRepository courseJpaRepository;

    @Autowired
    private CourseSpringJpaRepository courseSpringJpaRepository;

    @Override
    public void run(String... args) throws Exception {

        courseSpringJpaRepository.save(new Course(1L,"Rajuks","rome"));
        courseSpringJpaRepository.save(new Course(2L,"Rajuks","rome"));
        courseSpringJpaRepository.deleteById(1L);
        courseSpringJpaRepository.findById(2L);
        courseSpringJpaRepository.findByAuthor("rome").stream().forEach(System.out::println);

    }
}
