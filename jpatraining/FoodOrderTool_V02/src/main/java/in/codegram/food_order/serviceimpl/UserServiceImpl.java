package in.codegram.food_order.serviceimpl;

import java.util.List;

import in.codegram.food_order.daoimpl.JPAUtilDAOImpl;
import in.codegram.food_order.modal.Food;
import in.codegram.food_order.modal.User;
import in.codegram.food_order.service.UserService;

public class UserServiceImpl implements UserService{
	
private JPAUtilDAOImpl jpaUtilImpl;
	
	public UserServiceImpl() {
		jpaUtilImpl = new JPAUtilDAOImpl();
	}
	
	@Override
	public String saveUser(User user) {
		jpaUtilImpl.save(user);
		return "user saved successfully";
	}
	
	@Override
	public String updateUser(Long id, String userName) {
		jpaUtilImpl.updateUser(id, userName);
		return "food " + id + "updated as " + userName;
	}
	
	@Override
	public List<User> getUser(){
		List<User> userList = jpaUtilImpl.getUserData();
		return userList;
	}

	@Override
	public String deletUser(Long id) {
		jpaUtilImpl.deleteUser(id);
		return "User "+ id + "deleted sucessfully";
		
	}
}
