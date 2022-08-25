package in.codegram.employee_module.modal;

import java.util.Date;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

public class Employee {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long employeeId;
	private String name;
	private String emailId;
	private String gender;
	private String dateOfBrith;
	private String contactNo;
	private String designation;
	private Date createdAt;
	private Date updatedAt;
	
	public Employee() {
		super();
	}

	public Employee(String name, String emailId, String gender, String dateOfBrith, String contactNo,
			String designation) {
		super();
		this.name = name;
		this.emailId = emailId;
		this.gender = gender;
		this.dateOfBrith = dateOfBrith;
		this.contactNo = contactNo;
		this.designation = designation;
	}
	
	public Long getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(Long employeeId) {
		this.employeeId = employeeId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getDateOfBrith() {
		return dateOfBrith;
	}

	public void setDateOfBrith(String dateOfBrith) {
		this.dateOfBrith = dateOfBrith;
	}

	public String getContactNo() {
		return contactNo;
	}

	public void setContactNo(String contactNo) {
		this.contactNo = contactNo;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
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
		return "Employee [employeeId=" + employeeId + ", name=" + name + ", emailId=" + emailId + ", gender=" + gender
				+ ", dateOfBrith=" + dateOfBrith + ", contactNo=" + contactNo + ", designation=" + designation
				+ ", createdAt=" + createdAt + ", updatedAt=" + updatedAt + "]";
	}	
}
