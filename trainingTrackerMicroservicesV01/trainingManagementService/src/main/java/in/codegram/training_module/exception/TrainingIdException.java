package in.codegram.training_module.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class TrainingIdException extends RuntimeException{
	
	public TrainingIdException() {
		super();
	}
	
	public TrainingIdException(String errMsg) {
		super(errMsg);
	}

}
