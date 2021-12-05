package com.spring.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.entity.Department;
import com.spring.entity.Employee;
import com.spring.repository.DepartmentRepository;
import com.spring.repository.EmployeeRepository;

@Service
public class EmployeeService {
@Autowired
private EmployeeRepository employeeRepository;
@Autowired
private DepartmentRepository departmentRepository;

public void saveEmployee(Employee emp)
{
	employeeRepository.save(emp);	
}

public void saveEmpployee(Department dept)
{
	departmentRepository.save(dept);
}

public List<Map> findAll(){
	return employeeRepository.getEmpList();
}
}
