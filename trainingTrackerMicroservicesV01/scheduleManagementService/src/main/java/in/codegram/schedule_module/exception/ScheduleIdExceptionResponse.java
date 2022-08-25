package in.codegram.schedule_module.exception;

public class ScheduleIdExceptionResponse {
	
	private String scheduleId;

	public ScheduleIdExceptionResponse(String scheduleId) {
		super();
		this.scheduleId = scheduleId;
	}

	public String getScheduleId() {
		return scheduleId;
	}

	public void setScheduleId(String scheduleId) {
		this.scheduleId = scheduleId;
	}

}
