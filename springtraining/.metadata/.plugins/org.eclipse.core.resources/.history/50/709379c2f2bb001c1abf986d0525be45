package in.codegram.didemo.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.codegram.didemo.dao.FoodDAO;
import in.codegram.didemo.model.Food;
import in.codegram.didemo.service.FoodService;

@Service
public class FoodServiceImpl implements FoodService {
	
	@Autowired
	private FoodDAO foodDAO;
	
	@Override
	public void addFood(Food food) {
		foodDAO.save(food);

	}

}
