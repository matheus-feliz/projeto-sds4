package com.feliz.felizdsvendassds4.dto;

import java.io.Serializable;

import com.feliz.felizdsvendassds4.entities.Seller;

public class SaleSumDTO implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private String sellername;
	private Double sum;
	
	public SaleSumDTO() {
		
	}
	
	public SaleSumDTO(Seller seller, Double sum) {
		sellername = seller.getName();
		this.sum = sum;
	}



	public String getSellername() {
		return sellername;
	}

	public void setSellername(String sellername) {
		this.sellername = sellername;
	}

	public Double getSum() {
		return sum;
	}

	public void setSum(Double sum) {
		this.sum = sum;
	}
	
	
}
