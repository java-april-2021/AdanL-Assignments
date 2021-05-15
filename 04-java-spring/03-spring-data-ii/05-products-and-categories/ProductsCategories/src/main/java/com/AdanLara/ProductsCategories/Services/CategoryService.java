package com.AdanLara.ProductsCategories.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.AdanLara.ProductsCategories.Models.Category;
import com.AdanLara.ProductsCategories.Models.Product;
import com.AdanLara.ProductsCategories.Repositories.CategoryRepository;

@Service
public class CategoryService {
	@Autowired
	private CategoryRepository cRepo;
	//get all caegories
	public List<Category> getAllCategories(){
		return this.cRepo.findAll();
	}
	//get all not in product
	public List<Category> notInProduct(Product product){
		return this.cRepo.findByProductsNotContains(product);
	}
	
	//save a category
	public Category saveCategory(Category c) {
		return this.cRepo.save(c);
	}
	//get one
	public Category getCategory(Long id) {
		return this.cRepo.findById(id).orElse(null);
	}
	//add product
	public void addProduct(Product pro,Category cat) {
		List<Product> products = cat.getProducts();
		products.add(pro);
		this.cRepo.save(cat);
	}
}
