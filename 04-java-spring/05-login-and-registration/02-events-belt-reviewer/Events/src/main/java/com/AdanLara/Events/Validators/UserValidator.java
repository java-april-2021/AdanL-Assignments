package com.AdanLara.Events.Validators;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;

import com.AdanLara.Events.Models.User;
import com.AdanLara.Events.Repositories.UserRepository;

@Component
public class UserValidator {
	@Autowired
	private UserRepository uRepo;
	
	private boolean supports(Class<?>clazz) {
		return User.class.equals(clazz);
	}
	
	public void validate(Object target, Errors errors) {
		User user= (User) target;
		if(!user.getPassword().equals(user.getConfirmPassword())) {
			errors.rejectValue("password", "match","Passwords need to match");
		}
		if(this.uRepo.existsByEmail(user.getEmail())) {
			errors.rejectValue("email", "taken","Email is already registered");
		}
	}
}
