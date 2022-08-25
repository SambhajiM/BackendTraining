package in.codegram.employee_module.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import in.codegram.employee_module.modal.Employee;


@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long>{


}

//@Repository
//public interface EmployeeRepository extends JpaRepository<Employee, Long>{
//
//	//Employee findByEmployeeId(Long employeeId);
//	//Employee findByEmailId(String emailId);
//}
