package in.codegram.food_order.service;

import java.util.List;

import in.codegram.food_order.modal.Food;

public interface FoodService {

	public String saveFood(Food food);
	public String updateFood(Long id, String userName);
	public List<Food> getFood();
	public String deletFood(Long id);
}
