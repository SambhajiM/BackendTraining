package in.codegram.employee_module.service;

import java.util.List;

import in.codegram.employee_module.modal.Employee;
import in.codegram.employee_module.util.Status;

public interface EmployeeService {
	
	public Employee saveOrUpdate(Employee employee);
	
	//public Employee findEmployeeById(Long id);
	
	//public Employee findByEmployeeEmailId(String emailId);
	
	public List<Employee> findAllEmployee();

}
