package OOP.EmployeeManagementProject.business;

import java.util.List;
import java.util.Map;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import OOP.EmployeeManagementProject.entities.Employee;

public interface BaseEmployeeService {
	
	public List<Employee> getAllEmployees();
	public Employee createEmployee(@RequestBody Employee employee);
	public ResponseEntity<Employee> getEmployeeById(@PathVariable Long id);
	public ResponseEntity<Employee> updateEmployee(@PathVariable Long id, @RequestBody Employee employeeDetails);
	public ResponseEntity<Map<String, Boolean>> deleteEmployee(@PathVariable Long id);
	

}
