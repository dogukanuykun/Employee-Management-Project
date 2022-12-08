package OOP.EmployeeManagementProject.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import OOP.EmployeeManagementProject.entities.Department;

@Repository
public interface DepartmentRepository extends JpaRepository<Department, Long> {

}
