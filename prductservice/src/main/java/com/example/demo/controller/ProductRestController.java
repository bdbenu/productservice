package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.example.demo.dto.Cupon;
import com.example.demo.model.Product;
import com.example.demo.service.ProductService;

@RestController
@RequestMapping("/productapi")
public class ProductRestController {

	@GetMapping("/test")
	public String apiTest() {

		return "-PRODUCT- -API- -WORKING- -FINE-";
	}

	@Autowired
	private RestTemplate restTemplate;
	
	@Value("${cuponService.url}")
	private String  cuponServiceUrl;

	@Autowired
	private ProductService productService;

	@PostMapping("/productt")
	public Product prductCreate(@RequestBody Product product) {
		Cupon cupon = restTemplate.getForObject(cuponServiceUrl+product.getCupCode(), Cupon.class);		
		product.setProdCost(product.getProdCost() - cupon.getCupDiscount());
		return productService.productCreate(product);
	}

	@GetMapping("/product/{prodCode}")
	public Product getProductByProductCode(@PathVariable("prodCode") String prodCode) {
		return productService.getProductByProductCode(prodCode);
	}

	@GetMapping("/products")
	public List<Product> products() {

		return productService.products();
	}
}
