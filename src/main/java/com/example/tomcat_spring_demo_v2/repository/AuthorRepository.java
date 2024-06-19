package com.example.tomcat_spring_demo_v2.repository;

import com.example.tomcat_spring_demo_v2.entity.Author;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthorRepository extends JpaRepository<Author, Long> {
}
