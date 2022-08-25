package in.codegram.training_registration_module.exception;

public class TrainingRegistrationIdExceptionResponse {
	
	private String trainingRegistrationId;

	public TrainingRegistrationIdExceptionResponse(String trainingRegistrationId) {
		super();
		this.trainingRegistrationId = trainingRegistrationId;
	}

	public String getTrainingRegistrationId() {
		return trainingRegistrationId;
	}

	public void setTrainingRegistrationId(String trainingRegistrationId) {
		this.trainingRegistrationId = trainingRegistrationId;
	}

}
