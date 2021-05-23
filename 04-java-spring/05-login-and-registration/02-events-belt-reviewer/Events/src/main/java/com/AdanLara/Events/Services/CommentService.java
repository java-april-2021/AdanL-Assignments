package com.AdanLara.Events.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.AdanLara.Events.Models.Comment;
import com.AdanLara.Events.Models.Event;
import com.AdanLara.Events.Models.User;
import com.AdanLara.Events.Repositories.CommentRepository;

@Service
public class CommentService {
	@Autowired
	private CommentRepository cRepo;
	
	//get all comments
	public List getAllComments() {
		return this.cRepo.findAll();
	}
	
	//save comment
	public void saveComment(String comment,Event event, User user) {

		this.cRepo.save(new Comment(comment, event, user));
	}

}
