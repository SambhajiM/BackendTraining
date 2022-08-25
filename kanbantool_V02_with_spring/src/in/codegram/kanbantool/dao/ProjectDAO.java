package in.codegram.kanbantool.dao;

import java.util.List;

import in.codegram.kanbantool.exception.ProjectNotFoundException;
import in.codegram.kanbantool.modal.Project;

/**
 * This ProjectDAO interface will work on the CRUD for Project
 * @author ranjeet
 *
 */
public interface ProjectDAO {
	
	/**
	 * This save method will save the project in the database
	 * 
	 * @param project to be saved in DB
	 */
	void save(Project project);
	/**
	 * This update method will update the project detail.
	 * 
	 * @param project
	 */
	void update(Integer id, String projectDescription);
	/**
	 * This list method will return all project list
	 * 
	 * @return List of projects if found
	 */
	List<Project> list();
	/**
	 * This delete method will delete the project based on id provided
	 * 
	 * @param id
	 */
	void delete(Integer id) throws ProjectNotFoundException;
}
