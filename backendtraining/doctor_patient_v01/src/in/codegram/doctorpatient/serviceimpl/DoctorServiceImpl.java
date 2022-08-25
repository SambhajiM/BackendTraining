package in.codegram.doctorpatient.serviceimpl;

import java.util.List;

import in.codegram.doctorpatient.dao.DoctorDAO;
import in.codegram.doctorpatient.daoimpl.DoctorDAOImpl;
import in.codegram.doctorpatient.exception.DoctorNotFoundException;
import in.codegram.doctorpatient.modal.Doctor;
import in.codegram.doctorpatient.service.DoctorService;

public class DoctorServiceImpl implements DoctorService {
	
	private DoctorDAO doctorDAO; //HAS-A Relationship
	
	public DoctorServiceImpl() {
		doctorDAO = new DoctorDAOImpl();
	}

	@Override
	public void createDoctor(Doctor doctor) {
		// TODO Auto-generated method stub
		doctorDAO.save(doctor);//reusability

	}

	@Override
	public List<Doctor> showAllDoctors() {
		return doctorDAO.list();
	}

	@Override
	public void updateDoctor(Integer id, String speciality) {
		doctorDAO.update(id, speciality);

	}

	@Override
	public void removeDoctor(Integer id) throws DoctorNotFoundException {
		try {
			doctorDAO.delete(id);
		} catch (DoctorNotFoundException e) {
			throw new DoctorNotFoundException(e.getMessage());
		}

	}

}
