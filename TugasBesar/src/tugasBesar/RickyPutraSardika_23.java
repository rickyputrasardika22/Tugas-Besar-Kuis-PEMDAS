package tugasBesar;
import java.util.Scanner;
public class RickyPutraSardika_23 
{
	public static void main(String[] args) 
	{
		 char karakter_ricky = 0;
	     String ulang_ricky = "Ya";
	     Scanner input_ricky = new Scanner(System.in);

	        while(ulang_ricky.equalsIgnoreCase("ya") || ulang_ricky.equalsIgnoreCase("Ya") || ulang_ricky.equalsIgnoreCase("YA"))
	        {
	            System.out.print("Masukkan Karakter = ");
	            karakter_ricky = input_ricky.next().charAt(0);
	            boolean alfabet = (karakter_ricky == 'a' || karakter_ricky == 'b' || karakter_ricky == 'c' || karakter_ricky == 'd' || karakter_ricky == 'e' || karakter_ricky == 'f' || karakter_ricky == 'g' || karakter_ricky == 'h' || karakter_ricky == 'i' || karakter_ricky == 'j' || karakter_ricky == 'k' || karakter_ricky == 'l' || karakter_ricky == 'm' || karakter_ricky == 'n' || karakter_ricky == 'o' || karakter_ricky == 'p' || karakter_ricky == 'q' || karakter_ricky == 'r' || karakter_ricky == 's' || karakter_ricky == 't' || karakter_ricky == 'u' || karakter_ricky == 'v' || karakter_ricky == 'w' || karakter_ricky == 'x' || karakter_ricky == 'y' || karakter_ricky == 'z');

	            if (alfabet == true)
	            {
	                System.out.println("Karakter " + karakter_ricky + " adalah alfabet");
	            }
	            else
	            {
	                System.out.println("Karakter " + karakter_ricky + " bukan alfabet");
	            }

	            System.out.print("Apakah ingin lanjut? ");
	            ulang_ricky = input_ricky.next();
	            System.out.println();

	            if (ulang_ricky.equalsIgnoreCase("Tidak") || ulang_ricky.equalsIgnoreCase("tidak"))
	            {
	                break;
	            }
	        }

	    
	
	}
}
