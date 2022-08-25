package in.hcl.report.model;

import java.sql.Date;

public class TrainingManagment {
	
	private String modulename;
	private Long id;
	private String type;
	private Double price;
	private Double percentage_scored;
	private Date Scheduled_date;
	private Date completed_date;
	private String trainer_name;
	private Double training_rating;
	public TrainingManagment(String modulename, Long id, String type, Double price, Double percentage_scored,
			Date scheduled_date, Date completed_date, String trainer_name, Double training_rating) {
		super();
		this.modulename = modulename;
		this.id = id;
		this.type = type;
		this.price = price;
		this.percentage_scored = percentage_scored;
		Scheduled_date = scheduled_date;
		this.completed_date = completed_date;
		this.trainer_name = trainer_name;
		this.training_rating = training_rating;
	}
	public String getModulename() {
		return modulename;
	}
	public void setModulename(String modulename) {
		this.modulename = modulename;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	public Double getPercentage_scored() {
		return percentage_scored;
	}
	public void setPercentage_scored(Double percentage_scored) {
		this.percentage_scored = percentage_scored;
	}
	public Date getScheduled_date() {
		return Scheduled_date;
	}
	public void setScheduled_date(Date scheduled_date) {
		Scheduled_date = scheduled_date;
	}
	public Date getCompleted_date() {
		return completed_date;
	}
	public void setCompleted_date(Date completed_date) {
		this.completed_date = completed_date;
	}
	public String getTrainer_name() {
		return trainer_name;
	}
	public void setTrainer_name(String trainer_name) {
		this.trainer_name = trainer_name;
	}
	public Double getTraining_rating() {
		return training_rating;
	}
	public void setTraining_rating(Double training_rating) {
		this.training_rating = training_rating;
	}
	
	

}
