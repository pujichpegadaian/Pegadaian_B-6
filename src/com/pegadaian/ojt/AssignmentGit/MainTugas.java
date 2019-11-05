package com.pegadaian.ojt.tugas;

import java.util.Scanner;

public class MainTugas {

	public static void main(String[] args) {
		int menu;
		Scanner input = new Scanner(System.in);

		System.out.println("Pegadaian System");
		System.out.println("================");
		System.out.println("1. Gadai");
		System.out.println("2. Tebus");
		System.out.println("3. Tampilkan Inventory");
		System.out.println("4. exit");
        try
        {
			do {					
				System.out.print("Masukkan Menu Pilihan : ");
				menu = input.nextInt();
				
				if(menu==1) {
					System.out.println("Gadai");
				} else if(menu==2) {
					System.out.println("Tebus");
				} else if(menu==3) {
					System.out.println("Tampilkan Inventory");
				} else if(menu==4) {
					System.out.println("Exit");
				} else {
					System.out.println("Menu Tidak Ditemukan");
				}
			} while(menu!=4);
        }
        
        catch(Exception e)
        {
        	System.out.println("ERROR, Input Hanya Angka");
        }
	}

}
