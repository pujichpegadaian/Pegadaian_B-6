import java.util.ArrayList;
import java.util.Scanner;

public class Tebus {
	public static void main(String[] args) throws Exception {
		DataTebus[] arTebus = new DataTebus[2];
//		
		arTebus[0] = new DataTebus(1,"Laptop",4000000.00,"gadai",4000000.00);
		arTebus[1] = new DataTebus(2,"Motor",7000000.00,"gadai",7000000.00);
		Scanner sc = new Scanner(System.in);
		
		
//		ArrayList<DataTebus> arrTebus = new ArrayList<>();
//		arrTebus.add(new DataTebus(1,"Laptop",4000000.00,"gadai",4000000.00));
//		arrTebus.add(new DataTebus(2,"Motor",7000000.00,"gadai",7000000.00));
//		
		
		System.out.print("Masukkan ID yang ingin ditebus: ");
		int idnya = sc.nextInt();
		System.out.println("ID " +idnya);
		//menyamakan input id dengan id yang ada di array
		for (int i = 0; i < 5; i++) {
			if (idnya == arrTebus.getId(i)) {
				System.out.println("Id yang diinputkan sesuai");
				System.out.print("Masukkan biaya yang ingin ditebus: ");
				double biayaTebus = sc.nextDouble();
				System.out.print("Biaya yang ingin ditebus:  " +biayaTebus);
				double updateTebus = arrTebus.getPrice - arrTebus.getUtang;
				
				//update Price menjadi updateTebus;
				
				//update utang
				
				
				
				
			} else if(idnya != arrTebus.getId(i)) {
				System.out.println("Salah");
		}
		
			
		}
		
		
		
		
		
		
		
		
	}
}
