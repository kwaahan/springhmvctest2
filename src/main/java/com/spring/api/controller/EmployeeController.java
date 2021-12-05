package com.spring.api.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.entity.Employee;
import com.spring.service.EmployeeService;
@RestController
@RequestMapping("/api/emp")
public class EmployeeController {
@Autowired
private EmployeeService employeeService;
@PostMapping("/save")
public String save(@RequestBody Employee emp)
{
	employeeService.saveEmployee(emp);
	return "save successfullly";
}
@GetMapping("/findAll")
public List<Map> getAllEmployee(){
	return employeeService.findAll();
}


}
