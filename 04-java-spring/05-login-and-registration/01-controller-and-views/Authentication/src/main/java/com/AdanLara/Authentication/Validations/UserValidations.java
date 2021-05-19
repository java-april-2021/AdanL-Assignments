package com.AdanLara.Authentication.Validations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;

import com.AdanLara.Authentication.Models.User;
import com.AdanLara.Authentication.Repository.UserRepository;

@Component
public class UserValidations {
	@Autowired UserRepository uRepo;
	
	public boolean supports(Class <?> clazz) {
		return User.class.equals(clazz);
	}
	
	public void validate(Object target, Errors errors) {
		User user =(User) target;
		if(!user.getPassword().equals(user.getPasswordConfirmation())) {
			errors.rejectValue("password", "match", "Passwords need to match");
		}
		if (this.uRepo.existsByEmail(user.getEmail()));{
			errors.rejectValue("email", "unique", "This Email is taken");
		}
	}
}
