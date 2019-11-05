package com.pegadaian.ojt.tugas;

import java.util.ArrayList;
import java.util.Scanner;

public class MainTugas {

	public static void main(String[] args) {
		int menu;
		int harga;
		String nama;
		String produk;
		String detil;
		
		Scanner input = new Scanner(System.in);

		System.out.println("Pegadaian System");
		System.out.println("================");
		System.out.println("1. Gadai");
		System.out.println("2. Tebus");
		System.out.println("3. Tampilkan Inventory");
		System.out.println("4. exit");
		
		
		ArrayList<Database> arrayData = new ArrayList<Database>();
		
		do {					
				System.out.print("Masukkan Menu Pilihan : ");
				menu = input.nextInt();
				if(menu==1) {
					Gadai.gadai(arrayData);
//					stop;
				} else if(menu==2) {
					System.out.println("Tebus");
				} else if(menu==3) {
					System.out.println("Tampilkan Inventory");
				} else if(menu==4) {
					System.out.println("Exit");
				} else {
					System.out.println("Menu Tidak Ditemukan");
				}
			} while(menu!=6);



//        Scanner in = new Scanner(System.in);
//
//        System.out.println("Enter first number :");
//        int num1 = in.nextInt();
//        System.out.println("Enter second number :");
//        int num2 = in.nextInt();
//        
//        int sum 		= num1 + num2;
//        int difference 	= num1 - num2;
//        int product 	= num1 * num2;
//        int quotient	= num1 / num2;
//        int modulo	    = num1 % num2;
//        
//        System.out.println("Sum : "         + sum);
//        System.out.println("Difference : "  + difference);
//        System.out.println("Product : "     + product);
//        System.out.println("Quotient : "    + quotient);
//        System.out.println("Modulo : "      + modulo);
		
		
//		System.out.println("Pegadaian System");
//		System.out.println("================");
//		System.out.println("1. Gadai");
//		System.out.println("2. Tebus");
//		System.out.println("3. Tampilkan Inventory");
//		System.out.println("4. exit");
//		int pil=-1;
//		do {
//			Scanner input = new Scanner(System.in);
//			try {
//				System.out.print("Masukan input menu anda : ");
//				pil = input.nextInt();
//				
//			}catch(Exception e){
//				System.out.println("Masukkan input angka 1 sampai 4");
//			}
//		}while ( pil>3 || pil<0);
//		
//		if (pil==1) {
//			System.out.println("Gadai");
//		}
//		else if(pil == 2) {
//			System.out.println("Gadai");
//			
//		}else {
//			System.out.println("Gadai");
//		}

		
		
	}

}