package com.astal.userdept.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.astal.userdept.entities.Department;

public interface InnerDepartmentRepository  extends JpaRepository<Department, Long>{

}
