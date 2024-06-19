package com.example.tomcat_spring_demo_v2.service;


import com.example.tomcat_spring_demo_v2.controller.request.AuthorRequest;

public interface AuthorService {

    String save(AuthorRequest author);

}
