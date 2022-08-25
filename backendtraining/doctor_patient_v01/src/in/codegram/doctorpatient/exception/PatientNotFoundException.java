package in.codegram.doctorpatient.exception;

public class PatientNotFoundException extends Exception{
	
	/**
	 * This will create the ProjectNotFoundException object without error message
	 */
	public PatientNotFoundException() {
		super();
	}
	
	/**
	 * This will create the ProjectNotFoundException object without error message
	 */
	public PatientNotFoundException(String errMsg) {
		super(errMsg);
	}
}
