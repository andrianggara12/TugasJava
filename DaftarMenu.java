import java.io.*;
class DaftarMenu
{
	public static void main(String []args) throws Exception
	{BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			int menu = 0;
			int pil = 0;
			int jpb = 0;
			int jpa = 0;
			int jpt = 0;
			String pesan = "";
			String iya = "";
			String tidak = "";
		
		do
		{	
			System.out.println("=================================");
			System.out.println("           Warkop Gresik            ");
			System.out.println("=================================");
			System.out.println("  Menu\t\t      Harga     ");
			System.out.println("=================================");
			System.out.println("1.Sate Babi \t    15000");
			System.out.println("2.Sate Anoa \t    30000");
			System.out.println("3.Sate Tikus \t    5000");
			System.out.print("pilih menu : ");
			pil = Integer.parseInt(br.readLine());
			
			switch(pil)
			{
				case 1:
			System.out.println();	
			System.out.println("=================================");
			System.out.println("           Warkop Gresik            ");
			System.out.println("=================================");
			System.out.println("1.Sate Babi");
			System.out.println("Harga/porsi : 15000");
			System.out.print("Jumlah Pesanan : ");
			jpb = Integer.parseInt(br.readLine());
			System.out.println("Total Harga :"+jpb*15000);
			System.out.println("Apakah anda mau pesan lagi : iya / tidak ");
			pesan = br.readLine();
			
			if(pesan:iya)
			{
				System.out.println("=================================");
				System.out.println("           Warkop Gresik            ");
				System.out.println("=================================");
				System.out.println("  Menu\t\t      Harga     ");
				System.out.println("=================================");
				System.out.println("1.Sate Babi \t    15000");
				System.out.println("2.Sate Anoa \t    30000");
				System.out.println("3.Sate Tikus \t    5000");
				System.out.print("pilih menu : ");
				pil = Integer.parseInt(br.readLine());
			}
			else
			{
				System.out.println("Terima Kasih");
			}
			break;
				
				case 2:
			System.out.println();	
			System.out.println("=================================");
			System.out.println("           Warkop Gresik            ");
			System.out.println("=================================");
			System.out.println("2.Sate Anoa");
			System.out.println("Harga/porsi : 30000");
			System.out.print("Jumlah Pesanan : ");
			jpa = Integer.parseInt(br.readLine());
			System.out.println("Total Harga :"+jpa*30000);
			
			break;
			
				case 3:
			System.out.println();	
			System.out.println("=================================");
			System.out.println("           Warkop Gresik            ");
			System.out.println("=================================");
			System.out.println("3.Sate Tikus");
			System.out.println("Harga/porsi : 5000");
			System.out.print("Jumlah Pesanan : ");
			jpt = Integer.parseInt(br.readLine());
			System.out.println("Total Harga :"+jpt*5000);
			
			break;
			default : break;
			}
		}
		while(pil<4);
	}
}
