package in.codegram.user_module.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class UserEmailIdException extends RuntimeException{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public UserEmailIdException() {
		super();
	}
	
	public UserEmailIdException(String errMsg) {
		super(errMsg);
	}

}
