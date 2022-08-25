package in.codegram.training_module.modal;

import java.util.Date;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

public class Training {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	// @NotBlank(message = "User Name is reqiured")
	private Long userId;
	// @NotBlank(message = "User Name is reqiured")
	private String trainingName;
	// @NotBlank(message = "Moblie no. is reqiured")
	private Long budget;
	// @NotBlank(message = "Password is reqiured")
	// @Size(min=6, max=10, message = "Please use minimum 8 characters")
	private String rating;

	private Date createdAt;
	private Date updatedAt;

	public Training() {
		super();
	}
	
	public Training(Long id, Long userId, String trainingName) {
		super();
		this.id = id;
		this.userId = userId;
		this.trainingName = trainingName;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public String getTrainingName() {
		return trainingName;
	}

	public void setTrainingName(String trainingName) {
		this.trainingName = trainingName;
	}

	public Long getBudget() {
		return budget;
	}

	public void setBudget(Long budget) {
		this.budget = budget;
	}

	public String getRating() {
		return rating;
	}

	public void setRating(String rating) {
		this.rating = rating;
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
		return "Training [id=" + id + ", userId=" + userId + ", trainingName=" + trainingName + ", budget=" + budget
				+ ", rating=" + rating + ", createdAt=" + createdAt + ", updatedAt=" + updatedAt + "]";
	}

}
