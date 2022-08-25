package in.codegram.employee_module.serviceImpl;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.codegram.employee_module.exception.EmployeeIdException;
import in.codegram.employee_module.modal.Employee;
import in.codegram.employee_module.repository.EmployeeRepository;
import in.codegram.employee_module.service.EmployeeService;

@Service
public class EmployeeServiceImpl {

	
	
//	@Autowired
//	EmployeeRepository employeeRepository;

//	@Override
//	public Employee saveOrUpdate(Employee employee) {
//		return employeeRepository.save(employee);
//	}

//	@Override
//	public Employee findEmployeeById(Long employeeId) {
//		Employee employee = employeeRepository.findByEmployeeId(employeeId);
//		if(employee == null) {
//			throw new EmployeeIdException("Employee ID"+employee.getEmployeeId()+" already exist");
//		}
//		return employee;
//	}
	
//	@Override
//	public Employee findByEmployeeEmailId(String emailId) {
//		Employee employee = employeeRepository.findByEmailId(emailId);
//		if(employee == null) {
//			throw new EmployeeIdException("Employee email ID"+employee.getEmailId()+" already exist");
//		}
//		return employee;
//	}

//	@Override
//	public List<Employee> findAllEmployee() {
//		return employeeRepository.findAll();
//	}

}
