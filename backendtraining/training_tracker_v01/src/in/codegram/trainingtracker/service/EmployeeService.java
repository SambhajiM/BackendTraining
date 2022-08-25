package in.codegram.trainingtracker.service;

import java.util.List;

import in.codegram.trainingtracker.modal.Employee;

/**
 * This EmployeeService interface will perform all the Business logic on Employee
 * @author ranjeet
 *
 */
public interface EmployeeService {
	
	/**
	 * This cretaeProject method will create the employee in system
	 * 
	 * @param employee to be created
	 */
	void createEmployee(Employee employee);
	/**
	 * This showAllEmployees method will return the list of available employees
	 * 
	 * @return list of available employees
	 */
	List<Employee> showAllEmployees();
	/**
	 * This updateEmployee will update the employee detail based on provided employee
	 * 
	 * @param employee to be updated
	 */
	void updateEmployee(Integer id, String employeeName);
	/**
	 * This remove method will remove the employee base on provided id
	 * 
	 * @param id of the employee to be removed.
	 */
	void removeEmployee(Integer id);
	
	/**
	 * This search the employee by name and return list
	 * @param empName
	 * @return
	 */
	List<Employee> searchEmpByName(String empName);
	/**
	 * This search the employee by any field accordingly
	 * @param fieldName
	 * @param vlaue
	 * @return
	 */
	List<Employee> fressTextSearch(String fieldName, String vlaue);

}
