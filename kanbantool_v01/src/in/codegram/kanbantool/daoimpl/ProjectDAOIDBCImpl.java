package in.codegram.kanbantool.daoimpl;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.mysql.cj.protocol.Resultset;

import in.codegram.kanbantool.dao.ProjectDAO;
import in.codegram.kanbantool.exception.ProjectNotFoundException;
import in.codegram.kanbantool.modal.Project;
import in.codegram.kanbantool.util.DBUtil;

public class ProjectDAOIDBCImpl extends DBUtil implements ProjectDAO {

	@Override
	public void save(Project project) {
		String sql = "insert into projects (projectName, projectIdentifier, description) values(?,?,?)";
		PreparedStatement pstmt = preparedStatement(sql);	
		try {
			pstmt.setString(1, project.getProjectName());
			pstmt.setString(2, project.getProjectIdentifier());
			pstmt.setString(3, project.getDescription());
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
	public void update(Integer id, String projectDescription) {
		String sql = "update projects set description=? where id=?";
		PreparedStatement pstmt = preparedStatement(sql);	
		try {
			pstmt.setString(1, projectDescription);
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
	public List<Project> list() {
		String sql = "select * from projects";
		PreparedStatement pstmt = preparedStatement(sql);
		Project project;
		List<Project> projects = new ArrayList<>();
		try {
			ResultSet rs = pstmt.executeQuery();
			
			while(rs.next()) {
				project=new Project();
				project.setId(rs.getInt("id"));
				project.setProjectName(rs.getString("projectName"));
				project.setDescription(rs.getString("description"));
				project.setProjectIdentifier(rs.getString("projectIdentifier"));
				
				projects.add(project);
			}

		} catch (SQLException e) {
			System.out.println("Problem : "+e.getMessage());
		}	
		finally{
			closePreparedStatment();
			closeConnection();
		}
		return projects;
	}

	@Override
	public void delete(Integer id) throws ProjectNotFoundException {
		String sql="delete from projects where id=?";
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

}
