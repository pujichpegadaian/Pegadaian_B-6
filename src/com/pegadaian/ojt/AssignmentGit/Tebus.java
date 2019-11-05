import java.util.ArrayList;
import java.util.Scanner;

public class Tebus {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int id;
		String product;
		double price = 0;
		String status;
		double utang;
		
		
		System.out.println("Pegadaian System");
		System.out.println("================");
		System.out.println("1. Gadai");
		System.out.println("2. Tebus");
		System.out.println("3. Tampilkan Inventory");
		System.out.println("4. Exit");
		System.out.print("Opsi: ");
		
		//coba data sendiri
		ArrayList<DataTebus> arrTebus = new ArrayList<>();
		arrTebus.add(new DataTebus(1,"Laptop",4000000.00,"gadai",4000000.00));
		arrTebus.add(new DataTebus(2,"Motor",7000000.00,"gadai",7000000.00));
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Masukkan opsi: ");
		int opsi = sc.nextInt();
		
		
			if (opsi==1) {
				System.out.println("gadai");
			} else if (opsi==2){
				System.out.println("Tebus");
				System.out.print("Masukkan yang ditebus: ");
				double yangdiTebus = sc.nextDouble();
				double updateUtang = price - yangdiTebus;
				
		
			
			
		}
		
		
		
		
		
		
		
		
		
		

	}

}

