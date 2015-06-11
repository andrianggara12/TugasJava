public class ArrayCoba2
{
	public static void main(String[] args)
	{
		int []Random = new int[10];
		double rataRata;
		int min;
		int max;
		System.out.println("Mengisi angka random dengan 10 bilangan random : ");
		for (int i = 0; i<Random.length;i++)
		{
			Random[i] = (int)(Math.random()*10.0);
		}
			rataRata = (double)total/(double)Random.length;
			System.out.println("Menampilkan hasil bilangan random dalam array  : ");
			min = Random[0];
			max = Random[0];
			for(int j = 0;j<Random.length;j++)
			{
				if(min>Random[j])
				min = Random[j];
				if(max>Random[j])
				max = Random[j];
				System.out.println("Data Random ke [" +j+"] = "+Random[j]);
			}
			System.out.println("Masukkan Rata - rata : " +rataRata);
			System.out.println("Masukkan Nilai Maksimal : " +max);
			System.out.println("Masukkan Nilai Minimal : " +min);
			//menampilkan isi bargraph
			for(int i = 0; i<Random.length;i++)
			{
				for(int j=0;j<Random[i];j++)
				{
					System.out.print("*");
				}
			}
				System.out.println();
	}
}
