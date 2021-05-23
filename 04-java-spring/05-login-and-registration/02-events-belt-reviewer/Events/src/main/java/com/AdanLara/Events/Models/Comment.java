package com.AdanLara.Events.Models;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name="comments")
public class Comment {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	@NotBlank
	private String content;
	
	@Column(updatable=false)
	@DateTimeFormat(pattern ="yyy-MM-DD HH:mm:ss")
	private Date createdAt;
	@DateTimeFormat(pattern ="yyy-MM-DD HH:mm:ss")
	private Date updatedAt;
	
	@PrePersist
	protected void onCreate() {
		this.createdAt= new Date();
	}
	@PreUpdate
	protected void onUpdate() {
		this.updatedAt= new Date();
	}
	
	
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="event_id")
	private Event eventComments;
	
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="user_id")
	private User commentCreator;
//const
	public Comment() {
		super();
	}
	
	public Comment(@NotBlank String content, Event eventComments, User commentCreator) {
		super();
		this.content = content;
		this.eventComments = eventComments;
		this.commentCreator = commentCreator;
	}
	//gns
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public Date getCreatedAt() {
		return createdAt;
	}
	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}
	public Date getUpdatedAt() {
		return updatedAt;
	}
	public void setUpdatedAt(Date updatedAt) {
		this.updatedAt = updatedAt;
	}
	public User getCommentCreator() {
		return commentCreator;
	}
	public void setCommentCreator(User commentCreator) {
		this.commentCreator = commentCreator;
	}
	public Event getEventComments() {
		return eventComments;
	}
	public void setEventComments(Event eventComments) {
		this.eventComments = eventComments;
	}

	
	
}
