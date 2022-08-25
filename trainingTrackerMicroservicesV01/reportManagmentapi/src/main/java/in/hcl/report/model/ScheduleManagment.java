package in.hcl.report.model;

import java.sql.Date;

public class ScheduleManagment {
	
	private String name;
	private Long expectedTrainees;
	private Date scheduledDate;
	private Date updatedDate;
	private Date completedDate;
	private Double budget;
	private String satus;
	private Long trainingid;
	private Long id;
	public ScheduleManagment(String name, Long expectedTrainees, Date scheduledDate, Date updatedDate,
			Date completedDate, Double budget, String satus, Long trainingid, Long id) {
		super();
		this.name = name;
		this.expectedTrainees = expectedTrainees;
		this.scheduledDate = scheduledDate;
		this.updatedDate = updatedDate;
		this.completedDate = completedDate;
		this.budget = budget;
		this.satus = satus;
		this.trainingid = trainingid;
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Long getExpectedTrainees() {
		return expectedTrainees;
	}
	public void setExpectedTrainees(Long expectedTrainees) {
		this.expectedTrainees = expectedTrainees;
	}
	public Date getScheduledDate() {
		return scheduledDate;
	}
	public void setScheduledDate(Date scheduledDate) {
		this.scheduledDate = scheduledDate;
	}
	public Date getUpdatedDate() {
		return updatedDate;
	}
	public void setUpdatedDate(Date updatedDate) {
		this.updatedDate = updatedDate;
	}
	public Date getCompletedDate() {
		return completedDate;
	}
	public void setCompletedDate(Date completedDate) {
		this.completedDate = completedDate;
	}
	public Double getBudget() {
		return budget;
	}
	public void setBudget(Double budget) {
		this.budget = budget;
	}
	public String getSatus() {
		return satus;
	}
	public void setSatus(String satus) {
		this.satus = satus;
	}
	public Long getTrainingid() {
		return trainingid;
	}
	public void setTrainingid(Long trainingid) {
		this.trainingid = trainingid;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	
	
	
	
	

}
