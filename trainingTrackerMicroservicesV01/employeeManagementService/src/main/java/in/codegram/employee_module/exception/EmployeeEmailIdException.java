package in.codegram.employee_module.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class EmployeeEmailIdException extends RuntimeException{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public EmployeeEmailIdException() {
		super();
	}
	
	public EmployeeEmailIdException(String errMsg) {
		super(errMsg);
	}

}
