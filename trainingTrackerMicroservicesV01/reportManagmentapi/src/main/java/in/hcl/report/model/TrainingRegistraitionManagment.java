package in.hcl.report.model;

import java.sql.Date;

public class TrainingRegistraitionManagment {
	
	private Long id;
	private Long user_id;
	private Long nominated_by_id;
	private Long alloted_by_id;
	private Long duration;
	private Long training_id;
	private Date start_date;
	private Date end_date;
	private Date created_on;
	private Date updated_on;
	public TrainingRegistraitionManagment(Long id, Long user_id, Long nominated_by_id, Long alloted_by_id,
			Long duration, Long training_id, Date start_date, Date end_date, Date created_on, Date updated_on) {
		super();
		this.id = id;
		this.user_id = user_id;
		this.nominated_by_id = nominated_by_id;
		this.alloted_by_id = alloted_by_id;
		this.duration = duration;
		this.training_id = training_id;
		this.start_date = start_date;
		this.end_date = end_date;
		this.created_on = created_on;
		this.updated_on = updated_on;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Long getUser_id() {
		return user_id;
	}
	public void setUser_id(Long user_id) {
		this.user_id = user_id;
	}
	public Long getNominated_by_id() {
		return nominated_by_id;
	}
	public void setNominated_by_id(Long nominated_by_id) {
		this.nominated_by_id = nominated_by_id;
	}
	public Long getAlloted_by_id() {
		return alloted_by_id;
	}
	public void setAlloted_by_id(Long alloted_by_id) {
		this.alloted_by_id = alloted_by_id;
	}
	public Long getDuration() {
		return duration;
	}
	public void setDuration(Long duration) {
		this.duration = duration;
	}
	public Long getTraining_id() {
		return training_id;
	}
	public void setTraining_id(Long training_id) {
		this.training_id = training_id;
	}
	public Date getStart_date() {
		return start_date;
	}
	public void setStart_date(Date start_date) {
		this.start_date = start_date;
	}
	public Date getEnd_date() {
		return end_date;
	}
	public void setEnd_date(Date end_date) {
		this.end_date = end_date;
	}
	public Date getCreated_on() {
		return created_on;
	}
	public void setCreated_on(Date created_on) {
		this.created_on = created_on;
	}
	public Date getUpdated_on() {
		return updated_on;
	}
	public void setUpdated_on(Date updated_on) {
		this.updated_on = updated_on;
	}
	
	
	

}
