package in.codegram.food_order.daoimpl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import in.codegram.food_order.dao.JPAUtilDAO;
import in.codegram.food_order.modal.Food;
import in.codegram.food_order.modal.FoodCategory;
import in.codegram.food_order.modal.User;

public class JPAUtilDAOImpl implements JPAUtilDAO{
	
	
	
		
	@Override
	public void save(Object object) {
		//1. Create Entity Manager Factory
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("JPA-PU");
		
		//2. Create Entity Manager
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		em.persist(object);
		em.getTransaction().commit();
		em.clear();
		emf.close();
	}
	
	@Override
	public void updateUser(Long id, String name) {
		//1. Create Entity Manager Factory
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("JPA-PU");
		
		//2. Create Entity Manager
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		User user = em.find(User.class, id);
		user.setName(name);
		em.getTransaction().commit();
		em.clear();
		emf.close();
		
	}
	
	@Override
	public void updateFood(Long id, String name) {
		//1. Create Entity Manager Factory
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("JPA-PU");
		
		//2. Create Entity Manager
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		Food food = em.find(Food.class, id);
		food.setName(name);
		em.getTransaction().commit();
		em.clear();
		emf.close();
		
	}
	
	@Override
	public List<User> getUserData() {
		//1. Create Entity Manager Factory
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("JPA-PU");
		
		//2. Create Entity Manager
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		Query query = em.createQuery("from User");
		List<User> dataList= query.getResultList();
		em.getTransaction().commit();
		em.clear();
		emf.close();
		return dataList;
	}
	
	@Override
	public List<Food> getFoodData() {
		//1. Create Entity Manager Factory
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("JPA-PU");
		
		//2. Create Entity Manager
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		Query query = em.createQuery("from Food");
		List<Food> dataList= query.getResultList();
		em.getTransaction().commit();
		em.clear();
		emf.close();
		return dataList;
	}

	@Override
	public void deleteUser(Long id) {
		//1. Create Entity Manager Factory
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("JPA-PU");
		
		//2. Create Entity Manager
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		User user = em.find(User.class, id);
		em.remove(user);
		em.getTransaction().commit();
		em.close();
		emf.close();	
	}
	
	@Override
	public void deleteFood(Long id) {
		//1. Create Entity Manager Factory
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("JPA-PU");
		
		//2. Create Entity Manager
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		Food food = em.find(Food.class, id);
		em.remove(food);
		em.getTransaction().commit();
		em.close();
		emf.close();	
	}

	@Override
	public void updateFoodCategory(Long id, String name) {
		//1. Create Entity Manager Factory
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("JPA-PU");
		
		//2. Create Entity Manager
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		FoodCategory foodCategory = em.find(FoodCategory.class, id);
		foodCategory.setName(name);
		em.getTransaction().commit();
		em.clear();
		emf.close();
		
	}

	@Override
	public List<FoodCategory> getFoodCategory() {
		//1. Create Entity Manager Factory
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("JPA-PU");
		
		//2. Create Entity Manager
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		Query query = em.createQuery("from FoodCategory");
		List<FoodCategory> dataList= query.getResultList();
		em.getTransaction().commit();
		em.clear();
		emf.close();
		return dataList;
	}
	
	@Override
	public FoodCategory getFoodCategoryById(Long id) {
		//1. Create Entity Manager Factory
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("JPA-PU");
		
		//2. Create Entity Manager
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		FoodCategory foodCategory = em.find(FoodCategory.class, id);
		em.getTransaction().commit();
		em.clear();
		emf.close();
		return foodCategory;
	}

	@Override
	public void deleteFoodCategory(Long id) {
		//1. Create Entity Manager Factory
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("JPA-PU");
		
		//2. Create Entity Manager
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		FoodCategory foodCategory = em.find(FoodCategory.class, id);
		em.remove(foodCategory);
		em.getTransaction().commit();
		em.close();
		emf.close();
	}
	
//	public List<Object> getData(String data) {
//		em.getTransaction().begin();
//		Query query = em.createQuery("from " + data);
//		List<Object> dataList= query.getResultList();
//		em.getTransaction().commit();
//		em.clear();
//		emf.close();
//		return dataList;
//	}
}












