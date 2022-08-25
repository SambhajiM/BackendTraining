package in.codegram.dashboard_module.modal;

import java.util.Date;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

public class User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	//@NotBlank(message = "User Name is reqiured")
	private String username;
	//@NotBlank(message = "Address is reqiured")
	private String address;
	//@NotBlank(message = "Moblie no. is reqiured")
	private String mobileNo;
	//@NotBlank(message = "Password is reqiured")
	//@Size(min=6, max=10, message = "Please use minimum 8 characters")
	private String password;
	
	private Date createdAt;
	private Date updatedAt;
	
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public User(String username, String address) {
		this.username = username;
		this.address = address;
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
		return "User [id=" + id + ", username=" + username + ", address=" + address + ", mobileNo=" + mobileNo
				+ ", password=" + password + ", createdAt=" + createdAt + ", updatedAt=" + updatedAt + "]";
	}

}
