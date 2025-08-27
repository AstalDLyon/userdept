package com.astal.userdept.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.astal.userdept.entities.User;
import com.astal.userdept.repositories.InnerUserRepository;

@RestController
@RequestMapping(value = "/users") // se eu acessar o localhost:8080/users estarei acessando aqui
public class UserController {

    @Autowired
    private InnerUserRepository repository;

    @GetMapping
    public List<User> getAllUsers() {
        return repository.findAll();
    }

}
