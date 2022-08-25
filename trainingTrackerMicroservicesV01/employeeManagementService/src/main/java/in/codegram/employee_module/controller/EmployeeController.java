package in.codegram.employee_module.controller;


import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import in.codegram.employee_module.modal.Employee;
import in.codegram.employee_module.service.EmployeeService;
import in.codegram.employee_module.serviceImpl.MapValidationErrorService;

@RestController
@RequestMapping("/api/employee")
public class EmployeeController {

//	@Autowired
//	private EmployeeService employeeService;
	
	@Autowired
	private MapValidationErrorService mapValidationErrorService;
	
//	@PostMapping("/create")
//	public ResponseEntity<?> createNewEmployee(@Valid @RequestBody Employee employee, BindingResult result){
//		ResponseEntity<?> errorMap = mapValidationErrorService.mapValidationError(result);
//		if(errorMap!=null) return errorMap;
//		Employee savedEmployee = employeeService.saveOrUpdate(employee);
//    	return new ResponseEntity<Employee>(savedEmployee,HttpStatus.CREATED);
//	}

//	@GetMapping("/{employeeEmailId}")
//    	public ResponseEntity<?> getScheduleByTrainingId(@PathVariable String employeeEmployeeId){
//		Employee employee = employeeService.findByEmployeeEmailId(employeeEmployeeId);
//		return new ResponseEntity<Employee >(employee ,HttpStatus.OK);
//	}
	
//	@GetMapping("/all")
//    public Iterable<Employee > getAllSchedules(){
//		return employeeService.findAllEmployee();
//	}
}
