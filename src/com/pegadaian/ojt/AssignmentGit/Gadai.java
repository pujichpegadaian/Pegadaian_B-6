package com.pegadaian.ojt.tugas;

import java.util.ArrayList;
import java.util.Scanner;
import com.pegadaian.ojt.tugas.Database;

public class Gadai {
	public static void gadai(ArrayList<Database> data) {
			int menu;
			Double harga = null;
			String nama = null;
			String produk = null;
			String detil = null;
			boolean stNama = false;
			boolean stKat = false;
			boolean stDesk = false;
			boolean stPrice = false;
			
			boolean loop = true;

			Scanner input = new Scanner(System.in);
			while(loop) {
				try {
					System.out.println("Name : ");
					nama = input.nextLine();
					if ((nama.length()>3 )&&(nama.length()<15) ) {
						stNama=true;
						loop=false;
					}else {
						System.out.println("Input minimal 3 karakter dan kurang dari 15 karakter");
					}
				} catch (Exception e) {
					System.out.println();
					input.next();
					continue;
				}
			}
			loop=true;

			while(loop) {
				try {
					System.out.println("Product Category : ");
					produk = input.nextLine();
					if ((produk.equalsIgnoreCase("laptop"))||(produk.equalsIgnoreCase("motor"))||(produk.equalsIgnoreCase("emas"))) {
						stNama=true;
						loop=false;
					}else {
						System.out.println("Barang gadai harus diantara barang berikut : Laptop, Motor, Emas");
					}
				} catch (Exception e) {
					System.out.println();
					input.next();
					continue;
				}
			}
			loop=true;

			while(loop) {
				try {
					System.out.println("Description : ");
					detil = input.nextLine();
			        int countWords=0;
			        for(int i=0; i<detil.length()-1; i++)
			        {
			            if(detil.charAt(i)==' ' && detil.charAt(i+1)!=' ')
			                countWords++;
			        }
			        if (countWords < 2) {
				        System.out.println("Deskripsi harus memiliki minimal 3 kata");
			        } else {
			        	stDesk=true;
						loop=false;
			        }
				} catch (Exception e) {
					System.out.println();
					input.nextLine();
					continue;
				}
			}
			loop=true;
			

			while(loop) {
				try {
					System.out.println("Price : ");
					harga = input.nextDouble();
					if(harga%10000 == 0) {
						loop=false;
					} else {
						System.out.println("Harga harus kelipatan 10.000");
					}
				} catch (Exception e) {
					System.out.println("Masukkan angka");
					input.next();
					continue;
				}
			}
			loop=true;
		
			Database dataGadai = new Database (data.size()+1, produk, nama, harga, harga, "gadai", detil);
			data.add(dataGadai);
			
			for(int i=0; i<data.size(); i++)
	        {
				System.out.println(data.get(i).getID()+" nama :"+data.get(i).getNama());
	            
	        }
			
//			array[array.length]= new database [produk, nama, harga, harga, "gadai", detil]

	}
}
