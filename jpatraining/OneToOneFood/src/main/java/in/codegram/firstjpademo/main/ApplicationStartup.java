package in.codegram.firstjpademo.main;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import in.codegram.firstjpademo.domain.Food;
import in.codegram.firstjpademo.domain.User;

public class ApplicationStartup {
	public static void main(String[] args) {
		
		User user = new User();
		user.setName("Ranjeet");
		
		Food food = new Food();
		food.setName("kadhi paneer");
		
		//2. Create Entity Manager Factory
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("JPA-PU");
		System.out.println(emf);
		
		//3. Create Entity Manager
		EntityManager em =  emf.createEntityManager();
		
		//4. Begin Transaction
		em.getTransaction().begin();
		
		//5. Perform Transaction
		em.persist(user);
		em.persist(food);
		
		//6. Commit Transaction
		em.getTransaction().commit();;
		
		//7. Release Transaction
		em.close();
		emf.close();		
	}
}
