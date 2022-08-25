package in.codegram.user_module.exception;

public class UserEmailIdExceptionResponse {
	
	private String userEmailId;

	public UserEmailIdExceptionResponse(String userEmailId) {
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
