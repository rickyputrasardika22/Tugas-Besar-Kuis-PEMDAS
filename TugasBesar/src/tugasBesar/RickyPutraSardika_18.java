package tugasBesar;
import java.util.Scanner;
public class RickyPutraSardika_18 
{
	public static void main(String[] args) 
	{
		
		int a_ricky = 5;
		for (int b_ricky = 1; b_ricky <= a_ricky; b_ricky++)
		{
			
			for (int c_ricky = 4; c_ricky >= b_ricky; c_ricky--)
		    {
				System.out.print(" ");
		    }
		    for (int d_ricky = 1; d_ricky <= b_ricky; d_ricky++)
		    {
		        System.out.print("*");
		    }
		    
		    System.out.println();
		}
		
	}
}
