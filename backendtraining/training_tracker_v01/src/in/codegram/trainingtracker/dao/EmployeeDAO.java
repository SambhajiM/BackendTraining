package in.codegram.trainingtracker.dao;

import java.util.List;

import in.codegram.trainingtracker.modal.Employee;

/**
 * This is EmployeeDAO interface will work on the CRUD for project
 * @author ranjeet
 *
 */
public interface EmployeeDAO {
	/**
	 * This is save method will save the Employee in the database
	 * 
	 * @param employee
	 */
	void save(Employee employee);
	/**
	 * This update method will update the employeeName
	 * @param employeeName
	 */
	void update(Integer id, String employeeName);
	/**
	 * This list method will return all employee list
	 * 
	 * @return List of project if found
	 */
	List<Employee> list();
	/**
	 * This delete method will delete the employee based on id provided
	 * 
	 * @param id
	 */
	void delete(Integer id); 
	
	List<Employee> searchEmpByName(String empName);
}
