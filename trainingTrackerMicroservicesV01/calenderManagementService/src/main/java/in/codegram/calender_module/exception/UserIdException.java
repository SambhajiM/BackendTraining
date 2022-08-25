package in.codegram.calender_module.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class UserIdException extends RuntimeException{
	
	public UserIdException() {
		super();
	}
	
	public UserIdException(String errMsg) {
		super(errMsg);
	}

}
