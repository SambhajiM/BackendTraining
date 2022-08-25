package in.codegram.doctorpatient.dao;

import java.util.List;

import in.codegram.doctorpatient.exception.DoctorNotFoundException;
import in.codegram.doctorpatient.modal.Doctor;

/**
 * This DoctorDAO interface will work on the CRUD for Project
 * @author ranjeet
 *
 */
public interface DoctorDAO {
	
	/**
	 * This save method will save the project in the database
	 * 
	 * @param project to be saved in DB
	 */
	void save(Doctor doctor);
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
	List<Doctor> list();
	/**
	 * This delete method will delete the project based on id provided
	 * 
	 * @param id
	 */
	void delete(Integer id) throws DoctorNotFoundException;

}
