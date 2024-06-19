package com.example.tomcat_spring_demo_v2.service.impl;

import com.example.tomcat_spring_demo_v2.controller.request.AuthorRequest;
import com.example.tomcat_spring_demo_v2.entity.Author;
import com.example.tomcat_spring_demo_v2.repository.AuthorRepository;
import com.example.tomcat_spring_demo_v2.service.AuthorService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDateTime;

@Service
@RequiredArgsConstructor
@Transactional(readOnly = true)
public class AuthorServiceImpl implements AuthorService {

    private final AuthorRepository authorRepository;

    @Override
    @Transactional
    public String save(AuthorRequest author) {
        Author authorForSave = new Author();
        authorForSave.setUsername(author.getUsername());
        authorForSave.setAddress(author.getAddress());
        authorForSave.setTelephone(author.getTelephone());
        authorForSave.setEmail(author.getEmail());
        authorForSave.setRegistrationDate(LocalDateTime.now());
        authorForSave.setBlocked(false);
        Author authorSaved = authorRepository.save(authorForSave);
        if (authorSaved.getId() != null) {
            return "Author saved!!!";
        } else {
            return "Author did not save!!!";
        }
    }
}
