package in.codegram.user_module.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.codegram.user_module.exception.UserIdException;
import in.codegram.user_module.modal.User;
import in.codegram.user_module.repository.UserRepository;
import in.codegram.user_module.service.UserService;
import in.codegram.user_module.util.Status;

@Service
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
	public Status longinUser(User user) {
		User newUser = userRepository.findByEmailId(user.getEmailId());
		if(user.getEmailId().equals(newUser.getEmailId()) && user.getPassword().equals(newUser.getPassword())) {
			return Status.LOGIN_SUCCESS;
		}
		else if(user.getEmailId()!=(newUser.getEmailId()) && user.getPassword().equals(newUser.getPassword())) {
			return Status.USERNAME_NOT_CORRECT;
		}
		else if(user.getEmailId().equals(newUser.getEmailId()) && user.getPassword()!=(newUser.getPassword())) {
			return Status.PASSWORD_NOT_CORRECT;
		}
		return Status.USERNAME_AND_PASSWORD_NOT_CORRECT;
	}

	@Override
	public Status logoutUser(User user) {
		User newUser = userRepository.findByEmailId(user.getEmailId());	
		if(user.getUsername().equals(newUser.getEmailId()) && user.getPassword().equals(newUser.getPassword())) {
			return Status.LOGOUT_SUCCESS;
		}
		return Status.USERNAME_AND_PASSWORD_NOT_CORRECT;
	}

	@Override
	public Status changePassword(User user) {
		User newUser = userRepository.findByEmailId(user.getEmailId());
		if(newUser == null) {
			throw new UserIdException("user email id : " +user.getEmailId()+ "does not exist" );
		}else {
			newUser.setPassword(user.getPassword());
			userRepository.save(newUser);
		}
		return Status.PASSWORD_UPDATED_SUCCESSFULLY;
	}

	@Override
	public Status updateProfile(User user) {
		User newUser = userRepository.findByEmailId(user.getEmailId());
		if(newUser == null) {
			throw new UserIdException("user email id : " +user.getEmailId()+ "does not exist" );
		}else {
			newUser.setPassword(user.getUsername());
			userRepository.save(newUser);
		}
		return Status.PROFILE_UPDATION_SUCCESSFULLY;
	}
	
	

}
