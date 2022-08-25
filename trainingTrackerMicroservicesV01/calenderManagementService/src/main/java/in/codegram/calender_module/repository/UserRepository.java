package in.codegram.calender_module.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import in.codegram.calender_module.modal.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long>{

}
