package in.codegram.doctorpatient.serviceimpl;

import java.util.List;

import in.codegram.doctorpatient.dao.PatientDAO;
import in.codegram.doctorpatient.daoimpl.PatientDAOImpl;
import in.codegram.doctorpatient.exception.PatientNotFoundException;
import in.codegram.doctorpatient.modal.Patient;
import in.codegram.doctorpatient.service.PatientService;

public class PatientServiceImpl implements PatientService {
	
	private PatientDAO patientDAO;
	
	public PatientServiceImpl() {
		patientDAO = new PatientDAOImpl();
	}

	@Override
	public void createPatient(Patient patient) {
		patientDAO.save(patient);

	}

	@Override
	public List<Patient> showAllPatients() {
		return patientDAO.list();
	}

	@Override
	public void updatePatient(Integer id, String problem) {
		patientDAO.update(id, problem);

	}

	@Override
	public void removePatient(Integer id) throws PatientNotFoundException {
		try {
			patientDAO.delete(id);
		} catch (Exception e) {
			throw new PatientNotFoundException(e.getMessage());
		}
	}

}
