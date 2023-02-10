package tugasBesar;
import java.util.Scanner;
public class RickyPutraSardika_25 
{
	public static void main(String[] args) 
	{
		Scanner ricky = new Scanner(System.in);
		char karakter_ricky = 0;
	    String ulang_ricky = "Ya";

	        while(ulang_ricky.equalsIgnoreCase("ya") || ulang_ricky.equalsIgnoreCase("Ya") || ulang_ricky.equalsIgnoreCase("YA"))
	        {
	            System.out.print("Masukkan Karakter = ");
	            karakter_ricky = ricky.next().charAt(0);
	            boolean angka_ricky = (karakter_ricky == '0' || karakter_ricky == '1' || karakter_ricky == '2' || karakter_ricky == '3' || karakter_ricky == '4' || karakter_ricky == '5' || karakter_ricky == '6' || karakter_ricky == '7' || karakter_ricky == '8' || karakter_ricky == '9');

	            if (angka_ricky == true)
	            {
	                System.out.println("Karakter " + karakter_ricky + " adalah Angka");
	            }

	            else
	            {
	                System.out.println("Karakter " + karakter_ricky + " bukan merupakan Angka");
	            }

	            System.out.println();
	            System.out.print("Apakah ingin lanjut? ");
	            ulang_ricky = ricky.next();

	            if (ulang_ricky.equalsIgnoreCase("Tidak") || ulang_ricky.equalsIgnoreCase("tidak"))
	            {
	                break;
	            }
	        }
	}
}
