package com.example.demo.model;

public class Product {

	private int productId;
	private String productName;
	private String produtDescription;
	
	public Product()
	{
		
	}
	Product(int id,String name, String desc)
	{
		this.productId = id;
		this.productName = name;
		this.produtDescription = desc;
	}

	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getProdutDescription() {
		return produtDescription;
	}

	public void setProdutDescription(String produtDescription) {
		this.produtDescription = produtDescription;
	}
}
