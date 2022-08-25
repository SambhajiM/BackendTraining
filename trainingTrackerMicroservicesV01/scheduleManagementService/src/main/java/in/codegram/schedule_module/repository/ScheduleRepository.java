package in.codegram.schedule_module.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import in.codegram.schedule_module.modal.Schedule;

@Repository
public interface ScheduleRepository extends JpaRepository<Schedule, Long>{
	Schedule findByTrainingId(Long trainingId);
	Schedule findByScheduleId(Long scheduleId);
	void deleteByScheduleId(Long scheduleId);
	void deleteByTrainingId(Long trainingId);

}
