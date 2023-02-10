package tugasBesar;
import java.util.Scanner;
public class RickyPutraSardika_08 
{
	public static void main(String[] args) 
	{
		Scanner ricky = new Scanner(System.in);
		int i_ricky, j_ricky;
		int [] jumlah_ricky = new int[10];
				
		
		System.out.print("Masukkan Angka = ");
		i_ricky = ricky.nextInt();
		System.out.println("");
		
		int loop_ricky = i_ricky;
		int n_ricky = 0;
		while(loop_ricky >= 1)
		{
			loop_ricky = loop_ricky / 10;
			n_ricky = n_ricky + 1; 
		}
		
		int[]frekuensi_ricky = new int[n_ricky];
		for(j_ricky = 0; j_ricky < n_ricky; j_ricky++)
		{
			frekuensi_ricky[j_ricky] = i_ricky % 10;
			i_ricky = i_ricky / 10;
		}
		for(j_ricky = 0; j_ricky < n_ricky; j_ricky++)
		{
			if(frekuensi_ricky[j_ricky] == 0)
				jumlah_ricky[0]++;
			else if(frekuensi_ricky[j_ricky] == 1)
				jumlah_ricky[1]++;
			else if(frekuensi_ricky[j_ricky] == 2)
				jumlah_ricky[2]++;
			else if(frekuensi_ricky[j_ricky] == 3)
				jumlah_ricky[3]++;
			else if(frekuensi_ricky[j_ricky] == 4)
				jumlah_ricky[4]++;
			else if(frekuensi_ricky[j_ricky] == 5)
				jumlah_ricky[5]++;
			else if(frekuensi_ricky[j_ricky] == 6)
				jumlah_ricky[6]++;
			else if(frekuensi_ricky[j_ricky] == 7)
				jumlah_ricky[7]++;
			else if(frekuensi_ricky[j_ricky] == 8)
				jumlah_ricky[8]++;
			else if(frekuensi_ricky[j_ricky] == 9)
				jumlah_ricky[9]++;
		}
		for(j_ricky = 0; j_ricky < 10; j_ricky++)
		{
			System.out.println("Frekuesni Angka " + j_ricky + " = " + jumlah_ricky[j_ricky]);
		}
	}
}
