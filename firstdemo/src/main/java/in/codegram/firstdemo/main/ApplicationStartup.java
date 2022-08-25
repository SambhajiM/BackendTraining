package in.codegram.firstdemo.main;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import in.codegram.firstdemo.domain.UserDetail;

public class ApplicationStartup {
	public static void main(String[] args) {
		
		//1. Get User from some layer
		UserDetail userDetail = new UserDetail();
		userDetail.setId(1);
		userDetail.setName("Ranjeet");
		
		//2. Create Entity Manager Factory
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("JPA-PU");
		System.out.println(emf);
		
		//3. Create Entity Manager
		//4. Begin Transaction
		//5. Perform Transaction
		//6. Commit Transaction
		//7. Release Transaction
		
	}
}
