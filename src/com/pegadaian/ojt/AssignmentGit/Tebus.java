<<<<<<< HEAD
=======
package com.pegadaian.ojt.AssignmentGit;
>>>>>>> Tebus
import java.util.ArrayList;
import java.util.Scanner;

public class Tebus {
	public  void tebus(ArrayList arrTebus) { 
		
//		DataTebus[] arTebus = new DataTebus[2];
//		
//		//Buat array sendiri
//		arTebus[0] = new DataTebus(1,"Laptop",4000000.00,"gadai",4000000.00);
//		arTebus[1] = new DataTebus(2,"Motor",7000000.00,"gadai",7000000.00);
		
		
		Scanner sc = new Scanner(System.in);
		
		//arrTebus.add(new DataTebus(1,"Laptop",4000000.00,"gadai",4000000.00));
		//arrTebus.add(new DataTebus(2,"Motor",7000000.00,"gadai",7000000.00));
//		i
		//Input ID yang ingin ditebus
		int idnya;
		System.out.print("Masukkan ID yang ingin ditebus: ");
		idnya = sc.nextInt();
		System.out.println("ID yang dimasukkan adalah " +idnya);
		
		
		//menyamakan input id dengan id yang ada di array
		for (int i = 0; i <= arrTebus.size(); i++) {
			if(idnya == arrTebus.get(i).getId()) {
				System.out.println("Id yang diinputkan sesuai");
				System.out.print("Masukkan biaya yang ingin ditebus: ");
				
				// Input biaya tebus
				double biayaTebus = sc.nextDouble();
				System.out.print("Biaya yang ingin ditebus:  " +biayaTebus);
				// Biaya tebus harus kelipatan 10000
				if (biayaTebus % 10000 == 0) {
					double updateTebus = arrTebus.get(i).getUtang() - biayaTebus;
					arrTebus.get(i).setUtang(updateTebus);


					if(updateTebus<0) {
						System.out.println("Mohon untuk membayar dengan maksimal 4000000");
					}else if (updateTebus == 0){
						System.out.println("Status pelunasan Anda ialah: lunas");
					}else{
						System.out.println("Status pelunasan Anda ialah: belum lunas");
						System.out.println("Sisa hutang Anda ialah: " + updateTebus);
					}
					}

					System.out.println("Berhasil menebus");
					System.out.println("Utang sekarang berjumlah "+updateTebus);
					break;
				} else if(biayaTebus % 10000 != 0) {
					System.out.println("Belum berhasil menebus");
					break;
				}
			} else if(idnya != arrTebus.get(i).getId()){
				System.out.println(arrTebus.get(i).getId());
				System.out.println("Salah");
	}
	}

public void printHeaderTebus() {
	System.out.println("===============================================");
	String Format = "%-3 | %-15s | %-15s | %-8s | %-15d |%n";
	System.out.format(Format, "ID", "Product", "Price", "Status", "Utang" );
	System.out.println("===============================================");
}

public void printRowTebus() {
	String Format = "%-3 | %-15s | %-15s | %-8s | %-15d |%n";
    System.out.format(Format, id++, product, price, status, utang);
}

public void printFooterTebus() {
	System.out.println("===============================================");
}
//Database.printHeader();
//for (Database dumperDB : array) 
//					dumperDB.printRow();
//
//Database.printFooter();

}

