package in.codegram.user_module.modal;

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
public class User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	//@NotBlank(message = "User Name is required")
	private String username;
	@NotBlank(message = "Email is required")
	@Column(updatable =  false, unique= true)
	private String emailId;
	//@NotBlank(message = "Address is required")
	private String address;
	//@NotBlank(message = "Mobile no. is required")
	private String mobileNo;
	//@NotBlank(message = "Password is required")
	//@Size(min=6, max=10, message = "Please use minimum 8 characters")
	private String password;
	
	private String role;
	
	private Date createdAt;
	private Date updatedAt;
	
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public User(String username, String emailId, String address,String role) {
		this.username = username;
		this.address = address;
		this.emailId = emailId;
		this.role = role;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}
	
	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
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
		return "User [id=" + id + ", username=" + username + ", emailId=" + emailId + ", address=" + address
				+ ", mobileNo=" + mobileNo + ", password=" + password + ", role=" + role + ", createdAt=" + createdAt
				+ ", updatedAt=" + updatedAt + "]";
	}

}
