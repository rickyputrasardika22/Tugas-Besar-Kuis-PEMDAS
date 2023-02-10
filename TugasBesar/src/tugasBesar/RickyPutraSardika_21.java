package tugasBesar;
import java.util.Scanner;
public class RickyPutraSardika_21 
{
	public static void main(String[] args) 	
	{
		Scanner ricky = new Scanner(System.in);
		
		 int nominal_ricky;
		 int pecahanSepuluhRibu_ricky;
		 int pecahanLimaRibu_ricky;
		 int pecahanSeribu_ricky;
		 int pecahanLimaRatus_ricky;
		 int pecahanSeratus_ricky;
		 int pecahanLimaPuluh_ricky;
		 int pecahanDuaLima_ricky;
		 int sisa_ricky;
		 
		
		 System.out.print("Masukkan jumlah uang = Rp.");
		 nominal_ricky = ricky.nextInt();
		 System.out.println();
		 
		 pecahanSepuluhRibu_ricky =  nominal_ricky / 10000;
		 sisa_ricky = nominal_ricky % 10000;
		 
		 pecahanLimaRibu_ricky = sisa_ricky / 5000;
		 sisa_ricky = nominal_ricky % 5000;
		 
		 pecahanSeribu_ricky = sisa_ricky / 1000;
		 sisa_ricky = nominal_ricky % 1000;
		 
		 pecahanLimaRatus_ricky = sisa_ricky / 500;
		 sisa_ricky = nominal_ricky % 500;
		 
		 pecahanSeratus_ricky = sisa_ricky / 100;
		 sisa_ricky= nominal_ricky % 100;
		 
		 pecahanLimaPuluh_ricky = sisa_ricky / 50;
		 sisa_ricky = nominal_ricky % 50;
		 
		 pecahanDuaLima_ricky = sisa_ricky / 25;

				 
		 
		 System.out.println("Output\t: ");
		 System.out.println("10.000 sebanyak "+ pecahanSepuluhRibu_ricky);
		 System.out.println("5.000 sebanyak "+pecahanLimaRibu_ricky);
		 System.out.println("1.000 sebanyak "+ pecahanSeribu_ricky);
		 System.out.println("500 sebanyak "+ pecahanLimaRatus_ricky);
		 System.out.println("100 sebanyak "+pecahanSeratus_ricky);
		 System.out.println("50 sebanyak "+pecahanLimaPuluh_ricky);
		 System.out.println("25 sebanyak "+pecahanDuaLima_ricky);
	}
	
}
