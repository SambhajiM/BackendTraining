package in.codegram.firstjpademo.main;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import in.codegram.firstjpademo.domain.Address;
import in.codegram.firstjpademo.domain.UserDetail;

public class ApplicationStartup {
	public static void main(String[] args) {
		
		//1. Get User from some layer
		UserDetail userDetail = new UserDetail();
		userDetail.setName("Ankush");
		Address homeAddress = new Address();
		homeAddress.setHouseNo("1234");
		homeAddress.setStreet("abdc");
		homeAddress.setCity("banglore");
		homeAddress.setState("karnataka");
		
		Address officeAddress = new Address();
		officeAddress.setHouseNo("1234");
		officeAddress.setStreet("abdc");
		officeAddress.setCity("banglore");
		officeAddress.setState("karnataka");
		
		userDetail.getAddresses().add(officeAddress);
		userDetail.getAddresses().add(homeAddress);
		
		//2. Create Entity Manager Factory
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("JPA-PU");
		System.out.println(emf);
		
		//3. Create Entity Manager
		EntityManager em =  emf.createEntityManager();
		
		//4. Begin Transaction
		em.getTransaction().begin();
		
		//5. Perform Transaction
		em.persist(userDetail);
		
		//6. Commit Transaction
		em.getTransaction().commit();;
		
		//7. Release Transaction
		em.close();
		emf.close();		
	}
}
