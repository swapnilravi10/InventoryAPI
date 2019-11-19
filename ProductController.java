package com.swapnil.demo;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController 
{
	@Autowired
	productDao pd;
	
	@GetMapping("product/{pid}")
	public Optional<Product> getProduct(@PathVariable("pid") int pid)
	{
		return pd.findById(pid);
	}
	
	@GetMapping("products")
	public List<Product> getProducts()
	{
		return pd.findAll();
	}
	
	@PostMapping("addproduct")
	public Product addProduct(Product prod)
	{
		return pd.save(prod);
	}
	
	@PutMapping("updateproduct")
	public Product updateProduct(Product prod)
	{
		return pd.save(prod);
	}
}
