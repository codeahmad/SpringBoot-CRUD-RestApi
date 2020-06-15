package com.code.ahmad.springBootCrudRestApi.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.code.ahmad.springBootCrudRestApi.Dao.EmployeeDao;
import com.code.ahmad.springBootCrudRestApi.Entity.Employee;

@Service
public class EmployeeServiceImplementation implements EmployeeService{

	@Autowired
	private EmployeeDao dao;
	
	@Override
	@Transactional
	public List<Employee> findAll() {
		// Calling dao to find all 
		return dao.findAll();
	}

	@Override
	@Transactional
	public Employee findById(int id) {
		// Calling dao find by id
		return dao.findById(id);
	}

	@Override
	@Transactional
	public void saveEmployee(Employee employee) {
		// Calling dao to save or update
		dao.saveEmployee(employee);
	}

	@Override
	@Transactional
	public void deleteEmployee(int id) {
		// Calling dao to delelte by id
		dao.deleteEmployee(id);	
	}
}
