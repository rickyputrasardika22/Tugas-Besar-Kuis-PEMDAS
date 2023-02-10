package tugasBesar;
import java.util.Scanner;
public class RickyPutraSardika_20 
{
	public static void main(String[] args) 
	{
		for (int i_ricky = 0; i_ricky< 9; i_ricky++) 
		{
			for (int j_ricky = 0; j_ricky < 9; j_ricky++) 
			{
				if(i_ricky == j_ricky || i_ricky + j_ricky == 9 - 1)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			} 
		System.out.println("");
		}
	}
}
