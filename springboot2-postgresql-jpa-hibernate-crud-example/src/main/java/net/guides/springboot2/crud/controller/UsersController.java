package net.guides.springboot2.crud.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.validation.Valid;

import org.hibernate.annotations.SourceType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import net.guides.springboot2.crud.exception.ResourceNotFoundException;
import net.guides.springboot2.crud.model.User;
import net.guides.springboot2.crud.repository.UserRepository;

@RestController
@RequestMapping("/api/v1")
public class UsersController {
	
	@Autowired
	private UserRepository UserRepository;

	@GetMapping("/users")
	public List<User> getAllUsers() {
		
		return UserRepository.findAll();
	}

	@GetMapping("/login")
	public Object getLogin(@PathVariable(value = "email") String email,@PathVariable(value = "password") String password) {
		//System.out.println(UserRepository.transactions("f@1.com","f"));
		return UserRepository.transactions(email,password);
	}

	@GetMapping("/users/{id}")
	public ResponseEntity<User> getUserById(@PathVariable(value = "id") Long UserId)
			throws ResourceNotFoundException {
		User User = UserRepository.findById(UserId)
				.orElseThrow(() -> new ResourceNotFoundException("User not found for this id :: " + UserId));
		return ResponseEntity.ok().body(User);
	}

	@PostMapping("/users")
	public User createUser(@Valid @RequestBody User User) {
		return UserRepository.save(User);
	}

	@PutMapping("/users/{id}")
	public ResponseEntity<User> updateUser(@PathVariable(value = "id") Long UserId,
			@Valid @RequestBody User UserDetails) throws ResourceNotFoundException {
		User User = UserRepository.findById(UserId)
				.orElseThrow(() -> new ResourceNotFoundException("User not found for this id :: " + UserId));

		User.setEmailId(UserDetails.getEmailId());
		User.setLastName(UserDetails.getLastName());
		User.setFirstName(UserDetails.getFirstName());
		final User updatedUser = UserRepository.save(User);
		return ResponseEntity.ok(updatedUser);
	}

	@DeleteMapping("/users/{id}")
	public Map<String, Boolean> deleteUser(@PathVariable(value = "id") Long UserId)
			throws ResourceNotFoundException {
		User User = UserRepository.findById(UserId)
				.orElseThrow(() -> new ResourceNotFoundException("User not found for this id :: " + UserId));

		UserRepository.delete(User);
		Map<String, Boolean> response = new HashMap<>();
		response.put("deleted", Boolean.TRUE);
		return response;
	}
}
