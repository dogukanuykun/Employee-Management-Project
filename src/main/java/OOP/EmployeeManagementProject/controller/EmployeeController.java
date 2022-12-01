package OOP.EmployeeManagementProject.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import OOP.EmployeeManagementProject.model.Employee;
import OOP.EmployeeManagementProject.repository.EmployeeRepository;


@RestController
@RequestMapping("/api/employees")
@CrossOrigin(origins = "http://localhost:3000")
public class EmployeeController {

	@Autowired
	private EmployeeRepository employeeRepository;
	
	//get all employees
	@GetMapping("/getAll")
	public List<Employee> getAllEmployees(){
		return employeeRepository.findAll();
	}
	
}
