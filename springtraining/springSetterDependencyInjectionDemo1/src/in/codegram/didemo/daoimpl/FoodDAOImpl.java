package in.codegram.didemo.daoimpl;

import in.codegram.didemo.dao.FoodDAO;
import in.codegram.didemo.model.Food;

public class FoodDAOImpl implements FoodDAO {

	@Override
	public void save(Food food) {
		System.out.println("---------------Food saved in DB: find below detail");
		System.out.println(food);
	}

}
