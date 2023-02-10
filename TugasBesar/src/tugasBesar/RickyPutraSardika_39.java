package tugasBesar;
import java.util.Scanner;
public class RickyPutraSardika_39 
{
	public static void main(String[] args) 
	{
		Scanner ricky = new Scanner(System.in);
		
		int [] angka_ricky = new int [4];
		int jumlahBilangan_ricky = 0 ;
	
		
		for (int i_ricky = 0; i_ricky < 4; i_ricky++) 
		{
			System.out.print("Masukkan Data ke-" + (i_ricky+1) + " : ");
			angka_ricky[i_ricky] = ricky.nextInt();
		}
	
		for (int i_ricky = 0; i_ricky < 4; i_ricky++) 
		{
			if (angka_ricky[i_ricky] % 3 == 0) 
			{
				 jumlahBilangan_ricky = jumlahBilangan_ricky + 1;
			}
		}
		
		System.out.println();
		System.out.println("Output\t: ");
		System.out.println("Jumlah bilangan kelipatan 3 adalah "+jumlahBilangan_ricky);
	}
}
