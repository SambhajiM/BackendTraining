package in.codegram.dashboard_module.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import in.codegram.dashboard_module.exception.UserIdException;
import in.codegram.dashboard_module.modal.User;
import in.codegram.dashboard_module.repository.UserRepository;
import in.codegram.dashboard_module.service.UserService;
import in.codegram.dashboard_module.util.Status;

public class UserServiceImpl implements UserService{
	
	@Autowired
	private UserRepository userRepository;

	@Override
	public User registerUser(User user) {
		try {
			return userRepository.save(user);
		} catch (Exception e) {
			throw new UserIdException("User ID"+user.getId()+" already exist");
		}
	}

	@Override
	public Status longinUser(User u) {
		List<User> users = userRepository.findAll();
		for(User user : users) {
			if(user.getUsername().equals(u.getUsername()) && user.getPassword().equals(u.getPassword())) {
				return Status.LOGIN_SUCCESS;
			}
			else if(user.getUsername()!=(u.getUsername()) && user.getPassword().equals(u.getPassword())) {
				return Status.USERNAME_NOT_CORRECT;
			}
			else if(user.getUsername().equals(u.getUsername()) && user.getPassword()!=(u.getPassword())) {
				return Status.PASSWORD_NOT_CORRECT;
			}
		}
		return Status.USERNAME_AND_PASSWORD_NOT_CORRECT;
	}

	@Override
	public Status logoutUser(User u) {
		List<User> users = userRepository.findAll();
		for(User user : users) {
			if(user.getUsername().equals(u.getUsername()) && user.getPassword().equals(u.getPassword())) {
				return Status.LOGOUT_SUCCESS;
			}
		}
		return Status.USERNAME_AND_PASSWORD_NOT_CORRECT;
	}

	@Override
	public Status changePassword(User u) {
		List<User> users = userRepository.findAll();
		for(User user : users) {
			if(user.getUsername().equals(u.getUsername())) {
				String sql = "update user set password = '" +u.getPassword()+"' where username = '"+u.getUsername()+"'";
				
			}
		}
		return null;
	}

	@Override
	public Status updateProfile(User user) {
		// TODO Auto-generated method stub
		return null;
	}
	
	

}
