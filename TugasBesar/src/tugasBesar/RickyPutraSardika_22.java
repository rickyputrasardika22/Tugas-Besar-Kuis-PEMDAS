package tugasBesar;
import java.util.Scanner;
public class RickyPutraSardika_22 
{
	public static void main(String[] args) 
	{
		Scanner ricky = new Scanner(System.in);
		int sudutPertama_ricky, sudutKedua_ricky, sudutKetiga_ricky, totalSudut_ricky;
		
		System.out.print("Masukkan Sudut Pertama\t= ");
		sudutPertama_ricky = ricky.nextInt();
		System.out.print("Masukkan Sudut Kedua\t= ");
		sudutKedua_ricky = ricky.nextInt();
		System.out.print("Masukkan Sudut Ketiga\t= ");
		sudutKetiga_ricky = ricky.nextInt();
		
		totalSudut_ricky = sudutPertama_ricky + sudutKedua_ricky + sudutKetiga_ricky;
		
		if (totalSudut_ricky == 180)
		{
			System.out.print("Jumlah Sudut Adalah " + totalSudut_ricky + " Derajat, \nMaka Segitiga Itu Valid");

		}
		else
		{
			System.out.print("Jumlah Sudut Adalah " + totalSudut_ricky + " Derajat, \nMaka Segitiga Itu Tidak Valid");
		}	
		
	}
}
