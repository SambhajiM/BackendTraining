package in.codegram.user_module.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import in.codegram.user_module.modal.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long>{
	
	User findByEmailId(String email);
	List<User> findAll(); 

}
