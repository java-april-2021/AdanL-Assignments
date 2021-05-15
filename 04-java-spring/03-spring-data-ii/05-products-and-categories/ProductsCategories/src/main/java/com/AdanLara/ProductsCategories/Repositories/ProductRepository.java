package com.AdanLara.ProductsCategories.Repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.AdanLara.ProductsCategories.Models.Category;
import com.AdanLara.ProductsCategories.Models.Product;

@Repository
public interface ProductRepository extends CrudRepository <Product, Long>{
	
	List<Product> findAll();
	List<Product> findByCategoriesNotContains(Category category);
}
