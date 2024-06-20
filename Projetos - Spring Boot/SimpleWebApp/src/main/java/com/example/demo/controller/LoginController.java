package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {

    @GetMapping("/login")
    public String showLoginForm() {
        return "login";
    }

    @PostMapping("/login")
    public String processLogin(@RequestParam String username, @RequestParam String password, Model model) {
        // Aqui você pode adicionar lógica de autenticação
        if ("user".equals(username) && "password".equals(password)) {
            model.addAttribute("message", "Login successful!");
            return "index"; // Redireciona para a página inicial ou outra página de sucesso
        } else {
            model.addAttribute("message", "Invalid username or password.");
            return "login"; // Volta para a página de login com a mensagem de erro
        }
    }
}
