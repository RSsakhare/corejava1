package com.day2.www;

public class MobileDevice {
	private int modelNo;
	private String modelName,companyName;
	private double price;
	public int getModelNo() {
		return modelNo;
	}
	public void setModelNo(int modelNo) {
		this.modelNo = modelNo;
	}
	public String getModelName() {
		return modelName;
	}
	public void setModelName(String modelName) {
		this.modelName = modelName;
	}
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public void print()
	{
		System.out.println("Model No:- "+modelNo+"\n"+"Model Name= "+modelName+"\n"+"Company Name= "+companyName+"\n"+"Price="+price);
	}
}
