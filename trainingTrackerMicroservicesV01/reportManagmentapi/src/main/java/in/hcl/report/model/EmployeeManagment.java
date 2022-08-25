package in.hcl.report.model;

import java.sql.Date;

public class EmployeeManagment {

	private Long id;
    private String name;
    private String employeeIdentifier;
    private String type;
    private String designation;
	private Double salary;
    private String email;
    private String mobileNo;
    private Date joined_date;
    private Date relived_date;
    private Date created_at;
    private Date updated_at;
	public EmployeeManagment(Long id, String name, String employeeIdentifier, String type, String designation,
			Double salary, String email, String mobileNo, Date joined_date, Date relived_date, Date created_at,
			Date updated_at) {
		super();
		this.id = id;
		this.name = name;
		this.employeeIdentifier = employeeIdentifier;
		this.type = type;
		this.designation = designation;
		this.salary = salary;
		this.email = email;
		this.mobileNo = mobileNo;
		this.joined_date = joined_date;
		this.relived_date = relived_date;
		this.created_at = created_at;
		this.updated_at = updated_at;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmployeeIdentifier() {
		return employeeIdentifier;
	}
	public void setEmployeeIdentifier(String employeeIdentifier) {
		this.employeeIdentifier = employeeIdentifier;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public Double getSalary() {
		return salary;
	}
	public void setSalary(Double salary) {
		this.salary = salary;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getMobileNo() {
		return mobileNo;
	}
	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}
	public Date getJoined_date() {
		return joined_date;
	}
	public void setJoined_date(Date joined_date) {
		this.joined_date = joined_date;
	}
	public Date getRelived_date() {
		return relived_date;
	}
	public void setRelived_date(Date relived_date) {
		this.relived_date = relived_date;
	}
	public Date getCreated_at() {
		return created_at;
	}
	public void setCreated_at(Date created_at) {
		this.created_at = created_at;
	}
	public Date getUpdated_at() {
		return updated_at;
	}
	public void setUpdated_at(Date updated_at) {
		this.updated_at = updated_at;
	}
    
    
    

}
