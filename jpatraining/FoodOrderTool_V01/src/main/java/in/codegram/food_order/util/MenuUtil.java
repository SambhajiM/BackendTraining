package in.codegram.food_order.util;

import java.util.List;
import java.util.Scanner;

import in.codegram.food_order.modal.Food;
import in.codegram.food_order.modal.User;
import in.codegram.food_order.serviceimpl.FoodServiceImpl;
import in.codegram.food_order.serviceimpl.UserServiceImpl;

public class MenuUtil {

	private FoodServiceImpl foodServiceImpl;
	private UserServiceImpl userServiceImpl;
	
	public MenuUtil() {
		foodServiceImpl = new FoodServiceImpl();
		userServiceImpl = new UserServiceImpl();
	}
	
	public void start() {
		int menuChoice;
		String continueChoice;
		Scanner sc = new Scanner(System.in);
		do {
			showMenu();
			System.out.println("Enetr your choice: (1,2,3,4,5,6,7,8) : ");
			menuChoice = sc.nextInt();
			
			switch (menuChoice) {
			case 1:
				User user = new User();
				System.out.println("Enter User Name");
				user.setName(sc.next());
				sc.nextLine();
				String returnString = userServiceImpl.saveUser(user);
				System.out.println(returnString);
				break;
			case 2:
				Food food = new Food();
				System.out.println("Enter Food Name");
				food.setName(sc.next());
				sc.nextLine();
				String returnFoodString = foodServiceImpl.saveFood(food);
				System.out.println(returnFoodString);
				break;
			case 3:
				List<User> newObject = userServiceImpl.getUser();
				for(Object userDataList : newObject) {
					System.out.println(userDataList);
				}
				break;	
			case 4:
				List<Food> newFoodObject = foodServiceImpl.getFood();
				for(Object foodDataList : newFoodObject) {
					System.out.println(foodDataList);
				}
				break;
			case 5:
				System.out.println("Enter user id");
				Long userId = sc.nextLong();
				sc.nextLine();
				System.out.println("Enter user name");
				String userName = sc.nextLine();
				userServiceImpl.updateUser(userId, userName);
				break;	
			case 6:
				System.out.println("Enter food id");
				Long foodId = sc.nextLong();
				sc.nextLine();
				System.out.println("Enter food name");
				String foodName = sc.nextLine();
				foodServiceImpl.updateFood(foodId, foodName);
				break;	
			case 7:
				System.out.println("Enter User id to delete");
				Long deletUserId = sc.nextLong();
				userServiceImpl.deletUser(deletUserId);
				System.out.println("User "+ deletUserId + " deleted sucessfully");
				break;
			case 8:
				System.out.println("Enter Food id to delete");
				Long deletFoodId = sc.nextLong();
				foodServiceImpl.deletFood(deletFoodId);
				System.out.println("Food "+ deletFoodId + " deleted sucessfully");
				break;	
			
			default:
				System.out.println("Worng Choice");
				break;
			}
			System.out.println("Do you want to continue : (yes/no) : ");
			continueChoice = sc.next();
		}while(continueChoice.equals("yes"));
		
	}
	
	public void showMenu() {
		System.out.println("------------------------------FOOD ORDER TOOL----------------------------");
		System.out.println("1. Create User");
		System.out.println("2. Create Food");
		System.out.println("3. Get User");
		System.out.println("4. Get Food");
		System.out.println("5. Update User");
		System.out.println("6. Update Food");
		System.out.println("7. Delete User");
		System.out.println("8. Delete Food");
	}

}

























