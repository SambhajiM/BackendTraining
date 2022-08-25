package in.codegram.kanbantool.exception;

public class ProjectNotFoundException extends Exception {
	
	/**
	 * This will create the ProjectNotFoundException object without error message
	 */
	public ProjectNotFoundException() {
		super();
	}
	
	/**
	 * This will create the ProjectNotFoundException object without error message
	 */
	public ProjectNotFoundException(String errMsg) {
		super(errMsg);
	}

}
