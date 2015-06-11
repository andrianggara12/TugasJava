import java.io.*;

public class TokoBaju

{
	public static void main(String[] args) throws Exception
	{
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		
		int Baju = 0;
		int Bonus=0;
		int Jumlah =0;
		int harga = 25000;
		
			System.out.println("============================");
			System.out.println("      Toko Baju Andri		");
			System.out.println("============================");
			System.out.print("Masukkan Jumlah baju yang dibeli = ");
			Baju = Integer.parseInt(br.readLine());
			
				Bonus =Baju/2;
				Jumlah = Baju +Bonus;
				System.out.println("Bonus Barang \t\t\t = " + Bonus);
				System.out.println("Total Semua Item \t = "+ Jumlah);
				System.out.println("Total Harga Baju yang dibeli \t = "+harga*Baju);
				
			
	
	}
	




}
