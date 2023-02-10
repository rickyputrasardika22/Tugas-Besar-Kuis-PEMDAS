package tugasBesar;
import java.util.Scanner;
public class RickyPutraSardika_12 
{
	public static void main(String[] args) 
	{
		Scanner ricky = new Scanner(System.in);
        int angka_ricky, cek_ricky = 0;
        
        System.out.print("Masukan Angka = ");
        angka_ricky = ricky.nextInt();
   
        for (int i_ricky = 2; i_ricky <= angka_ricky; i_ricky++)
        {
            if (angka_ricky % i_ricky == 0 )
            {
                cek_ricky++;
            } 
        }
        if (cek_ricky == 1)
        {
            System.out.println(angka_ricky + " adalah Bilangan Prima");
        }
        else 
        {
            System.out.println(angka_ricky + " Bukan Bilangan Prima");
        }  
	}
}
