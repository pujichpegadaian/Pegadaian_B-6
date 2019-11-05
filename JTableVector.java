import java.awt.BorderLayout;
import java.util.Vector;
import java.util.Scanner;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class JTableVector {
  public static void main(String args[]) {
    JFrame frame = new JFrame();
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    Double price;
    Double utang;
    String Gadai1;
    Scanner scanner = new Scanner(System.in);
    
    
    Vector<String> rowOne = new Vector<String>();
    rowOne.addElement("1");
    rowOne.addElement("Laptop");
    rowOne.addElement("4000000");
    rowOne.addElement("Gadai1");
    rowOne.addElement("4000000");
    
    Vector<String> rowTwo = new Vector<String>();
    rowTwo.addElement("2");
    rowTwo.addElement("Motor");
    rowTwo.addElement("7000000");
    rowTwo.addElement("Gadai");
    rowTwo.addElement("7000000");
    
    Vector<Vector> rowData = new Vector<Vector>();
    rowData.addElement(rowOne);
    rowData.addElement(rowTwo);
    
    Vector<String> columnNames = new Vector<String>();
    columnNames.addElement("ID");
    columnNames.addElement("Product");
    columnNames.addElement("Price");
    columnNames.addElement("Status");
    columnNames.addElement("Utang");
    JTable table = new JTable(rowData, columnNames);

    JScrollPane scrollPane = new JScrollPane(table);
    frame.add(scrollPane, BorderLayout.CENTER);
    frame.setSize(300, 150);
    frame.setVisible(true);
    
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
	switch(id ){
	case 1:
		System.out.println("Barang yang akan Anda tebus ialah laptop");
    	System.out.println();
    	break;
	case 2:
    	System.out.println("Barang yang akan Anda tebus ialah Motor");
    	System.out.println();
    	break;
    default:
    	System.out.println("Maaf, pilihan Anda tidak tersedia");
    	System.out.println();
    	break;
    	
    }
	} while(id!=2);
    
    
    
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
}