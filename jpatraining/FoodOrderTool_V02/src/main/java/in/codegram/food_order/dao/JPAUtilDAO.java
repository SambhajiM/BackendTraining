package in.codegram.food_order.dao;

import java.util.List;

import in.codegram.food_order.modal.Food;
import in.codegram.food_order.modal.FoodCategory;
import in.codegram.food_order.modal.User;

public interface JPAUtilDAO {

	public void save(Object object);
	public void updateUser(Long id, String name);
	public void updateFood(Long id, String name);
	public void updateFoodCategory(Long id,String name);
	public List<User> getUserData();
	public List<Food> getFoodData();
	public List<FoodCategory> getFoodCategory();
	public void deleteUser(Long id);
	public void deleteFood(Long id);
	public void deleteFoodCategory(Long id);
	public FoodCategory getFoodCategoryById(Long id);
}
