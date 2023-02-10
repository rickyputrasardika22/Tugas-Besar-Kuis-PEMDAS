package tugasBesar;
import java.util.Scanner;
public class RickyPutraSardika_09 
{
	public static void main(String[] args) 
	{
		int jumlah_ricky = 0;
		
		for (int i_ricky = 1; i_ricky<=6; i_ricky++)
		{
			if(i_ricky < 6)
			{
				System.out.print(i_ricky + " + ");
			}
			else if (i_ricky >= 6)
			{
				System.out.print(i_ricky + " = ");
			}	
			jumlah_ricky = jumlah_ricky + i_ricky;
		}	
		System.out.print(jumlah_ricky);
	}	
}
