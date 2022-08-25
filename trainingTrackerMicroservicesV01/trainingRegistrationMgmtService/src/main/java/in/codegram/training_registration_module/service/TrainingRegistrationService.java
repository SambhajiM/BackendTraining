package in.codegram.training_registration_module.service;

import java.util.List;

import in.codegram.training_registration_module.modal.TrainingRegistration;

public interface TrainingRegistrationService {
	
	public TrainingRegistration saveOrUpdate(TrainingRegistration trainingRegistration);
	
	public  TrainingRegistration findByTrainingRegistrationId(Long trainingRegistrationId);
	
	public List<TrainingRegistration> findAllTrainingRegistration();
	
	public void deleteByTrainingRegistrationId(Long TrainingRegistration);
	

}
