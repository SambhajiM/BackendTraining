package com.example.controller;

import java.net.http.HttpRequest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Employee {
	
	public ResponseEntity<?> getEmployeeById(@PathVariable long id){
		if( id == 0) {
			System.out.println(" invalid Emplyee id " + id);
			return new ResponseEntity<String>("invalid Emplyee id " + id, HttpStatus.BAD_REQUEST);
		}else if( id == -1){
			System.out.println(" invalid Emplyee id" + id);
			return new ResponseEntity<String>("invalid Emplyee id " + id, HttpStatus.BAD_REQUEST);
		}else {
			Employee employee = employeeRepository.findById(id).orElseThrow(() ->
			new ResourceNotFoundException("Employee not exist with id" + id));
			return new ResponseEntity<Employee>(employee , HttpStatus.OK);
		}
	}

}
