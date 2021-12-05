package com.spring.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.spring.entity.Department;

@Repository
public interface DepartmentRepository extends CrudRepository<Department, Integer>{

}
