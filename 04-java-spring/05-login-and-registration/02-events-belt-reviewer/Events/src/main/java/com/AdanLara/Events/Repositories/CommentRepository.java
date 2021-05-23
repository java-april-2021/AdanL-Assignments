package com.AdanLara.Events.Repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.AdanLara.Events.Models.Comment;

public interface CommentRepository extends CrudRepository <Comment,Long>{
	
	List<Comment> findAll();
}
