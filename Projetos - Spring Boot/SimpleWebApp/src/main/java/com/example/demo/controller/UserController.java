package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import com.example.demo.model.User;
import com.example.demo.service.UserService;

@Controller
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/register")
    public String showRegistrationForm(Model model) {
        model.addAttribute("message", "");
        return "register";
    }

    @PostMapping("/register")
    public String registerUser(@RequestParam String fullname,
                               @RequestParam String username,
                               @RequestParam String password,
                               Model model) {
        User user = new User();
        user.setFullname(fullname);
        user.setUsername(username);
        user.setPassword(password);
        
        try {
            userService.registerUser(user);
            model.addAttribute("message", "Usuário registrado com sucesso!");
            return "login"; // Redireciona para a página de login
        } catch (Exception e) {
            model.addAttribute("message", "Erro ao registrar o usuário.");
            return "register";
        }
    }

    @GetMapping("/login")
    public String showLoginForm(Model model) {
        model.addAttribute("errorMessage", "");
        return "login";
    }

    @PostMapping("/login")
    public String loginUser(@RequestParam String username,
                            @RequestParam String password,
                            Model model) {
        User user = userService.findByUsername(username);
        
        if (user != null && user.getPassword().equals(password)) {
            model.addAttribute("fullname", user.getFullname());
            model.addAttribute("message", "Login bem-sucedido!");
            return "welcome"; // Redireciona para a página de boas-vindas
        } else {
            model.addAttribute("errorMessage", "Nome de usuário ou senha incorretos.");
            return "login";
        }
    }
}
