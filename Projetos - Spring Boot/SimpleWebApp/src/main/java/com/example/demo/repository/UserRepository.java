package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.demo.model.User;

public interface UserRepository extends JpaRepository<User, Long> {
    // Adicione métodos de consulta personalizados, se necessário
    User findByUsername(String username);
}
