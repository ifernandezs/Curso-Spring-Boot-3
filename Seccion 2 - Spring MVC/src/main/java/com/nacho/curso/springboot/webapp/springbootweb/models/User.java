package com.nacho.curso.springboot.webapp.springbootweb.models;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class User {

    private String name;
    private String lastname;
    private String email;

}
