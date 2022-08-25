package in.codegram.trainingtracker.daoimpl;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import in.codegram.trainingtracker.dao.EmployeeDAO;
import in.codegram.trainingtracker.modal.Employee;
import in.codegram.trainingtracker.util.DBUtil;

public class EmployeeDAOImpl extends DBUtil implements EmployeeDAO {

	@Override
	public void save(Employee employee) {
		String sql = "insert into employees (employeeName, employeeType, employeeDepartment, createdAt) values(?,?,?,?)";
		PreparedStatement pstmt = preparedStatement(sql);
		try {
			pstmt.setString(1, employee.getEmployeeName());
			pstmt.setString(2, employee.getEmployeeType());
			pstmt.setString(3, employee.getEmployeeDepartment());
			pstmt.setString(4, LocalDate.now().toString());
			pstmt.execute();
		} catch (SQLException e) {
			System.out.println("Problem : "+e.getMessage());
		}
		finally {
			closePreparedStatment();
			closeConnection();
		}
	}

	@Override
	public void update(Integer id, String employeeName) {
		String sql = "update employees set employeeName=? where id=?";
		PreparedStatement pstmt = preparedStatement(sql);	
		try {
			pstmt.setString(1, employeeName);
			pstmt.setInt(2, id);
			pstmt.execute();
		} catch (SQLException e) {
			System.out.println("Problem : "+e.getMessage());
		}	
		finally{
			closePreparedStatment();
			closeConnection();
		}


	}

	@Override
	public List<Employee> list() {
		String sql = "select * from employees";
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

	@Override
	public void delete(Integer id) {
		String sql="delete from employees where id=?";
		PreparedStatement pstmt = preparedStatement(sql);
		try {
			pstmt.setInt(1, id);
			pstmt.execute();
		} catch (SQLException ex) {
			System.out.println("Problem : "+ex.getMessage());
		}
		finally{
			closePreparedStatment();
			closeConnection();
		}
	}

	@Override
	public List<Employee> searchEmpByName(String empName) {
		String sql = "select * from employees where employeeName = "+ "'" +empName + "'";
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
