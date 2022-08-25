package in.codegram.dashboard_module.service;

import in.codegram.dashboard_module.modal.User;
import in.codegram.dashboard_module.util.Status;

public interface UserService {
	
	public User registerUser(User user);
	public Status longinUser(User user);
	public Status logoutUser(User user);
	public Status changePassword(User user);
	public Status updateProfile(User user);

}
