package in.codegram.schedule_module.modal;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.validation.constraints.NotBlank;

@Entity
public class Schedule {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long scheduleId;
	@NotBlank(message = "training id is required")
	private String trainingId;
	private Integer totalNumberOfDays;
    private Date startDtate;
    private Date endDate;
    private Date createdAt;
	private Date updatedAt;
	
	public Schedule() {
		super();
	}

	public Schedule(@NotBlank(message = "training id is required") String trainingId, Integer totalNumberOfDays) {
		super();
		this.trainingId = trainingId;
		this.totalNumberOfDays = totalNumberOfDays;
	}

	public Long getScheduleId() {
		return scheduleId;
	}

	public void setScheduleId(Long scheduleId) {
		this.scheduleId = scheduleId;
	}

	public String getTrainingId() {
		return trainingId;
	}

	public void setTrainingId(String trainingId) {
		this.trainingId = trainingId;
	}

	public Integer getTotalNumberOfDays() {
		return totalNumberOfDays;
	}

	public void setTotalNumberOfDays(Integer totalNumberOfDays) {
		this.totalNumberOfDays = totalNumberOfDays;
	}

	public Date getStartDtate() {
		return startDtate;
	}

	public void setStartDtate(Date startDtate) {
		this.startDtate = startDtate;
	}

	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
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
		return "Schedule [scheduleId=" + scheduleId + ", trainingId=" + trainingId + ", totalNumberOfDays="
				+ totalNumberOfDays + ", startDtate=" + startDtate + ", endDate=" + endDate + ", createdAt=" + createdAt
				+ ", updatedAt=" + updatedAt + "]";
	}

}
