package OOP.EmployeeManagementProject.business;

import java.util.List;
import java.util.Map;

import org.springframework.http.ResponseEntity;
import OOP.EmployeeManagementProject.entities.Employee;

public interface BaseEmployeeService {
	
	public List<Employee> getAllEmployees();
	public Employee createEmployee(Employee employee);
	public ResponseEntity<Employee> getEmployeeById(Long id);
	public ResponseEntity<Employee> updateEmployee(Long id,  Employee employeeDetails);
	public ResponseEntity<Map<String, Boolean>> deleteEmployee(Long id);
	public ResponseEntity<Employee> giveCommission(Long id);

}
