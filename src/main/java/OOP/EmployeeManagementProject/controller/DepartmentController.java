package OOP.EmployeeManagementProject.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import OOP.EmployeeManagementProject.exception.ResourceNotFoundException;
import OOP.EmployeeManagementProject.entities.Department;
import OOP.EmployeeManagementProject.repository.DepartmentRepository;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "http://localhost:3000")
public class DepartmentController {
	
	@Autowired
	private DepartmentRepository departmentRepository;
	
	@GetMapping("/departments")
	private List<Department> getAllDepartments(){
		return departmentRepository.findAll();
	}
	
	@PostMapping("/departments")
	private Department createDepartment(@RequestBody Department department){
		return departmentRepository.save(department);
	}
	
	@GetMapping("/departments/{id}")
	private ResponseEntity<Department> getDepartmentById(@PathVariable Long id){
		Department department = departmentRepository.findById(id)
				.orElseThrow(() -> new ResourceNotFoundException("Department does not exist with id: "+ id));
		return ResponseEntity.ok(department);
	}
	
	@PutMapping("/departments/{id}")
	private ResponseEntity<Department> updateDepartment(@RequestBody Department departmentDetails, @PathVariable Long id){
		Department department = departmentRepository.findById(id)
				.orElseThrow(() -> new ResourceNotFoundException("Department does not exist with id: "+id));
		department.setDepartmentName(departmentDetails.getDepartmentName());
		Department  updatedDepartment = departmentRepository.save(department);
		return ResponseEntity.ok(updatedDepartment);
	
	}
	
	@DeleteMapping("/departments/{id}")
	public ResponseEntity<Map<String, Boolean>> deleteDepartment(@PathVariable Long id){
		Department department = departmentRepository.findById(id)
				.orElseThrow(() -> new ResourceNotFoundException("Department does not exist with id: "+id));
		
		departmentRepository.delete(department);
		Map<String, Boolean> response = new HashMap<>();
		response.put("deleted", Boolean.TRUE);
		return ResponseEntity.ok(response);
	}
	
	

}
