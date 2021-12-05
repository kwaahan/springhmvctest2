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
public class Department implements Serializable {
private final static long serialVersionId=1l;
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private int dept_id;
@Column(name="dept_name")
private String dept_name;
@Column(name="dept_add")
private String dept_add;

private Employee employee;

public int getDept_id() {
	return dept_id;
}
public void setDept_id(int dept_id) {
	this.dept_id = dept_id;
}
public String getDept_name() {
	return dept_name;
}
public void setDept_name(String dept_name) {
	this.dept_name = dept_name;
}
public String getDept_add() {
	return dept_add;
}
public void setDept_add(String dept_add) {
	this.dept_add = dept_add;
}
public Employee getEmployee() {
	return employee;
}
public void setEmployee(Employee employee) {
	this.employee = employee;
}

}
