package in.codegram.training_registration_module.modal;

import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;

@Entity
public class TrainingRegistration {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private Long employeeId;
	private Long scheduleId;
	private List<Schedule> schedule;
	private List<Employee> employee;
	
	private Date createdAt;
	private Date updatedAt;
	
	public TrainingRegistration() {
		super();
	}

	public TrainingRegistration(Long employeeId, Long scheduleId) {
		super();
		this.employeeId = employeeId;
		this.scheduleId = scheduleId;
	}
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(Long employeeId) {
		this.employeeId = employeeId;
	}

	public Long getScheduleId() {
		return scheduleId;
	}

	public void setScheduleId(Long scheduleId) {
		this.scheduleId = scheduleId;
	}

	public List<Schedule> getSchedule() {
		return schedule;
	}

	public void setSchedule(List<Schedule> schedule) {
		this.schedule = schedule;
	}

	public List<Employee> getEmployee() {
		return employee;
	}

	public void setEmployee(List<Employee> employee) {
		this.employee = employee;
	}

	public Date getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}

	public Date getUpdatedAt() {
		return updatedAt;
	}

	public void setUpdatedAt(Date updatedAt) {
		this.updatedAt = updatedAt;
	}

	@PrePersist
	public void onCreate() {
		this.createdAt = new Date();
		
	}
	
	@PreUpdate
	public void onUpdate() {
		this.updatedAt = new Date();
	}

	@Override
	public String toString() {
		return "TrainingRegistration [id=" + id + ", employeeId=" + employeeId + ", scheduleId=" + scheduleId
				+ ", schedule=" + schedule + ", employee=" + employee + ", createdAt=" + createdAt + ", updatedAt="
				+ updatedAt + "]";
	}
	
}
