package com.AdanLara.ProductsCategories.Models;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Entity
@Table(name="categories")
public class Category {
	
	   @Id
	   @GeneratedValue(strategy = GenerationType.IDENTITY)
	   private Long id;
	   
	   @NotBlank
	   @Size(min= 4 , max=15)
	   private String name;
	   
	   @Column(updatable=false)
	   private Date createdAt;
	   
	   private Date updatedAt;
	   
	   @PrePersist
	   protected void onCreate() {
		   this.createdAt= new Date();
	   }
	   
	   @PreUpdate
	   protected void onUpdate() {
		   this.updatedAt= new Date();
	   }
	   
	   @ManyToMany(fetch = FetchType.LAZY)
	   @JoinTable(
	       name = "categories_products", 
	       joinColumns = @JoinColumn(name = "category_id"), 
	       inverseJoinColumns = @JoinColumn(name = "product_id")
	   )
	   private List<Product> products;
	   
	   //Construtor
	    public Category() {
	        
	    }
	    //GNS

		public Long getId() {
			return id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
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

		public List<Product> getProducts() {
			return products;
		}

		public void setProducts(List<Product> products) {
			this.products = products;
		}
	    
}
