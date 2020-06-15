package com.code.ahmad.springBootCrudRestApi.Dao;

import java.util.List;

import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.code.ahmad.springBootCrudRestApi.Entity.Employee;

@Repository
public class EmployeeDaoImplementation implements EmployeeDao {

	// Creating entityManager object
	@Autowired
	private EntityManager entityManager;

	@Override
	public List<Employee> findAll() {

		// Creating query to find all employees
		List<Employee> employeeList = 
				entityManager.createQuery("from Employee", Employee.class).getResultList();

		return employeeList;
	}

	@Override
	public Employee findById(int id) {
		
		// Creating query to find by id
		Employee employee = entityManager.find(Employee.class, id);
		return employee;
	}

	@Override
	public void saveEmployee(Employee employee) {
	
		// Creating query to save new or update
		entityManager.merge(employee);
	}

	@Override
	public void deleteEmployee(int id) {
		
		// Find by id and apply delete method
		Employee employee = entityManager.find(Employee.class, id);
		entityManager.remove(employee);
	}

}