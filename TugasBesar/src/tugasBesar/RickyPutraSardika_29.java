package tugasBesar;
import java.util.Scanner;
public class RickyPutraSardika_29 
{
	public static void main(String[] args) 
	{
		Scanner ricky = new Scanner(System.in);
		int bilanganBulat_ricky;
		
		System.out.print("Masukkan Bilangan Bulat = ");
		bilanganBulat_ricky = ricky.nextInt();
		
		System.out.println("--------------------------------------------");
		
		if(bilanganBulat_ricky % 5 == 0 && bilanganBulat_ricky % 5 == 0)
		{
			System.out.print(bilanganBulat_ricky + " Merupakan Kelipatan dari 5 dan 7");
		}
		else
		{
			System.out.print(bilanganBulat_ricky + " Bukan Merupakan Kelipatan dari 5 dan 7");
		}	
	}
}
