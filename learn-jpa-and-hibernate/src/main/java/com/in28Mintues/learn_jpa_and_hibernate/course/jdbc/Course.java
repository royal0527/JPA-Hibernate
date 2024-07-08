package com.in28Mintues.learn_jpa_and_hibernate.course.jdbc;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Course {

    private Long id;
    private String name;
    private String author;

}
