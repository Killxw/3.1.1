package com.example.demo.service;


import com.example.demo.model.User;

import java.util.List;
import java.util.Optional;

public interface UserService {
    void add(User user);
    void delete(Long id);
    void change(User user);
    List<User> listUsers();
    Optional<User> findUserById(Long id);
}
