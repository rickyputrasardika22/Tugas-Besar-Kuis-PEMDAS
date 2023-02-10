package tugasBesar;
import java.util.Scanner;
public class RickyPutraSardika_02 
{
	public static void main(String[] args) 
	{
		Scanner ricky = new Scanner(System.in);

		long angka_ricky, angka_ricky1;
		long jumlahDigit_ricky = 0;
		
		System.out.print("Masukkan Angka = ");
		angka_ricky = ricky.nextLong();
		angka_ricky1 = angka_ricky;
		
		while (angka_ricky > 0)
		{
			angka_ricky = angka_ricky / 10; 
			jumlahDigit_ricky++;
		}
	
		System.out.print("Banyaknya digit pada Angka " + angka_ricky1 + " adalah " + jumlahDigit_ricky);
		
	}	
}

