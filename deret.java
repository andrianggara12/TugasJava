import java.util.*;

public class deret
{
	public static void main (String [] args)
	{
	
		Scanner k = new Scanner (System.in);
		System.out.print ("Masukkan jumlah n: ");
		int n =k.nextInt();
		System.out.print ("Masukkan jumlah m: ");
		int m =k.nextInt();
		int deret = 1;
		int c=0;
		while(c<n) {
			int d=0;
			while (d<m){
				//check kondisi logical or ||
			
				System.out.print(deret+"\t");
				deret++;
				d++;
			}
				System.out.println();
				c++;
		}
		
	}

}
