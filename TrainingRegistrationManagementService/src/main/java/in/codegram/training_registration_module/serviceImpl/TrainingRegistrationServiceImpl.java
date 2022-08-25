package in.codegram.training_registration_module.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import in.codegram.training_registration_module.exception.TrainingRegistrationIdException;
import in.codegram.training_registration_module.modal.TrainingRegistration;
import in.codegram.training_registration_module.repository.TrainingRegistrationRepository;
import in.codegram.training_registration_module.service.TrainingRegistrationService;

public class TrainingRegistrationServiceImpl implements TrainingRegistrationService{
	
	@Autowired
	private TrainingRegistrationRepository trainingRegistrationRepository;

	@Override
	public TrainingRegistration saveOrUpdate(TrainingRegistration TrainingRegistration) {
		TrainingRegistration newTrainingRegistration = trainingRegistrationRepository.findByTrainingRegistrationId(TrainingRegistration.getId());
		if(newTrainingRegistration != null) {
			throw  new TrainingRegistrationIdException("TrainingRegistration with TrainingRegistration Id: "+TrainingRegistration.getId()+" Already Exist");
		}
		return trainingRegistrationRepository.save(TrainingRegistration);
	}

	@Override
	public TrainingRegistration findByTrainingRegistrationId(Long trainingRegistrationId) {
		
		TrainingRegistration trainingRegistration = trainingRegistrationRepository.findByTrainingRegistrationId(trainingRegistrationId);
		if(trainingRegistration == null) {
			throw  new TrainingRegistrationIdException("TrainingRegistration with TrainingRegistration Id: "+trainingRegistrationId+" Does not Exist");
		}
		return trainingRegistration;
	}

	@Override
	public List<TrainingRegistration> findAllTrainingRegistration() {
		List<TrainingRegistration> trainingRegistrationList = trainingRegistrationRepository.findAll();
		return trainingRegistrationList;
	}

	@Override
	public void deleteByTrainingRegistrationId(Long trainingRegistrationId) {
		TrainingRegistration trainingRegistration = trainingRegistrationRepository.findByTrainingRegistrationId(trainingRegistrationId);
		if(trainingRegistration == null) {
			throw  new TrainingRegistrationIdException("TrainingRegistration with TrainingRegistration Id: "+trainingRegistrationId+" Does not Exist");
		}
		trainingRegistrationRepository.deleteByTrainingRegistrationId(trainingRegistrationId);
		
	}

}
