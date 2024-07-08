package com.in28Mintues.learn_jpa_and_hibernate.course.jdbc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class CourseJdbcRepository {

    @Autowired
    private JdbcTemplate jdbcTemplate;
    //hardcoded values
    private static String INSERT_QUERY =
            """ 
                    insert into course (id, name, author) values(
                    ?, ?, ?)
                    
                    """;

    private static String DELETE_QUERY =
            """ 
                    delete from  course where id=?
                    
                    """;

    private static String SELECT_QUERY =
            """ 
                    select * from  course where id=?
                    
                    """;

    public void insert(Course course){
        jdbcTemplate.update(INSERT_QUERY,course.getId(),course.getName(),course.getAuthor());
    }

    public void delete(Long id){
        jdbcTemplate.update(DELETE_QUERY,id);
    }

    public Course select(Long id){
        return jdbcTemplate.queryForObject(SELECT_QUERY,new BeanPropertyRowMapper<>(Course.class),id);
    }



}
