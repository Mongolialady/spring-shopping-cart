package com.synergicit.dao;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "products")
public class Product {
	@Id
	private int productId;
	
	@Indexed(unique = true)
	private String productName;
	private String vendorName;
	private double price;
	private String category;
	private String imageUrl;
	private int starRating;
	
	public Product() {
		super();
	}

	public Product(int productId, String productName, String vendorName, double price, String category, String imageUrl,
			int starRating) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.vendorName = vendorName;
		this.price = price;
		this.category = category;
		this.imageUrl = imageUrl;
		this.starRating = starRating;
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
	
	public void setPoductName(String productName) {
		this.productName = productName;
	}
	
	public String getVendorName() {
		return vendorName;
	}
	
	public void setVendorName(String vendorName) {
		this.vendorName = vendorName;
	}
	
	public double getPrice() {
		return price;
	}
	
	public void setPrice(double price) {
		this.price = price;
	}
	
	public String getCategory() {
		return category;
	}
	
	public void setCategory(String category) {
		this.category = category;
	}
	
	public String getImageUrl() {
		return imageUrl;
	}
	
	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}
	
	public int getStarRating() {
		return starRating;
	}
	
	public void setStarRating(int starRating) {
		this.starRating = starRating;
	}
	
	@Override
	public String toString() {
		return "Product [productId=" + productId + ", productName=" + productName + ", vendorName=" + vendorName
				+ ", price=" + price + ", category=" + category + ", imageUrl=" + imageUrl + ", starRating="
				+ starRating + "]";
	}
}
