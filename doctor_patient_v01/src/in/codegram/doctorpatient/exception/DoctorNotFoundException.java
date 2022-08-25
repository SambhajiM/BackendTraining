package in.codegram.doctorpatient.exception;

public class DoctorNotFoundException extends Exception{
	
	/**
	 * This will create the ProjectNotFoundException object without error message
	 */
	public DoctorNotFoundException() {
		super();
	}
	
	/**
	 * This will create the ProjectNotFoundException object without error message
	 */
	public DoctorNotFoundException(String errMsg) {
		super(errMsg);
	}
}
