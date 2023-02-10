package tugasBesar;
import java.util.Scanner;
public class RickyPutraSardika_03 
{
	public static void main(String[] args) 
	{
		Scanner ricky = new Scanner(System.in);
		
		int angka_ricky;
		int digitPertama_ricky;
		int digitTerakhir_ricky;;
		
		System.out.print("Masukkan Angka = ");
		angka_ricky = ricky.nextInt();
		
		//digit terakhir gunakan %10
		digitTerakhir_ricky = angka_ricky%10;
		
		digitPertama_ricky = angka_ricky;
		while(digitPertama_ricky>=10)
		{
			digitPertama_ricky = digitPertama_ricky/10;
		}	
		
		System.out.println("Digit Pertama pada Angka " + angka_ricky + " adalah " + digitPertama_ricky);
		System.out.println("Digit Terakhir pada Angka " + angka_ricky + " adalah " + digitTerakhir_ricky);
	}
}
