package TugasPertama;

public class Lanjutan {
	 int id = 0;
		
		
		
		boolean ok;
		do{
			ok = true;
			System.out.print("Masukkan ID barang yang akan ditebus: ");
			try{
				id = scanner.nextInt();
			}
			catch (Exception e) {
				System.out.println("ID yang Anda masukkan salah!");
				ok = false;//agar ngelop dengan baik lagi
				scanner.nextLine();
			}
		}while(!ok);
		
		{
		
		if(id ==1 ){
		
			System.out.println("Barang yang akan Anda tebus ialah laptop");
	    	System.out.println();
		} else if (id == 2){
	    	System.out.println("Barang yang akan Anda tebus ialah Motor");
	    	System.out.println();
		}
		else{
	    	System.out.println("Maaf, pilihan Anda tidak tersedia");
	    	System.out.println();
	    	
	    }
		};
	    
	    
	    
	    double biaya = 0;
	    boolean ok1;
		do{
			ok1 = true;
			System.out.print("Masukkanlah biaya yang akan ditebus: ");
			System.out.println();
			try{
				biaya = scanner.nextInt();
				if(biaya%10000!=0)
					System.out.println("Mohon masukkan biaya dengan kelipatan 10000");
				System.out.println();
			}
			catch (Exception e) {
				System.out.println("Maaf, inputan Anda belum tepat!");
				System.out.println();
				ok = false;//agar ngelop dengan baik lagi
				scanner.nextLine();
			}
		}while(!ok);
		
		
		double sisa_utang = 0;
		sisa_utang = sisa_utang + (4000000 - biaya);
		
		if(sisa_utang<0) {
			System.out.println("Mohon untuk membayar dengan maksimal 4000000");
		}else if (sisa_utang == 0){
			System.out.println("Status pelunasan Anda ialah: lunas");
		}else{
			System.out.println("Status pelunasan Anda ialah: belum lunas");
			System.out.println("Sisa hutang Anda ialah: " + sisa_utang);
		}
		
		
		
		
		
		
		
	    
}
