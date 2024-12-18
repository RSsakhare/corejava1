package com.product.www;

public class TestProduct {

	public static void main(String[] args) {

		Product p = new Product();
		p.setProductName("Samsung");
		p.setProductCode(5645);
		p.setPrice(1000);
		p.setPercentage(10);
		System.out.println(p.getProductName()+p.getProductCode()+p.getPrice()+p.getPercentage());
		p.applyDiscount();
		
		
	}

}
