package in.codegram.training_module.service;

import java.util.List;

import in.codegram.training_module.modal.Training;
import in.codegram.training_module.util.Status;

public interface TrainingService {
	
	public Training getTrainingDataById(Long id);
	public List<Training> getTrainingList();
	public Training updateTraining(Training training);
	public String deleteTraining(long id);

}
