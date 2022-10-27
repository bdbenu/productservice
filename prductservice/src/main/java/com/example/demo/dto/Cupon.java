package com.example.demo.dto;

public class Cupon {
	
	private Integer cupId;
	
	private String cupCode;
	
	private String cupName;
	
	private Double cupDiscount;

	public Integer getCupId() {
		return cupId;
	}

	public void setCupId(Integer cupId) {
		this.cupId = cupId;
	}

	public String getCupCode() {
		return cupCode;
	}

	public void setCupCode(String cupCode) {
		this.cupCode = cupCode;
	}

	public String getCupName() {
		return cupName;
	}

	public void setCupName(String cupName) {
		this.cupName = cupName;
	}

	public Double getCupDiscount() {
		return cupDiscount;
	}

	public void setCupDiscount(Double cupDiscount) {
		this.cupDiscount = cupDiscount;
	}
	

}
