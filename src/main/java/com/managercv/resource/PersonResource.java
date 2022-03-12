package com.managercv.resource;

import com.managercv.resource.model.Person;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;

@RestController
@RequestMapping("/person")
public class PersonResource {

    @GetMapping
    public ResponseEntity<Person> find(){
        Person person = Person.builder()
                .id(1L)
                .name("Andre")
                .birthday(LocalDate.of(1980,11,9))
                .build();
        return ResponseEntity.status(HttpStatus.CREATED).body(person);
    }
}
