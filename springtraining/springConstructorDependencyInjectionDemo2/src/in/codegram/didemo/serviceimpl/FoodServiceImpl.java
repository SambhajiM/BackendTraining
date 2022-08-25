package in.codegram.didemo.serviceimpl;

import in.codegram.didemo.dao.FoodDAO;
import in.codegram.didemo.model.Food;
import in.codegram.didemo.service.FoodService;

public class FoodServiceImpl implements FoodService {
	
	private FoodDAO foodDAO;
	
//	public void setFoodDAO(FoodDAO foodDAO) {
//		this.foodDAO = foodDAO;
//	}
	
	public FoodServiceImpl(FoodDAO foodDAO) {
		this.foodDAO = foodDAO;
	}

	@Override
	public void addFood(Food food) {
		foodDAO.save(food);

	}

}
