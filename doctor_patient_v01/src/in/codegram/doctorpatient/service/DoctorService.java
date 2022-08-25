package in.codegram.doctorpatient.service;

import java.util.List;

import in.codegram.doctorpatient.exception.DoctorNotFoundException;
import in.codegram.doctorpatient.modal.Doctor;

/**
 * This DoctorService interface will perform all the Business logic on Doctor
 * @author ranjeet
 *
 */
public interface DoctorService {
	
	/**
	 * This cretaeDoctor method will create the Doctor in system
	 * 
	 * @param Doctor to be created
	 */
	void createDoctor(Doctor doctor);
	/**
	 * This showAllDoctors method will return the list of available Doctors
	 * 
	 * @return list of available Doctors
	 */
	List<Doctor> showAllDoctors();
	/**
	 * This updateDoctor will update the Doctor detail based on provided Doctor
	 * 
	 * @param Doctor to be updated
	 */
	void updateDoctor(Integer id, String speciality);
	/**
	 * This remove method will remove the Doctor base on provided id
	 * 
	 * @param id of the Doctor to be removed.
	 */
	void removeDoctor(Integer id) throws DoctorNotFoundException;
}
