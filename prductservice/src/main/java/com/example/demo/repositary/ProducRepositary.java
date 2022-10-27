package com.example.demo.repositary;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.Product;

public interface ProducRepositary extends JpaRepository<Product, Serializable> {

	Product findByProdCode(String prodCode);

}
