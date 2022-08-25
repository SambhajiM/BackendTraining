package in.codegram.kanbantool.service;

import java.util.List;

import in.codegram.kanbantool.exception.ProjectNotFoundException;
import in.codegram.kanbantool.modal.Project;

/**
 * This ProjectService interface will perform all the Business logic on Project
 * @author ranjeet.kumarrai
 *
 */
public interface ProjectService {
	
	/**
	 * This cretaeProject method will create the project in system
	 * 
	 * @param project to be created
	 */
	void createProject(Project project);
	/**
	 * This showAllProjects method will return the list of available projects
	 * 
	 * @return list of available projects
	 */
	List<Project> showAllProjects();
	/**
	 * This updateProject will update the project detail based on provided project
	 * 
	 * @param project to be updated
	 */
	void updateProject(Integer id, String projectDescription);
	/**
	 * This remove method will remove the project base on provided id
	 * 
	 * @param id of the project to be removed.
	 */
	void removeProject(Integer id);
	
}
