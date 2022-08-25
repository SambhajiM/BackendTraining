package in.codegram.kanbantool.test;

import java.util.Date;
import java.util.List;

import in.codegram.kanbantool.dao.ProjectDAO;
import in.codegram.kanbantool.daoimpl.ProjectDAOPlainImpl;
import in.codegram.kanbantool.modal.Project;

public class ProjectDAOImpl_SaveOperationTest {

	public static void main(String[] args) {
		ProjectDAO projectDAO = new ProjectDAOPlainImpl();
		Project project = new Project();
		//project.setId((long) 101);
		project.setProjectName("First Project");
		project.setDescription("This is my first project");
		project.setCreatedAt(new Date());
		project.setStartDate(new Date());
		project.setEndDate(new Date());
		projectDAO.save(project);
		System.out.println("Sucess! Project Saved");
		
		List<Project> projects = projectDAO.list();
		System.out.println(projects);

	}

}
