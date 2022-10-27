package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Product;
import com.example.demo.repositary.ProducRepositary;
@Service
public class ProductServiceImpl implements ProductService{
	
	@Autowired
	private ProducRepositary producRepositary;
	
	
	@Override
	public Product productCreate(Product product) {
		return producRepositary.save(product);
	}

	@Override
	public List<Product> products() {
		
		return producRepositary.findAll();
	}

	@Override
	public Product getProductByProductCode(String prodCode) {
		return producRepositary.findByProdCode(prodCode);
	}

}
