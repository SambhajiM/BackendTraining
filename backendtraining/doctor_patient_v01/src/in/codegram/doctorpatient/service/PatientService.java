package in.codegram.doctorpatient.service;

import java.util.List;

import in.codegram.doctorpatient.exception.PatientNotFoundException;
import in.codegram.doctorpatient.modal.Patient;

/**
 * This PatientService interface will perform all the Business logic on Doctor
 * @author ranjeet
 *
 */

public interface PatientService {
	
	/**
	 * This cretaePatient method will create the Patient in system
	 * 
	 * @param Patient to be created
	 */
	void createPatient(Patient patient);
	/**
	 * This showAllPatients method will return the list of available Patients
	 * 
	 * @return list of available Patients
	 */
	List<Patient> showAllPatients();
	/**
	 * This updatePatient will update the Patient detail based on provided Patient
	 * 
	 * @param Patient to be updated
	 */
	void updatePatient(Integer id, String speciality);
	/**
	 * This remove method will remove the Patient base on provided id
	 * 
	 * @param id of the Patient to be removed.
	 */
	void removePatient(Integer id) throws PatientNotFoundException;
}
