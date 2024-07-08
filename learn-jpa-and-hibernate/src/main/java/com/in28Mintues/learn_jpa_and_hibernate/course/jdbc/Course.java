package com.in28Mintues.learn_jpa_and_hibernate.course.jdbc;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Course {

    @Id
    private Long id;
    @Column(name = "name")
    private String name;
    @Column(name = "author")
    private String author;

}
