package in.codegram.training_registration_module.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import in.codegram.training_registration_module.modal.TrainingRegistration;

@Repository
public interface TrainingRegistrationRepository extends JpaRepository<TrainingRegistration, Long>{
	
	TrainingRegistration findByTrainingRegistrationId(Long id); 
	List<TrainingRegistration> findAll();
	void deleteByTrainingRegistrationId(Long id); 
}
