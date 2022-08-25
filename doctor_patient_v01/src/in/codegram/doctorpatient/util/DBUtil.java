package in.codegram.doctorpatient.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DBUtil {
	
	private static final String driverClassName = "com.mysql.cj.jdbc.Driver";
	private String url = "jdbc:mysql://localhost:3306/kanbandb";
	private String username = "root";
	private String password = "root";
	private PreparedStatement pstmt = null;
	private Connection conn = null;
	
	static {
		try {
			Class c = Class.forName(driverClassName);
			System.out.println(c);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}	
	}
	
	private Connection connect() {
		try {
			return conn = DriverManager.getConnection(url, username, password);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	public PreparedStatement preparedStatement(String sql) {
		try {
			pstmt = connect().prepareStatement(sql);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return pstmt;
	}
	
	public void closePreparedStatment() {
		try {
			pstmt.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public void closeConnection() {
		try {
			conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
