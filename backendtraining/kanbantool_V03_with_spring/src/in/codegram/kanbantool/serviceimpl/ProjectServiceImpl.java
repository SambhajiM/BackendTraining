package in.codegram.kanbantool.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.codegram.kanbantool.daoimpl.ProjectDAOJDBCImpl;
import in.codegram.kanbantool.modal.Project;
import in.codegram.kanbantool.service.ProjectService;

@Service
public class ProjectServiceImpl implements ProjectService{
	
	@Autowired
	private ProjectDAOJDBCImpl projectDAOJDBCImpl; 
	
	@Override
	public void createProject(Project project) {
		projectDAOJDBCImpl.save(project);

	}

	@Override
	public List<Project> showAllProjects() {
		return projectDAOJDBCImpl.getProjectlist();
	}

	@Override
	public void updateProject(Integer id, String projectDescription) {
		projectDAOJDBCImpl.update(id, projectDescription);

	}

	@Override
	public void removeProject(Integer id) {
		projectDAOJDBCImpl.delete(id);	
	}

}
