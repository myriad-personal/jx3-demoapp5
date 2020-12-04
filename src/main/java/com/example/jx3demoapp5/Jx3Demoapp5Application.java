package com.example.jx3demoapp5;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@SpringBootApplication
@RestController
@RequestMapping(path = "/")
public class Jx3Demoapp5Application {

    public static void main(String[] args) {
        SpringApplication.run(Jx3Demoapp5Application.class, args);
    }

    @GetMapping
    public Map<String, String> hello() {
        return Map.of("hello","world!");
    }

}
