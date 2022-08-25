package in.codegram.kanbantool.test;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import in.codegram.kanbantool.util.DBUtil;

public class DBUtilTest {

	public static void main(String[] args) {
		
		DBUtil dbUtil = new DBUtil();
		String sql = "insert into projects (projectName, projectIdentifier, description) values(?,?,?)";
		PreparedStatement pstmt = dbUtil.preparedStatement(sql);
		
		try {
			pstmt.setString(1, "First Project");
			pstmt.setString(2, "FP01");
			pstmt.setString(3, "This is my first project");
			pstmt.execute();
			System.out.println("Your project got created");
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
		finally {
			dbUtil.closePreparedStatment();
			dbUtil.closeConnection();
		}
		
	}
}
