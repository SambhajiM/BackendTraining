package in.codegram.food_order.serviceimpl;

import java.util.List;

import in.codegram.food_order.daoimpl.JPAUtilDAOImpl;
import in.codegram.food_order.modal.Food;

public class FoodServiceImpl {
	
	private JPAUtilDAOImpl jpaUtilImpl;
	
	public FoodServiceImpl() {
		jpaUtilImpl = new JPAUtilDAOImpl();
	}
	
	public String saveFood(Food food) {
		jpaUtilImpl.save(food);
		return "user saved successfully";
	}
	
	public String updateFood(Long id, String foodName) {
		jpaUtilImpl.updateFood(id, foodName);
		return "food " + id + "updated as " + foodName;
	}
	
	public List<Food> getFood(){
		List<Food> foodList = jpaUtilImpl.getFoodData();
		return foodList;
	}
	
	public String deletFood(Long id) {
		jpaUtilImpl.deleteFood(id);
		return "Food "+ id + "deleted sucessfully";
		
	}
}

	
	
	
	
	
	
	
	