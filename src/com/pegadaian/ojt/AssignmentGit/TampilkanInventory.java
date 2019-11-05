package com.pegadaian.ojt.AssignmentGit;
import com.pegadaian.ojt.AssignmentGit.Database;

import java.util.ArrayList;
import java.util.Scanner;
public class TampilkanInventory {
//	public static void main(String[] args) {
	public void tampilkan (ArrayList<Database> data) {		
			
	//	Database database = new Database();/
//		Database dataGadai = new Database (data.size()+1, produk, nama, harga, harga,);
//		data.add(dataGadai);
		
		System.out.println("===============================================");
		String Format = "%-3s | %-15s | %-5s | %-15s | %-10s |%n";
		System.out.format(Format, "ID", "Nama", "Product", "Description", "Price" );
		System.out.println("===============================================");
		for(int i=0; i<data.size(); i++)
        {
			
//			System.out.println(data.get(i).getID()+" nama :"+data.get(i).getNama());
			String Format2 = "%-3d | %-15s | %-5s | %-15s | %-10d |%n";
	        System.out.format(Format, data.get(i).getID(), data.get(i).getNama(), data.get(i).getProduct(), data.get(i).getDescription(), data.get(i).getPrice());
        }
		System.out.println("===============================================");
	    }
}