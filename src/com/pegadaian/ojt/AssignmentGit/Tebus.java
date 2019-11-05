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
		
	}


		
		
		
//		if (idnya == arTebus.getId(i)) {
//		System.out.println("Id yang diinputkan sesuai");
//		System.out.print("Masukkan biaya yang ingin ditebus: ");
//		double biayaTebus = sc.nextDouble();
//		System.out.print("Biaya yang ingin ditebus:  " +biayaTebus);
//		double updateTebus = arTebus.getPrice - arTebus.getUtang;
		
		//update Price menjadi updateTebus;
		
		//update utang		
		
		
		
		
		
		
//	private static Object idnya(int i) {
//		// TODO Auto-generated method stub
//		return null;
//	}
}

