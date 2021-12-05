package com.spring.repository;

import java.util.List;
import java.util.Map;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.spring.entity.Employee;

@Repository
public interface EmployeeRepository extends CrudRepository<Employee, Integer>{
	@Query(value="select e.id as id, from employee e inner join department d on e.id=d.id",nativeQuery = true)
	public List<Employee> getEmpListResult();
	
	@Query(value="SELECT e.id as id, address, department, employee_name, emp_salary,dept_add,dept_name FROM employee_master e INNER JOIN dept_master d on e.id=d.id",nativeQuery = true)
	public List<Map> getEmpList();

}
