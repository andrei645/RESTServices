package com.example.laborator11;

import com.example.laborator11.person.Person;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@SpringBootApplication

public class Laborator11Application {

    public static void main(String[] args) {

        SpringApplication.run(Laborator11Application.class, args);

    }

}
