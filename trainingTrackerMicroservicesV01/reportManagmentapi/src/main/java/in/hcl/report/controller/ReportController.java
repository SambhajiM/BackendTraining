package in.hcl.report.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import in.hcl.report.model.EmployeeManagment;
import in.hcl.report.model.ScheduleManagment;

@RestController
@RequestMapping("/reports")
public class ReportController {
	
	@Autowired
	private RestTemplate restTemplate;

	@GetMapping("Employeereport/{EmployeeId}")
	public ResponseEntity<?> getReport(@PathVariable("EmployeeId") Long EmployeeId) {
		List<EmployeeManagment> Employees = restTemplate.getForObject("http://Employee-service/Employees/" + EmployeeId,
				List.class);
		return new ResponseEntity<List<EmployeeManagment>>(Employees, org.springframework.http.HttpStatus.OK);
	}

	@GetMapping("Employeereport/all")
	public ResponseEntity<?> getReportAll() {
		List<EmployeeManagment> Employees = restTemplate.getForObject("http://Employee-service/Employees/all", List.class);
		return new ResponseEntity<List<EmployeeManagment>>(Employees, org.springframework.http.HttpStatus.OK);
	}

	@GetMapping("ScheduleManagmentreport/{ScheduleId}")
	public ResponseEntity<?> getReport1(@PathVariable("ScheduleId") Long ScheduleId) {
		List<ScheduleManagment> Scheduled = restTemplate.getForObject("http://Employee-service/Employees/" + ScheduleId,
				List.class);
		return new ResponseEntity<List<ScheduleManagment>>(Scheduled, org.springframework.http.HttpStatus.OK);
	}

	@GetMapping("ScheduleManagmentreport/all")
	public ResponseEntity<?> getReportAll1() {
		List<ScheduleManagment> Scheduled = restTemplate.getForObject("http://Employee-service/Employees/all", List.class);
		return new ResponseEntity<List<ScheduleManagment>>(Scheduled, org.springframework.http.HttpStatus.OK);
	}
}

	
	


