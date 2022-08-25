package in.codegram.food_order.service;

import java.util.List;

import in.codegram.food_order.modal.User;

public interface UserService {

	
	public void UserServiceImpl();
	public String saveUser(User user);
	public String updateUser(Long id, String userName);
	public List<User> getUser();
	public String deletUser(Long id);
}
