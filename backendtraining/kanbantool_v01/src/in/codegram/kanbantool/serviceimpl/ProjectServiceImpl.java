package in.codegram.kanbantool.serviceimpl;

import java.util.Date;
import java.util.List;

import in.codegram.kanbantool.dao.ProjectDAO;
import in.codegram.kanbantool.daoimpl.ProjectDAOIDBCImpl;
import in.codegram.kanbantool.daoimpl.ProjectDAOPlainImpl;
import in.codegram.kanbantool.exception.ProjectNotFoundException;
import in.codegram.kanbantool.modal.Project;
import in.codegram.kanbantool.service.ProjectService;

public class ProjectServiceImpl implements ProjectService {
	
	private ProjectDAO projectDAO; // HAS-A Relationship 
	
	public ProjectServiceImpl() {
		//projectDAO = new ProjectDAOPlainImpl();
		projectDAO = new ProjectDAOIDBCImpl();
	}

	@Override
	public void createProject(Project project) {
//		project.setId(System.currentTimeMillis());
//		project.setCreatedAt(new Date());
		projectDAO.save(project); //reusability

	}

	@Override
	public List<Project> showAllProjects() {
		return projectDAO.list();
	}

	@Override
	public void updateProject(Integer id, String projectDescription) {
		projectDAO.update(id, projectDescription);

	}

	@Override
	public void removeProject(Integer id) throws ProjectNotFoundException {
		try {
			projectDAO.delete(id);
		} catch (ProjectNotFoundException e) {
			throw new ProjectNotFoundException(e.getMessage());
		}
	}

}
