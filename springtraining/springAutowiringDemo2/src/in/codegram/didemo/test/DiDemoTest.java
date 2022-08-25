package in.codegram.didemo.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import in.codegram.didemo.model.Food;
import in.codegram.didemo.service.FoodService;

public class DiDemoTest {

	public static void main(String[] args) {
		
		ApplicationContext ctx = new ClassPathXmlApplicationContext("resource/beans.xml");
		FoodService foodService  =  (FoodService) ctx.getBean("foodServiceImpl");
		Food food = new Food();
		food.setId(102);
		food.setName("Matar Paneer");
		food.setPrice(150);
		
		foodService.addFood(food);

	}

}
