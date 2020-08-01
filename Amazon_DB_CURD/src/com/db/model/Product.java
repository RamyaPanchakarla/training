package com.db.model;

public class Product {
	private String name;
	private int cost;
	private String discount;
	private int quantity;
	private String url;
	
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getCost() {
		return cost;
	}
	public void setCost(int cost) {
		this.cost = cost;

	}
	
	
	public String getDiscount() {
		return discount;
	}
	public void setDiscount(String discount) {
		this.discount = discount;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	@Override
	public String toString() {
		return "Product [name=" + name + ", cost=" + cost + ", discount=" + discount + ", quantity=" + quantity
				+ ", url=" + url + "]";
	}

}
