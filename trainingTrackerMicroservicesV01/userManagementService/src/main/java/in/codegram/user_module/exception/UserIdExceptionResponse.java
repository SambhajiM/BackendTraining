package in.codegram.user_module.exception;

public class UserIdExceptionResponse {
	
	private String userId;

	public UserIdExceptionResponse(String userId) {
		super();
		this.userId = userId;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

}
