package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.model.User;
import com.example.demo.repository.UserRepository;

@Service
public class UserService {

    private final UserRepository userRepository;

    @Autowired
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    // Método para registrar um novo usuário
    public User registerUser(User user) {
        return userRepository.save(user);
    }

    // Método para encontrar um usuário pelo nome de usuário
    public User findByUsername(String username) {
        return userRepository.findByUsername(username);
    }
}
