package com.example.tomcat_spring_demo_v2.service.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AuthorDto {

        private String username;
        private String address;
        private String email;
        private String telephone;
        private LocalDateTime registrationDate;

}
