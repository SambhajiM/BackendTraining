package in.codegram.jpa_crud_demo.main;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import in.codegram.jpa_crud_demo.domain.UserDetail;


public class UpdateDemo {

	public static void main(String[] args) {
		//1. Get User from some layer
		
		
		//2. Create Entity Manager Factory
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("JPA-PU");
		System.out.println(emf);
		
		//3. Create Entity Manager
		EntityManager em =  emf.createEntityManager();
		
		//4. Begin Transaction
		em.getTransaction().begin();
		
		//5. Perform Transaction
		UserDetail userDetail = em.find(UserDetail.class, 2);
		userDetail.setName("Ranjeet");
		
		//6. Commit Transaction
		em.getTransaction().commit();
		
		//7. Release Transaction
		em.close();
		emf.close();		

	}

}
