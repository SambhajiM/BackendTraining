package in.codegram.training_module.serviceImpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.codegram.training_module.exception.TrainingIdException;
import in.codegram.training_module.modal.Training;
import in.codegram.training_module.repository.TrainingRepository;
import in.codegram.training_module.service.TrainingService;

@Service
public class TrainingServiceImpl implements TrainingService{
	
	@Autowired
	public TrainingRepository trainingRepository;

	@Override
	public Training getTrainingDataById(Long id) {
		Training training = trainingRepository.findByTrainingId(id);
		if(training == null) {
			throw new TrainingIdException("Training ID"+training.getId()+" already exist");
		}
		return training;
	}

	@Override
	public List<Training> getTrainingList() {
		List<Training> training = new ArrayList<>();
		return null;
	}

	@Override
	public Training updateTraining(Training training) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String deleteTraining(long id) {
		// TODO Auto-generated method stub
		return null;
	}
	
}
