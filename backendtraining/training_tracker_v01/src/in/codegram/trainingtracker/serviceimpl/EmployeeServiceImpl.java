package in.codegram.trainingtracker.serviceimpl;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import in.codegram.trainingtracker.dao.EmployeeDAO;
import in.codegram.trainingtracker.daoimpl.EmployeeDAOImpl;
import in.codegram.trainingtracker.modal.Employee;
import in.codegram.trainingtracker.service.EmployeeService;
import in.codegram.trainingtracker.util.DBUtil;

public class EmployeeServiceImpl extends DBUtil implements EmployeeService {
	
	private EmployeeDAO employeeDAO;
	
	public EmployeeServiceImpl() {
		employeeDAO = new EmployeeDAOImpl();
	}

	@Override
	public void createEmployee(Employee employee) {
		employeeDAO.save(employee);
	}

	@Override
	public List<Employee> showAllEmployees() {
		return employeeDAO.list();
		
	}

	@Override
	public void updateEmployee(Integer id, String employeeName) {
		employeeDAO.update(id, employeeName);

	}

	@Override
	public void removeEmployee(Integer id) {
		employeeDAO.delete(id);

	}

	@Override
	public List<Employee> searchEmpByName(String empName) {
		return employeeDAO.searchEmpByName(empName);
	}

	@Override
	public List<Employee> fressTextSearch(String fieldName, String vlaue) {
		String sql = "select * from employees where " + fieldName + " like " + "'%"+ vlaue +"%'";
		PreparedStatement pstmt = preparedStatement(sql);
		Employee employee;
		List<Employee> employees = new ArrayList<>();
		try {
			ResultSet rs = pstmt.executeQuery();
			
			while(rs.next()) {
				employee=new Employee();
				employee.setId(rs.getInt("id"));
				employee.setEmployeeName(rs.getString("employeeName"));
				employee.setEmployeeType(rs.getString("employeeType"));
				employee.setEmployeeDepartment(rs.getString("employeeDepartment"));
				employees.add(employee);
			}

		} catch (SQLException e) {
			System.out.println("Problem : "+e.getMessage());
		}	
		finally{
			closePreparedStatment();
			closeConnection();
		}
		return employees;
	}

}
