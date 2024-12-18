package com.product.www;

public class Product {
	
	private String productName;
	private int productCode;
	private double price;
	private double percentage;
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public int getProductCode() {
		return productCode;
	}
	public void setProductCode(int productCode) {
		this.productCode = productCode;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	public double getPercentage() {
		return percentage;
	}
	public void setPercentage(double percentage) {
		this.percentage = percentage;
	}
	public void applyDiscount()
	{
		
		System.out.println("Price After Discount ="+(price-(percentage/100)*price));
	}

}
