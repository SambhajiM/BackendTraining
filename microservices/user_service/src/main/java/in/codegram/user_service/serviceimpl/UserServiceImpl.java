package in.codegram.user_service.serviceimpl;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import in.codegram.user_service.domain.User;
import in.codegram.user_service.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	//Fake list of users
	List<User> list = Arrays.asList(
			new User(1311L, "Pankaj Sharma", "9988776655"),
			new User(1312L, "Priyansh Sharma", "9988776655"),
			new User(1313L, "Manvi Sharma", "9988776655")
			);
	
	@Override
	public User getUser(Long id) {
		// TODO Auto-generated method stub
		return list.stream().filter(user->user.getId().equals(id)).findAny().orElse(null);
	}

}
