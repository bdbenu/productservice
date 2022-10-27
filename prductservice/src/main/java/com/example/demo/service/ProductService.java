package com.example.demo.service;

import java.util.List;

import com.example.demo.model.Product;

public interface ProductService {
	
	public Product productCreate(Product product);
	
	public List<Product> products();
	
	public Product getProductByProductCode(String prodCode);

}
