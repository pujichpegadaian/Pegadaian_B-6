package com.pegadaian.ojt.AssignmentGit;

public class Database {

	private String product;
	private String nama;
	private double price;
	private double utang;
	private String status;
	private String description;
	
	
	
	public void setProduct(String product) {
		this.product = product;
	}
	public void setNama(String nama) {
		this.nama = nama;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public void setUtang(double utang) {
		this.utang = utang;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getProduct() {
		return product;
	}
	public String getNama() {
		return nama;
	}
	public double getPrice() {
		return price;
	}
	public double getUtang() {
		return utang;
	}
	public String getStatus() {
		return status;
	}
	public String getDescription() {
		return description;
	}
	
}
