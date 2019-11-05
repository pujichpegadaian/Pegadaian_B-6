package com.pegadaian.ojt.AssignmentGit;

public class DataTebus {
	int id;
	String product;
	double price;
	String status;
	double utang;
	
	public DataTebus(int id, String product, double price, String status, double utang) {
		super();
		this.id = id;
		this.product = product;
		this.price = price;
		this.status = status;
		this.utang = utang;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getProduct() {
		return product;
	}
	public void setProduct(String product) {
		this.product = product;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public double getUtang() {
		return utang;
	}
	public void setUtang(double utang) {
		this.utang = utang;
	}
	
	
	

}
