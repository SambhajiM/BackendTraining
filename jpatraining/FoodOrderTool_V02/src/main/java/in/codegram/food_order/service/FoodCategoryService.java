package in.codegram.food_order.service;

import java.util.List;

import in.codegram.food_order.modal.FoodCategory;

public interface FoodCategoryService {
	
	
	public String saveFoodCategory(FoodCategory foodCategory);
	public String updateFoodCategory(Long id, String userName);
	public List<FoodCategory> getFoodCategory();
	public void deletFoodCategory(Long id);
	public FoodCategory getFoodCategoryById(Long id);

}
