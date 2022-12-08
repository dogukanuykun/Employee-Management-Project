package OOP.EmployeeManagementProject.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import OOP.EmployeeManagementProject.business.EmployeeManager;
import OOP.EmployeeManagementProject.entities.Employee;


@RestController
@RequestMapping("/api")
public class EmployeeController {

	private EmployeeManager employeeManager;
	
	@Autowired
	public EmployeeController(EmployeeManager employeeManager) {
		super();
		this.employeeManager = employeeManager;
		
	}
	
	//get all employees
	@GetMapping("/employees")
	public List<Employee> getAllEmployees(){
		return employeeManager.getAllEmployees();
	}
	
	//create a employee
	@PostMapping("/employees")
	public Employee createEmployee(@RequestBody Employee employee) {
		return employeeManager.createEmployee(employee);
	}
	
	@GetMapping("/employees/{id}")
	public ResponseEntity<Employee> getEmployeeById(@PathVariable Long id) {
		return employeeManager.getEmployeeById(id);
		
	}
	
	@PutMapping("/employees/{id}")
	public ResponseEntity<Employee> updateEmployee(@PathVariable Long id, @RequestBody Employee employeeDetails){
		return employeeManager.updateEmployee(id, employeeDetails);
		
	}
	
	@DeleteMapping("/employees/{id}")
	public ResponseEntity<Map<String, Boolean>> deleteEmployee(@PathVariable Long id){
		return employeeManager.deleteEmployee(id);
		
	}
	
}
