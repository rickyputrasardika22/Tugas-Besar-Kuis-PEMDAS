package tugasBesar;
import java.util.Scanner;
public class RickyPutraSardika_11 
{
	public static void main(String[] args) 
	{
		Scanner ricky = new Scanner(System.in);
	    int angka_ricky;
	    
	    System.out.print("Masukkan Angka = " );
	    angka_ricky = ricky.nextInt();
	    
	    System.out.print("Faktor dari " + angka_ricky + " adalah : ");
	    for(int i_ricky = 1; i_ricky <= angka_ricky; i_ricky++)
	    {
	       if(angka_ricky % i_ricky == 0)
	       {
	          System.out.print(i_ricky + " ");
	       }
	    }
	}
}
