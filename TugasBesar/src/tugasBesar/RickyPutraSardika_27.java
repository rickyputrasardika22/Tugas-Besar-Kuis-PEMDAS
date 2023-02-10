package tugasBesar;
import java.util.Scanner;
public class RickyPutraSardika_27 
{
	public static void main(String[] args) 
	{
		Scanner ricky = new Scanner(System.in);
		int tahun_ricky;
		
	    System.out.print("Masukkan tahun : ");
	    tahun_ricky = ricky.nextInt();
	    
	    //Tahun Kabisat merupakan tahun yang habis dibagi 4 dan 400;
	    
	    if (tahun_ricky % 400 == 0) 
	    {
	      System.out.print(tahun_ricky + " Merupakan Tahun Kabisat\n");
	    } 
	    else if (tahun_ricky % 100 == 0) 
	    {
	      System.out.print(tahun_ricky + " Bukan Tahun Kabisat\n");
	    } 
	    else if (tahun_ricky % 4 == 0) 
	    {
	      System.out.print(tahun_ricky + " Merupakan Tahun Kabisat\n");
	    } 
	    else 
	    {
	      System.out.print(tahun_ricky + " Bukan Tahun Kabisat\n");
	    }
	}
}
