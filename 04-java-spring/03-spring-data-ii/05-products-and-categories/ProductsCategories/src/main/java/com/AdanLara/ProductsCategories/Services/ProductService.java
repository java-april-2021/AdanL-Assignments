package com.AdanLara.ProductsCategories.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.AdanLara.ProductsCategories.Models.Category;
import com.AdanLara.ProductsCategories.Models.Product;
import com.AdanLara.ProductsCategories.Repositories.ProductRepository;

@Service
public class ProductService {
	@Autowired
	private ProductRepository pRepo;
	
	//get all products
	public List<Product> getAllProducts(){
		return this.pRepo.findAll();
	}
	
	//save product
	public Product saveProduct(Product product) {
		return this.pRepo.save(product);
	}
	//get one
	public Product getProduct(Long id) {
		return this.pRepo.findById(id).orElse(null);
	}
	//add category
	public void addCategory(Category category, Product product) {
		//get arraylist from Product Model
		 List<Category> categories = product.getCategories();
		 //add to list
		 categories.add(category);
		 //update DB
		 this.pRepo.save(product);
	}
	public List<Product> notInCategory(Category category){
		return this.pRepo.findByCategoriesNotContains(category);	
	}
}
