package com.code.ahmad.springBootCrudRestApi.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.code.ahmad.springBootCrudRestApi.Entity.Employee;
import com.code.ahmad.springBootCrudRestApi.Exception.EmployeeNotFoundException;
import com.code.ahmad.springBootCrudRestApi.Service.EmployeeService;

@RestController
@RequestMapping("/api")
public class EmployeeController {

	// Creating Employee service object
	@Autowired
	private EmployeeService service;

	// Creating global employee list
	List <Employee> employeeList;
	
	@GetMapping("/employees")
	public List<Employee> listEmployee(Model model) {
		
		// Getting list of employees from the service
		employeeList = service.findAll();

		// Adding list to the model
		model.addAttribute("employeeModel", employeeList);

		return employeeList;
	}
	
	@PostMapping("/employees")
	public Employee saveEmployee(@RequestBody Employee employee) {
		
		// Setting id to 0 if passed 
		employee.setId(0);
		
		// Adding employee to database using service
		service.saveEmployee(employee);
		
		return employee;
	}
	
	@GetMapping("/employees/{employeeId}")
	public Employee findById(@PathVariable int employeeId) {
		
		// Finding employee by id
		Employee employee = service.findById(employeeId);
				
		// Checking employee
 		if(employee == null) {
			throw new EmployeeNotFoundException("Employee id is not available: " + employeeId);
		}
		
		return employee;
	}
	
	@PutMapping("/employees")
	public Employee updateEmployee(@RequestBody Employee employee) {
		
		// Adding employee to database using service
		service.saveEmployee(employee);
		
		return employee;
	}	
	
	@DeleteMapping("/employees/{employeeId}")
	public String deleteEmployee(@PathVariable int employeeId) {
		
		// Calling service to delete by id
		service.deleteEmployee(employeeId);
		return "Employee with the id of: " + employeeId+ " is deleted." ;
	}
}
