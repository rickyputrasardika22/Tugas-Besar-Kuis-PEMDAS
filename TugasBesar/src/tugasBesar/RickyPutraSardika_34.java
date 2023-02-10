package tugasBesar;
import java.util.Scanner;
public class RickyPutraSardika_34 
{
	public static void main(String[] args) 
	{
		Scanner ricky = new Scanner(System.in);
		int jamKerja_ricky, banyakPerulangan_ricky, GajiPokok_ricky = 2500000, upahLembur_ricky = 0, totalGaji_ricky = 0, jamLembur_ricky;
		
		
        System.out.println("================PROGRAM PENGHITUNG GAJI KARYAWAN PER MINGGU================");
		
		System.out.println();
		
		System.out.print("Berapa kali anda ingin menghitung Gaji\t: ");
		banyakPerulangan_ricky = ricky.nextInt();
		System.out.println();
		
		for (int i_ricky = 1; i_ricky <= banyakPerulangan_ricky; i_ricky++) 
		{
			System.out.print("Masukkan Jam Kerja (Jam kerja minimum adalah 40 jam)\t: ");
			jamKerja_ricky = ricky.nextInt();

			if (jamKerja_ricky < 40) 
			{
				System.out.println("JAM KERJA ANDA TIDAK VALID");
				break;
			} 
			else if (jamKerja_ricky == 40) 
			{
				totalGaji_ricky = GajiPokok_ricky;
				upahLembur_ricky = 0;
			}
			else if (jamKerja_ricky > 40 && jamKerja_ricky <= 48 ) 
			{
				jamLembur_ricky = jamKerja_ricky-40;
				upahLembur_ricky = jamLembur_ricky * 25000;
				totalGaji_ricky = GajiPokok_ricky + upahLembur_ricky;
			}
			else if (jamKerja_ricky > 48) 
			{
				jamLembur_ricky = jamKerja_ricky-48;
				upahLembur_ricky = jamLembur_ricky * 50000;
				totalGaji_ricky = GajiPokok_ricky + upahLembur_ricky;
			}		
       
		
		System.out.print("");
		System.out.println("Gaji pokok anda\t\t: "+"Rp"+GajiPokok_ricky);
		System.out.println("Upah lembur anda\t: "+"Rp"+upahLembur_ricky);
		System.out.println("Total gaji anda\t\t: "+"Rp"+totalGaji_ricky);
		System.out.println();
		}
	}
}
