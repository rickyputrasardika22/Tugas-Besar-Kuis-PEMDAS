package tugasBesar;
import java.util.Scanner;
public class RickyPutraSardika_01 
{
	public static void main(String[] args) 
	{
		Scanner ricky = new Scanner(System.in);
		int angka_ricky;
		int i_ricky;
		
		System.out.print("Masukkan Angka = " );
		angka_ricky = ricky.nextInt();
		
		for(i_ricky = 11; i_ricky > 0; i_ricky = i_ricky-- )
		{
			System.out.println(angka_ricky + " * " + --i_ricky + " \t= " + (angka_ricky * i_ricky));
		}	
	}
}
