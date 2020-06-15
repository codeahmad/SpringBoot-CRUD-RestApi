package com.code.ahmad.springBootCrudRestApi.Service;

import java.util.List;

import com.code.ahmad.springBootCrudRestApi.Entity.Employee;

public interface EmployeeService {
	
	public List <Employee> findAll();
	
	public Employee findById(int id);

	public void saveEmployee(Employee employee);

	public void deleteEmployee(int id);
}
