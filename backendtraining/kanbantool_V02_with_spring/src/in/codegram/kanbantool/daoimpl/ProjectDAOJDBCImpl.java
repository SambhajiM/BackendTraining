package in.codegram.kanbantool.daoimpl;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;



import in.codegram.kanbantool.modal.Project;

@Component
public class ProjectDAOJDBCImpl{
	
	@Autowired
	private DataSource dataSource;
	
	private JdbcTemplate jdbcTemplate = new JdbcTemplate();
	
	public DataSource getDataSource() {
		return dataSource;
	}
	
	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
	}
	
	private Connection conn=null;
	private Statement stmt = null;
	
	
	public void save(Project project) {
		try {
			conn =  dataSource.getConnection();
			stmt =conn.createStatement();
			String sql = "insert into projects (projectName, projectIdentifier, description) value('"+project.getProjectName()+"','"+project.getProjectIdentifier()+"','"+project.getDescription()+"')";
			int i = stmt.executeUpdate(sql);
		} catch (SQLException e) {
			System.out.println("Problem : "+e.getMessage());
			e.printStackTrace();
		}	
	}

	public void update(Integer id, String projectDescription) {
		try {
			conn = (Connection) dataSource.getConnection();
			stmt = (Statement) conn.createStatement();
			String sql = "update projects set description=? where id=?";
			int i = stmt.executeUpdate(sql);
		} catch (SQLException e) {
			System.out.println("Problem : "+e.getMessage());
		}	
	}
	

//	@Override
//	public List<Project> list() {
//		conn = (Connection) dataSource.getConnection();
//		stmt = (Statement) conn.createStatement();
//		String sql = "select * from projects";
//		PreparedStatement pstmt = preparedStatement(sql);
//		Project project;
//		List<Project> projects = new ArrayList<>();
//		try {
//			ResultSet rs = pstmt.executeQuery();
//			
//			while(rs.next()) {
//				project=new Project();
//				project.setId(rs.getInt("id"));
//				project.setProjectName(rs.getString("projectName"));
//				project.setDescription(rs.getString("description"));
//				project.setProjectIdentifier(rs.getString("projectIdentifier"));
//				
//				projects.add(project);
//			}
//
//		} catch (SQLException e) {
//			System.out.println("Problem : "+e.getMessage());
//		}	
//		finally{
//			closePreparedStatment();
//			closeConnection();
//		}
//		return projects;
//	}


}
