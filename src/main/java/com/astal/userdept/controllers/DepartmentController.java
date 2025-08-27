package com.astal.userdept.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.astal.userdept.entities.Department;
import com.astal.userdept.repositories.InnerDepartmentRepository;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
@RequestMapping(value = "/departments")
public class DepartmentController {

    @Autowired
    private InnerDepartmentRepository repository;

    @GetMapping
    public List<Department> getAllDepartments() {
        return repository.findAll();
    }

    @GetMapping(value = "/{id}")
    public Department getDepartmentById(@PathVariable Long id) {
        Department result = repository.findById(id).orElse(null);
        return result;
    }
    
    @PostMapping
    public Department insert(@RequestBody Department department) {
        Department result = repository.save(department);
        return result;
    }
    
}