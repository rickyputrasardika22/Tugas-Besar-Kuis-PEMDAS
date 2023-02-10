package tugasBesar;
import java.util.Scanner;
public class RickyPutraSardika_37 
{
	public static void main(String[] args) 
	{
		Scanner ricky = new Scanner(System.in);
		int [] angka_ricky = new int [4];
		int k_ricky = 0;
		
		for (int i_ricky = 0; i_ricky < 4; i_ricky++) 
		{
			System.out.print("Masukkan Data ke-" + (i_ricky+1) + " : ");
			angka_ricky[i_ricky] = ricky.nextInt(); 
		}
	
		for (int i_ricky = 0; i_ricky < 4; i_ricky++) 
		{
			if (angka_ricky[i_ricky] < 0) 
			{
				k_ricky = k_ricky + 1;
			}
		}
		
		System.out.println();
		System.out.println("Output\t: ");
		System.out.println("Jumlah bilangan negatif adalah "+k_ricky);
	}
}
