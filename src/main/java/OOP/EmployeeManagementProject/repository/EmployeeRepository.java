package OOP.EmployeeManagementProject.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import OOP.EmployeeManagementProject.model.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
