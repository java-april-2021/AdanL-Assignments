package com.AdanLara.ProductsCategories.Repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.AdanLara.ProductsCategories.Models.Category;
import com.AdanLara.ProductsCategories.Models.Product;

@Repository
public interface CategoryRepository extends CrudRepository <Category, Long>{
	
	List<Category> findAll();
	
	List<Category> findByProductsNotContains(Product product);
}
