package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {

    @GetMapping("/hello")
    public String sayHello(Model model) {
        model.addAttribute("name", "Teste"); // Adiciona a variável "name" ao modelo
        return "index"; // Retorna o template "index.html" (sem a extensão)
    }
}
