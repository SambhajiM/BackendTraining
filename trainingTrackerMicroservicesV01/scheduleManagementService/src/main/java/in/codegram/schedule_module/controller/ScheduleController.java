package in.codegram.schedule_module.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import in.codegram.schedule_module.modal.Schedule;
import in.codegram.schedule_module.service.ScheduleService;
import in.codegram.schedule_module.serviceImpl.MapValidationErrorService;

@RestController
@RequestMapping("/api/schedule")
public class ScheduleController {
	
	@Autowired
	private ScheduleService scheduleService;
	
	@Autowired
	private MapValidationErrorService mapValidationErrorService;
	
	@PostMapping("/create")
	public ResponseEntity<?> createNewSchedule(@Valid @RequestBody Schedule schedule, BindingResult result){
		ResponseEntity<?> errorMap = mapValidationErrorService.mapValidationError(result);
		if(errorMap!=null) return errorMap;
		Schedule savedSchedule = scheduleService.saveOrUpdate(schedule);
    	 return new ResponseEntity<Schedule>(savedSchedule,HttpStatus.CREATED);
	}
        
    @GetMapping("/{trainingId}")
     public ResponseEntity<?> getScheduleByTrainingId(@PathVariable Long trainingId){
    	Schedule schedule = scheduleService.findScheduleByTrainingId(trainingId);
	return new ResponseEntity<Schedule >(schedule ,HttpStatus.OK);
		
	}
    
    @GetMapping("/{scheduleId}")
    public ResponseEntity<?> getScheduleByScheduleId(@PathVariable Long scheduleId){
   	Schedule schedule = scheduleService.findScheduleByTrainingId(scheduleId);
	return new ResponseEntity<Schedule >(schedule ,HttpStatus.OK);
		
	}
    
    @GetMapping("/all")
    public Iterable<Schedule > getAllSchedules(){
		return scheduleService.findAllSchedule();
	}
	    
	@DeleteMapping("/{trainingId}")
	public ResponseEntity<?> deleteScheduleByTrainingId(@PathVariable Long trainingId){
		scheduleService.deleteScheduleByTrainingId(trainingId);
		return new ResponseEntity<String>("Schedule with Trining Id: "+trainingId+" Deleted Succesfully!", HttpStatus.OK);
	}
	
	@DeleteMapping("/{scheduleId}")
	public ResponseEntity<?> deleteScheduleByScheduleId(@PathVariable Long scheduleId){
		scheduleService.deleteScheduleByTrainingId(scheduleId);
		return new ResponseEntity<String>("Schedule with Trining Id: "+scheduleId+" Deleted Succesfully!", HttpStatus.OK);
	}

}
