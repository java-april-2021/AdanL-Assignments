package com.AdanLara.relationships.Models;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
	@Table(name="persons")
	public class Person {
	    
	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long id;
	    @NotBlank
	    @Size(min=2, max=15)
	    private String firstName;
	    @NotBlank
	    @Size(min=2 , max=15)
	    private String lastName;
	    
	    @Column(updatable=false)
	    @DateTimeFormat(pattern = "yyy-MM-DD HH:mm:ss")
	    private Date createdAt;
	    
	    @DateTimeFormat(pattern = "yyy-MM-DD HH:mm:ss")
	    private Date updatedAt;
	    
	    @PrePersist
	    protected void onCreated() {
	    	this.createdAt = new Date(); 
	    }
	    @PreUpdate
	    protected void onUpdate() {
	    	this.updatedAt = new Date();
	    }
	    
	    @OneToOne(mappedBy="person", cascade=CascadeType.ALL, fetch=FetchType.LAZY)
	    private License license;
	   
	    
	    
	    public Person() {
	        
	    }
	       
		public Person(String firstName, String lastName) {
			this.firstName = firstName;
			this.lastName = lastName;

		}



		public Long getId() {
			return id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public String getFirstName() {
			return firstName;
		}

		public void setFirstName(String firstName) {
			this.firstName = firstName;
		}

		public String getLastName() {
			return lastName;
		}

		public void setLastName(String lastName) {
			this.lastName = lastName;
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

		public License getLicense() {
			return license;
		}

		public void setLicense(License license) {
			this.license = license;
		}
	    
}