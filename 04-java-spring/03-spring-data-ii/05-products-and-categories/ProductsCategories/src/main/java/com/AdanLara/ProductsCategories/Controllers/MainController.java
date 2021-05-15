package com.AdanLara.ProductsCategories.Controllers;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.AdanLara.ProductsCategories.Models.Category;
import com.AdanLara.ProductsCategories.Models.Product;
import com.AdanLara.ProductsCategories.Services.CategoryService;
import com.AdanLara.ProductsCategories.Services.ProductService;

@Controller
public class MainController {
	@Autowired
	private ProductService pServ;
	@Autowired
	private CategoryService cServ;
	
	
	
	@GetMapping("/products/new")
	public String addProduct(@ModelAttribute("newProduct") Product product) {
		return "/AddProducts.jsp";
	}
	
	@PostMapping("/products/new")
	public String saveProduct(@Valid @ModelAttribute("newProduct") Product product, BindingResult result) {
		if(result.hasErrors()) {
		return "AddProducts.jsp";
	}
		this.pServ.saveProduct(product);
		return "redirect:/products/new";
	}
	@GetMapping("/category/new")
	public String addcategory(@ModelAttribute("newCategory") Category category) {
		return "/AddCategory.jsp";
	}
	
	@PostMapping("/category/new")
	public String savecategory(@Valid @ModelAttribute("newCategory") Category category, BindingResult result) {
		if(result.hasErrors()) {
		return "AddCategory.jsp";
	}
		this.cServ.saveCategory(category);
		return "redirect:/category/new";
	}
	//add category to product
	@GetMapping("/products/{id}")
	public String showProduct(@PathVariable("id") Long id, Model viewModel ) {
		Product newProduct= this.pServ.getProduct(id);
		viewModel.addAttribute("product", newProduct);
		viewModel.addAttribute("category", this.cServ.notInProduct(newProduct));
		return "ShowProduct.jsp";
	}
	@PostMapping("/products/{id}")
	public String showProduct(@PathVariable("id") Long id, @RequestParam("categories") Long catId) { 
		Category category= this.cServ.getCategory(catId);
		Product product=this.pServ.getProduct(id);
		this.pServ.addCategory(category,product);
		return "redirect:/products/"+id;
	}
		//add product to category 
	@GetMapping("/categories/{id}")
	public String showCategory(@PathVariable("id") Long id, Model viewModel) {
		Category cCategory= this.cServ.getCategory(id);
		viewModel.addAttribute("category", this.cServ.getCategory(id));
		viewModel.addAttribute("product", this.pServ.notInCategory(cCategory));
		return "ShowCategories.jsp";
	}
	
	@PostMapping("/categories/{id}")
	public String showCategory(@PathVariable("id") Long id, @RequestParam ("products")Long proId) {
		Product product= this.pServ.getProduct(proId);
		Category category= this.cServ.getCategory(id);
		this.cServ.addProduct(product, category);
		return "redirect:/categories/"+id;
				
	}
	
}
