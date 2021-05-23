package com.AdanLara.Events.Services;

import java.util.List;

import org.mindrot.jbcrypt.BCrypt;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.AdanLara.Events.Models.User;
import com.AdanLara.Events.Repositories.UserRepository;

@Service
public class UserService {
	@Autowired UserRepository uRepo;
	
	//get all users
	public List getAllUsers() {
		return this.uRepo.findAll();
	}
	//get one user
	public User getUser(Long id) {
		return this.uRepo.findById(id).orElse(null);
	}
	//register user
	public User registerUser(User user) {
		String hash = BCrypt.hashpw(user.getPassword(), BCrypt.gensalt());
		user.setPassword(hash);
		return this.uRepo.save(user);
	}
	//authenticate user
	public Boolean authenticateUser(String password, String email) {
		User user = this.uRepo.findByEmail(email);
			if (user==null) {
				return false;
		}
			return BCrypt.checkpw(password, user.getPassword());
	}
	//add user to session
	public User getByEmail(String email) {
		return this.uRepo.findByEmail(email);
	}
}
