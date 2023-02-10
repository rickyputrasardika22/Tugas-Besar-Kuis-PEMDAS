package tugasBesar;
import java.util.Scanner;
public class RickyPutraSardika_32 
{
	public static void main(String[] args) 
	{
		Scanner ricky = new Scanner(System.in);
		int tagihanMinimum_ricky = 200000;
		int transaksiTambahan_ricky;
		int totalTagihan_ricky = 0, banyakTagihan_ricky;
		
		System.out.println("================Program Penghitung Tagihan Bulanan================");
		
		System.out.println();
		
		System.out.print("Berapa kali anda ingin mengecek tagihan\t: ");
		banyakTagihan_ricky = ricky.nextInt();
		
		for (int i_ricky = 1; i_ricky <= banyakTagihan_ricky; i_ricky++) {
		
		System.out.println();
		
		System.out.print("Masukkan Banyak Transaksi Telepon Dalam 1 Bulan\t: ");
		int banyakTransaksi_ricky = ricky.nextInt(); 
		
		if (banyakTransaksi_ricky <= 100) 
		{
			totalTagihan_ricky = tagihanMinimum_ricky;
		}
		
		else if (banyakTransaksi_ricky > 100 && banyakTransaksi_ricky <= 150) 
		{
			transaksiTambahan_ricky = banyakTransaksi_ricky - 100;
			totalTagihan_ricky = tagihanMinimum_ricky + (transaksiTambahan_ricky * 1000);
			
							
			}
			
		else   {
			
			transaksiTambahan_ricky = banyakTransaksi_ricky - 150;
			totalTagihan_ricky = tagihanMinimum_ricky + (transaksiTambahan_ricky * 850)+ (50 * 1000);
			
		}
		
		System.out.print("Tagihan yang harus anda bayar sebesar \t: " + "Rp" + totalTagihan_ricky);
		System.out.println();
			
		}
	}
}
