package com.example.tomcat_spring_demo_v2.controller.request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AuthorRequest {

    private String username;

    private String address;

    private String email;

    private String telephone;

}
