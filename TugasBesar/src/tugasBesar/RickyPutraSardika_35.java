package tugasBesar;
import java.util.Scanner;
public class RickyPutraSardika_35 
{
	public static void main(String[] args) 
	{
		Scanner ricky = new Scanner(System.in);
		String ulang_ricky = "Ya";
        int angka_ricky = 0, digitAkhir_ricky, sum_ricky = 0;

        while (ulang_ricky.equalsIgnoreCase("ya") || ulang_ricky.equalsIgnoreCase("Ya") || ulang_ricky.equalsIgnoreCase("YA"))
        {
            angka_ricky = 0;
            digitAkhir_ricky = 0;
            sum_ricky = 0;

            System.out.print("Masukkan Angka = ");
            angka_ricky = ricky.nextInt();

            while(angka_ricky > 0)
            {
                digitAkhir_ricky = angka_ricky % 10;
                sum_ricky = sum_ricky + digitAkhir_ricky;
                angka_ricky = angka_ricky / 10;
            }

            System.out.println("Hasil Penjumlahan Semua Digit Adalah " + sum_ricky);

            System.out.println();
            System.out.print("Apakah ingin lanjut? ");
            ulang_ricky = ricky.next();
            System.out.println();

            if (ulang_ricky.equalsIgnoreCase("Tidak") || ulang_ricky.equalsIgnoreCase("tidak"))
            {
                System.out.println("The End");
                break;
            }
            
        }
	}	
}
