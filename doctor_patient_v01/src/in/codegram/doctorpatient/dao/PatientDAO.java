package in.codegram.doctorpatient.dao;

import java.util.List;

import in.codegram.doctorpatient.exception.PatientNotFoundException;
import in.codegram.doctorpatient.modal.Patient;

/**
 * This PatientDAO interface will work on the CRUD for Project
 * @author ranjeet
 *
 */
public interface PatientDAO {
	
	/**
	 * This save method will save the project in the database
	 * 
	 * @param project to be saved in DB
	 */
	void save(Patient Patient);
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
	List<Patient> list();
	/**
	 * This delete method will delete the project based on id provided
	 * 
	 * @param id
	 */
	void delete(Integer id) throws PatientNotFoundException;

}
