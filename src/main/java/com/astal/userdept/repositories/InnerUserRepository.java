package com.astal.userdept.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.astal.userdept.entities.User;

public interface InnerUserRepository extends JpaRepository <User, Long> {

    
} 

