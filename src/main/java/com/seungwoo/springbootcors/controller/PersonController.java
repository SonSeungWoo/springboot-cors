package com.seungwoo.springbootcors.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.seungwoo.springbootcors.domain.Person;

@RestController
public class PersonController {

    //@CrossOrigin
    @GetMapping("/person")
    public Person person(){
        Person person = new Person();
        person.setName("seungwoo");
        person.setEmail("seungwoo@test.com");
        return person;
    }
}