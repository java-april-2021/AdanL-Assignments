package com.AdanLara.relationships.Models;



import java.text.SimpleDateFormat;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name="licenses")
public class License {
	
	    //Attributes
		@Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long id;
	    
	
		private int number;
		
	    @DateTimeFormat(pattern = "yyyy-MM-dd")
	    private Date expiration_date;
	    @NotBlank
	    private String state;
	    
	    @Column(updatable=false)
	    private Date createdAt;
	    
	    private Date updatedAt;
	    
	    @PrePersist
	    protected void onCreated() {
	    	this.createdAt = new Date(); 
	    }
	    @PreUpdate
	    protected void onUpdate() {
	    	this.updatedAt = new Date();
	    }
	    
	    @OneToOne(fetch=FetchType.LAZY)
	    @JoinColumn(name="person_id")
	    private Person person;
	    
	    //Constructor
	    public License() {
	        
	    }
	    
	    public String getNumberAsString() {
			int numZeros = 7 - String.valueOf(this.number).length();
			StringBuilder sb = new StringBuilder();
			for(int i = 0; i < numZeros; i++)
				sb.append('0');
			return String.format("%s%d", sb, this.number);
		}
	    
		public String getExpirationDateFormatted() {
			SimpleDateFormat fm = new SimpleDateFormat("MM/dd/yyyy");
			return fm.format(this.expiration_date);
		}
		public Long getId() {
			return id;
		}

		public void setId(Long id) {
			this.id = id;
		}
		
		public int getNumber() {
			return number;
		}
		public void setNumber(int number) {
			this.number = number;
		}
		public Date getExpiration_date() {
			return expiration_date;
		}

		public void setExpiration_date(Date expiration_date) {
			this.expiration_date = expiration_date;
		}

		public String getState() {
			return state;
		}

		public void setState(String state) {
			this.state = state;
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

		public Person getPerson() {
			return person;
		}

		public void setPerson(Person person) {
			this.person = person;
		}
	    
}
