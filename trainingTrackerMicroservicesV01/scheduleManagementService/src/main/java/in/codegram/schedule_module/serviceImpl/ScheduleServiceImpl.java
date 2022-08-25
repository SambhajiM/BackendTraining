package in.codegram.schedule_module.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.codegram.schedule_module.exception.ScheduleIdException;
import in.codegram.schedule_module.modal.Schedule;
import in.codegram.schedule_module.repository.ScheduleRepository;
import in.codegram.schedule_module.service.ScheduleService;

@Service
public class ScheduleServiceImpl implements ScheduleService{
	
	@Autowired
	private ScheduleRepository scheduleRepository;

	@Override
	public Schedule saveOrUpdate(Schedule schedule) {
		try {
		//Business logic
		schedule .setTrainingId(schedule.getTrainingId());
		return scheduleRepository.save(schedule);
		}catch(Exception ex) {
			throw new ScheduleIdException("Training Id: "+schedule.getTrainingId()+" already Scheduled");
		}
	}

	@Override
	public Schedule findScheduleByTrainingId(Long trainingId) {
		Schedule schedule = scheduleRepository.findByTrainingId(trainingId);
		if(schedule == null) {
			throw  new ScheduleIdException("Schedule with Training Id: "+trainingId+" Does not Exist");
		}
		return schedule;
	}
	
	@Override
	public Schedule findScheduleByScheduleId(Long scheduleId) {
		Schedule schedule = scheduleRepository.findByTrainingId(scheduleId);
		if(schedule == null) {
			throw  new ScheduleIdException("Schedule with Training Id: "+scheduleId+" Does not Exist");
		}
		return schedule;
	}

	@Override
	public List<Schedule> findAllSchedule() {
		return scheduleRepository.findAll();
	}

	@Override
	public void deleteScheduleByTrainingId(Long trainingId) {
		Schedule schedule = scheduleRepository.findByTrainingId(trainingId);
		if(schedule == null) {
			throw  new ScheduleIdException("TrainingId: "+trainingId+" Does not Exist");
		}
		scheduleRepository.deleteByTrainingId(trainingId);	
	}
	
	@Override
	public void deleteScheduleBySchdeduleId(Long scheduleId) {
		Schedule schedule = scheduleRepository.findByTrainingId(scheduleId);
		if(schedule == null) {
			throw  new ScheduleIdException("TrainingId: "+scheduleId+" Does not Exist");
		}
		scheduleRepository.deleteByScheduleId(scheduleId);	
	}
}
