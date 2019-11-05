package com.pegadaian.ojt.AssignmentGit;

public class Database {

	private String product;
	private String nama;
	private double price;
	private double utang;
	private String status;
	private String description;
	private int ID=0;
	
	public Database(String product, String nama, double price, double utang, String status, String description) {
		this.product = product;
		this.nama = nama;
		this.price = price;
		this.utang = utang;
		this.status = status;
		this.description = description;
	}
	
	public void printHeaderInv() {
		System.out.println("===============================================");
		String Format = "%-3 | %-15s | %-5s | %-15s | %-10d |%n";
		System.out.format(Format, "ID", "Nama", "Product", "Description", "Price" );
		System.out.println("===============================================");
	}
	
	public void printRowInv() {
        String Format = "%-3 | %-15s | %-5s | %-15s | %-10d |%n";
        System.out.format(Format, ID++, nama, product, description, price);
    }
	
	public void printFooterInv() {
		System.out.println("===============================================");
	}
	
	public void printHeaderTebus() {
		System.out.println("===============================================");
		String Format = "%-3 | %-15s | %-15s | %-8s | %-15d |%n";
		System.out.format(Format, "ID", "Product", "Price", "Status", "Utang" );
		System.out.println("===============================================");
	}
	
	public void printRowTebus() {
		String Format = "%-3 | %-15s | %-15s | %-8s | %-15d |%n";
        System.out.format(Format, ID++, product, price, status, utang);
    }
	
	public void printFooterTebus() {
		System.out.println("===============================================");
	}
	
//	public void printHeaderGadai() {
//		System.out.println("===============================================");
//		String Format = "%-3 | %-15s | %-5s | %-15s | %-10d |%n";
//		System.out.format(Format, "ID", "Nama", "Product", "Description", "Price" );
//		System.out.println("===============================================");
//	}
//	
//	public void printRowGadai() {
//        String Format = "%-3 | %-15s | %-5s | %-15s | %-10d |%n";
//        System.out.format(Format, ID++, nama, product, description, price);
//    }
//	
//	public void printFooterGadai() {
//		System.out.println("===============================================");
//	}
	
	public void setUtang(double utang) {
		this.utang = utang;
	}

	public void setStatus(String status) {
		this.status = status;
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
