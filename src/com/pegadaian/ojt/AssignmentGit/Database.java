package com.pegadaian.ojt.AssignmentGit;

public class Database {

	private String product;
	private String nama;
	private double price;
	private double utang;
	private String status;
	private String description;
	
	
	public Database(String product, String nama, double price, double utang, String status, String description) {
		super();
		this.product = product;
		this.nama = nama;
		this.price = price;
		this.utang = utang;
		this.status = status;
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
