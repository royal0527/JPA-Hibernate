package com.in28Mintues.learn_jpa_and_hibernate.course.jdbc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class CourseJdbcCommandLineRunner implements CommandLineRunner {

    @Autowired
    private CourseJdbcRepository courseJdbcRepository;

    @Override
    public void run(String... args) throws Exception {
     /*   courseJdbcRepository.insert(new Course(1L,"gcp","Rajusk0527"));
        courseJdbcRepository.insert(new Course(2L,"gcp","Rajusk0527"));
        courseJdbcRepository.delete(1L);

        courseJdbcRepository.select(2L);
        System.out.print(courseJdbcRepository.select(2L));*/
    }
}
