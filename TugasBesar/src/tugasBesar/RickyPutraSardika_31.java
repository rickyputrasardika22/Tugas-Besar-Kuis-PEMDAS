package tugasBesar;
import java.util.Scanner;
public class RickyPutraSardika_31 
{
	public static void main(String[] args) 
	{
		Scanner ricky = new Scanner(System.in);
		int jumlahAngka_ricky;
		
		System.out.print("Masukkan Jumlah Angka = ");
		jumlahAngka_ricky = ricky.nextInt();
		
		int [] angka_ricky = new int [jumlahAngka_ricky];
		
		for(int i_ricky = 0; i_ricky < jumlahAngka_ricky; i_ricky++)
		{
			System.out.print("Angka ke-" + (i_ricky+1) + " = ");
			angka_ricky[i_ricky] = ricky.nextInt();
		}
		
		System.out.print("Bilangan genap dari angka yang diinput adalah " );
		for(int i_ricky = 0; i_ricky < jumlahAngka_ricky; i_ricky++)
		{
			if(angka_ricky[i_ricky] % 2 == 0)
			{
				System.out.print(angka_ricky[i_ricky] + " ");
			}	
		}	
	}
}
