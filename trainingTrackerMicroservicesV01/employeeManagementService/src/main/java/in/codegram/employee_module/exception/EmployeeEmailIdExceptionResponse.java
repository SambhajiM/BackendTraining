package in.codegram.employee_module.exception;

public class EmployeeEmailIdExceptionResponse {
	
	private String userEmailId;

	public EmployeeEmailIdExceptionResponse(String userEmailId) {
		super();
		this.userEmailId = userEmailId;
	}

	public String getUserEmailId() {
		return userEmailId;
	}

	public void setUserEmailId(String userEmailId) {
		this.userEmailId = userEmailId;
	}

}
