package in.codegram.user_service.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import in.codegram.user_service.domain.Contact;
import in.codegram.user_service.domain.User;
import in.codegram.user_service.service.UserService;

@RestController
@RequestMapping("/users")
public class UserController {

	@Autowired
	private UserService userService;
	
	@Autowired
	private RestTemplate restTemplate;
	
	@GetMapping("/{userId}")
	public User getUser(@PathVariable ("userId") Long userId) {
		
		//1: get the User
		User user =  userService.getUser(userId);
		//2: communication with contact service to get list of contacts.
		List<Contact> contacts= restTemplate.getForObject("http://contact-service/contacts/users/" + user.getId(), List.class);
		//3: set the contactList in user
		user.setContacts(contacts);
		//4: return user
		//TODO: http://localhost:9002/contacts/users/1311
		return userService.getUser(userId);
	}
}
