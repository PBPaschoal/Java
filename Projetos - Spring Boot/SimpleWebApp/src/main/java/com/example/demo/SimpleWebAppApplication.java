package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication
public class SimpleWebAppApplication {

    public static void main(String[] args) {
        SpringApplication.run(SimpleWebAppApplication.class, args);
    }

    @Controller
    public class DefaultController {

        @GetMapping("/")
        public String home() {
            return "redirect:/login";
        }
    }
}
