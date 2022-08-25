package in.codegram.user_module.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import in.codegram.user_module.modal.User;
import in.codegram.user_module.repository.UserRepository;
import in.codegram.user_module.service.UserService;
import in.codegram.user_module.serviceImpl.MapValidationErrorService;
import in.codegram.user_module.util.Status;

@RestController
@RequestMapping("/api/users")
public class UserController {
	@Autowired
	private UserService userService;
	@Autowired
	private MapValidationErrorService mapValidationErrorService;
	@Autowired
	private UserRepository userRepository;
	
	@PostMapping("/registration")
	public ResponseEntity<?> createUser(@Valid @RequestBody User user, BindingResult result) {
		ResponseEntity<?> errorMap =  mapValidationErrorService.mapValidationError(result);
		if(errorMap != null) return errorMap;
		User registeredUser =  userService.registerUser(user);
		return new ResponseEntity<User>(registeredUser, HttpStatus.CREATED);
	}
	
	@PostMapping("/login")
	public ResponseEntity<?> loginUser(@RequestBody User user) {
		Status login = userService.longinUser(user);
		return new ResponseEntity<Status>(login, HttpStatus.CREATED);
	}
	
	@PostMapping("/logot")
	public ResponseEntity<?> logOutUser(@RequestBody User user) {
		Status logOut = userService.logoutUser(user);
		return new ResponseEntity<Status>(logOut, HttpStatus.CREATED);
	}
	
	@PostMapping("/change_password")
	public ResponseEntity<?> changePassword(@RequestBody User user) {
		Status changePassword = userService.changePassword(user);
		return new ResponseEntity<Status>(changePassword, HttpStatus.CREATED);
	}
	
	@PostMapping("/update_profile")
	public ResponseEntity<?> updateUser(@RequestBody User user) {
		Status profileUpdate = userService.updateProfile(user);
		return new ResponseEntity<Status>(profileUpdate, HttpStatus.CREATED);
	}
	
}
