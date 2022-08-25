package in.codegram.training_registration_module.modal;

import java.util.Date;

public class Schedule {
	
	private Long id;
	private String trainingId;
	private Integer totalNumberOfDays;
    private Date StartDtate;
    private Date EndDate;
    private Date createdAt;
	private Date updatedAt;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
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
		return StartDtate;
	}
	public void setStartDtate(Date startDtate) {
		StartDtate = startDtate;
	}
	public Date getEndDate() {
		return EndDate;
	}
	public void setEndDate(Date endDate) {
		EndDate = endDate;
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
	
}
