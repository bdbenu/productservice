package com.example.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(name = "PRODUCT_MASTER")
public class Product {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "PROD_ID")
	private Integer prodId;

	@Column(name = "PROD_NAME")
	private String prodName;

	@Column(name = "PROD_CODE")
	private String prodCode;

	@Column(name = "PROD_COST")
	private Double prodCost;

	@Transient
	private String cupCode;

	public Integer getProdId() {
		return prodId;
	}

	public void setProdId(Integer prodId) {
		this.prodId = prodId;
	}

	public String getProdName() {
		return prodName;
	}

	public void setProdName(String prodName) {
		this.prodName = prodName;
	}

	public String getProdCode() {
		return prodCode;
	}

	public void setProdCode(String prodCode) {
		this.prodCode = prodCode;
	}

	public Double getProdCost() {
		return prodCost;
	}

	public void setProdCost(Double prodCost) {
		this.prodCost = prodCost;
	}

	public String getCupCode() {
		return cupCode;
	}

	public void setCupCode(String cupCode) {
		this.cupCode = cupCode;
	}
	

}
