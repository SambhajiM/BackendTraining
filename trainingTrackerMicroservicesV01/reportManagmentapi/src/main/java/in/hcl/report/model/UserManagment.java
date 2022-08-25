package in.hcl.report.model;

import java.sql.Date;

public class UserManagment {
	
	private String name;
	private String email;
	private String address;
	private String mobileNo;
	private String password;
	private Date createdAt;
	private Date updatedAt;
	public UserManagment(String name, String email, String address, String mobileNo, String password, Date createdAt,
			Date updatedAt) {
		super();
		this.name = name;
		this.email = email;
		this.address = address;
		this.mobileNo = mobileNo;
		this.password = password;
		this.createdAt = createdAt;
		this.updatedAt = updatedAt;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
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
	
	

}
