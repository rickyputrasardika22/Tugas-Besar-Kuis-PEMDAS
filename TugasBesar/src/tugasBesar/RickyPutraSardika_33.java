package tugasBesar;
import java.util.Scanner;
public class RickyPutraSardika_33 
{
	public static void main(String[] args) 
	{
		Scanner ricky = new Scanner(System.in);
		
		System.out.print("Berapa Banyak Anda Ingin Mengulang = ");
		int loop_ricky = ricky.nextInt();
		
		for (int i_ricky = 1; i_ricky <= loop_ricky; i_ricky++) 
		{
			System.out.println();
			System.out.print("Masukkan Angka = ");
			int angka_ricky = ricky.nextInt();
		
			System.out.print("Angka Tersebut Terbalik Menjadi = ");
			
			while (angka_ricky > 0) 
			{
				int k_ricky = angka_ricky % 10;
				angka_ricky = angka_ricky / 10;
				System.out.print(k_ricky);			
			}
		}
	}
}
