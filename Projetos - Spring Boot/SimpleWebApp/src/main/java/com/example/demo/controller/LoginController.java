package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.HashMap;
import java.util.Map;

@Controller
public class LoginController {

    private Map<String, String> userDatabase = new HashMap<>(); // Simples banco de dados em memória

    @GetMapping("/login")
    public String showLoginForm(Model model) {
        model.addAttribute("errorMessage", "");
        return "login";
    }

    @PostMapping("/login")
    public String processLogin(@RequestParam String username, @RequestParam String password, Model model) {
        if (userDatabase.containsKey(username) && userDatabase.get(username).equals(password)) {
            model.addAttribute("message", "Login bem-sucedido!");
            return "index";
        } else {
            model.addAttribute("errorMessage", "Nome de usuário ou senha inválidos.");
            return "login";
        }
    }

    @GetMapping("/register")
    public String showRegisterForm(Model model) {
        model.addAttribute("message", "");
        return "register";
    }

    @PostMapping("/register")
    public String processRegister(@RequestParam String username, @RequestParam String password, Model model) {
        if (userDatabase.containsKey(username)) {
            model.addAttribute("message", "O nome de usuário já existe.");
        } else {
            userDatabase.put(username, password);
            model.addAttribute("message", "Registrado com sucesso!");
        }
        return "register";
    }
}
