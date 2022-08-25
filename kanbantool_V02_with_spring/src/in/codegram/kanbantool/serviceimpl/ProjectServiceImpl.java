package in.codegram.kanbantool.serviceimpl;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.codegram.kanbantool.dao.ProjectDAO;
import in.codegram.kanbantool.daoimpl.ProjectDAOJDBCImpl;
import in.codegram.kanbantool.exception.ProjectNotFoundException;
import in.codegram.kanbantool.modal.Project;
import in.codegram.kanbantool.service.ProjectService;

@Service
public class ProjectServiceImpl {
	
	@Autowired
	private ProjectDAOJDBCImpl projectDAOJDBCImpl; 
	
//	public ProjectServiceImpl() {
//		//projectDAO = new ProjectDAOPlainImpl();
//		projectDAO = new ProjectDAOJDBCImpl();
//	}

	public void createProject(Project project) {
		projectDAOJDBCImpl.save(project); //reusability

	}

//	@Override
//	public List<Project> showAllProjects() {
//		return projectDAOJDBCImpl.list();
//	}

	
	public void updateProject(Integer id, String projectDescription) {
		projectDAOJDBCImpl.update(id, projectDescription);

	}

//	@Override
//	public void removeProject(Integer id) throws ProjectNotFoundException {
//		try {
//			projectDAO.delete(id);
//		} catch (ProjectNotFoundException e) {
//			throw new ProjectNotFoundException(e.getMessage());
//		}
//	}

}
