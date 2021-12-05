package com.spring.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Employee implements Serializable{
private final static long serialVersionId=1l; 
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private int id;
@Column(name="employee_name")
private String emp_name;
@Column(name="address")
private String emp_address;
@Column(name="emp_salary")
private int emp_salary;

private Department department;

public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getEmp_name() {
	return emp_name;
}
public void setEmp_name(String emp_name) {
	this.emp_name = emp_name;
}
public String getEmp_address() {
	return emp_address;
}
public void setEmp_address(String emp_address) {
	this.emp_address = emp_address;
}
public int getEmp_salary() {
	return emp_salary;
}
public void setEmp_salary(int emp_salary) {
	this.emp_salary = emp_salary;
}

public Department getDepartment() {
	return department;
}
public void setDepartment(Department department) {
	this.department = department;
}



}
