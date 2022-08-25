package in.codegram.schedule_module.service;

import java.util.List;

import in.codegram.schedule_module.modal.Schedule;

public interface ScheduleService {
	
	public Schedule  saveOrUpdate( Schedule   schedule );	
	
	public Schedule  findScheduleByTrainingId(Long trainingId);
	
	public Schedule findScheduleByScheduleId(Long scheduleId);
	
	public List<Schedule> findAllSchedule();
	
	public void deleteScheduleByTrainingId(Long trainingId);
	
	public void deleteScheduleBySchdeduleId(Long scheduleId);


}
