package in.codegram.kanbantool.daoimpl;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import in.codegram.kanbantool.dao.ProjectDAO;
import in.codegram.kanbantool.modal.Project;

@Component
public class ProjectDAOJDBCImpl implements ProjectDAO{
	
	@Autowired
	private DataSource dataSource;
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	public DataSource getDataSource() {
		return dataSource;
	}
	
	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
	}
	
	private Connection conn=null;
	private Statement stmt = null;
	
	@Override
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

	@Override
	public void update(Integer id, String projectDescription) {
		try {
			conn = (Connection) dataSource.getConnection();
			stmt = (Statement) conn.createStatement();
			String sql = "update projects set description= '"+projectDescription+"' where id = '"+id+"'";
			int i = stmt.executeUpdate(sql);
		} catch (SQLException e) {
			System.out.println("Problem : "+e.getMessage());
		}	
	}
	
	@Override
	public List<Project> getProjectlist() {
		String sqlQuery = "select * from projects";
		return jdbcTemplate.query(sqlQuery, new Object[] {}, new RowMapper<Project>(){
		public Project mapRow(ResultSet rs, int row) throws SQLException {
			Project c=new Project();
			c.setId(rs.getInt(1));
			c.setProjectName(rs.getString(2));
			c.setDescription(rs.getString(3));
			return c;
			}
		});
	}
	
	@Override
	public void delete(int id) {
		try {
			conn = dataSource.getConnection();
			stmt = conn.createStatement();
			String sql = "delete from projects where id = '"+id+"'";
			int i = stmt.executeUpdate(sql);
		}catch(SQLException e){
			e.printStackTrace();
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
