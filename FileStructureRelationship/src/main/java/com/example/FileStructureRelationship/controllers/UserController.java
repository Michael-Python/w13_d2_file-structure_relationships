package com.example.FileStructureRelationship.controllers;

import com.example.FileStructureRelationship.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
public class UserController {
    @Autowired
    UserRepository userRepository;

    @GetMapping(value = "/users")
    public List<User> getAllUsers(){
        return userRepository.findAll();
    }

    @GetMapping(value = "/users/{id}")
    public Optional<User> getUser(@PathVariable Long id){
        return userRepository.findById(id);
    }
}
