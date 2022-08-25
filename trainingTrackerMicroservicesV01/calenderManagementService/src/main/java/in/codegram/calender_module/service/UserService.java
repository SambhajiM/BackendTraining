package in.codegram.calender_module.service;

import in.codegram.calender_module.modal.User;
import in.codegram.calender_module.util.Status;

public interface UserService {
	
	public User registerUser(User user);
	public Status longinUser(User user);
	public Status logoutUser(User user);
	public Status changePassword(User user);
	public Status updateProfile(User user);

}
