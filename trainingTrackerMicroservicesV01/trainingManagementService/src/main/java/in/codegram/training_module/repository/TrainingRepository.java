package in.codegram.training_module.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import in.codegram.training_module.modal.Training;

@Repository
public interface TrainingRepository extends JpaRepository<Training, Long>{
	
	Training findByTrainingId(Long id);

}
