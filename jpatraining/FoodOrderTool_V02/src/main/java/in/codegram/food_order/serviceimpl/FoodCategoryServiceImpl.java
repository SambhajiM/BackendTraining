package in.codegram.food_order.serviceimpl;

import java.util.List;

import in.codegram.food_order.daoimpl.JPAUtilDAOImpl;
import in.codegram.food_order.modal.FoodCategory;
import in.codegram.food_order.service.FoodCategoryService;

public class FoodCategoryServiceImpl implements FoodCategoryService {
	
	private JPAUtilDAOImpl jpaUtilDAOImpl;
	
	public FoodCategoryServiceImpl() {
		jpaUtilDAOImpl = new JPAUtilDAOImpl();
	}

	@Override
	public String saveFoodCategory(FoodCategory foodCategory) {
		jpaUtilDAOImpl.save(foodCategory);
		return "Food Category saved successfully";
	}

	@Override
	public String updateFoodCategory(Long id, String userName) {
		jpaUtilDAOImpl.updateFoodCategory(id, userName);
		return "Food Category update successfully";
	}
	
	@Override
	public FoodCategory getFoodCategoryById(Long id) {
		return jpaUtilDAOImpl.getFoodCategoryById(id);
	}

	@Override
	public List<FoodCategory> getFoodCategory() {
		return jpaUtilDAOImpl.getFoodCategory();
	}

	@Override
	public void deletFoodCategory(Long id) {
		jpaUtilDAOImpl.deleteFoodCategory(id);
	}

}
