package com.example.tomcat_spring_demo_v2.controller;

import com.example.tomcat_spring_demo_v2.controller.request.AuthorRequest;
import com.example.tomcat_spring_demo_v2.service.AuthorService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@AllArgsConstructor
@RequestMapping("/api/v1/authors")
public class AuthorController {

    private final AuthorService authorService;

    @PostMapping
    @ResponseStatus(HttpStatus.OK)
    public String save(@RequestBody AuthorRequest authorRequest) {
        return authorService.save(authorRequest);
    }

}
