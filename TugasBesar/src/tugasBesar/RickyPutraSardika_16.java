package tugasBesar;
import java.util.Scanner;
public class RickyPutraSardika_16 
{
	public static void main(String[] args) 
	{
		for(int i_ricky = 1; i_ricky<=5; i_ricky++)
		{
			for(int j_ricky = 1; j_ricky<=5; j_ricky++)
			{				
				if (i_ricky == 1 || i_ricky == 5)
				{
					if(j_ricky == 1 || j_ricky == 5)
					{
						System.out.print("0");
					}
					else
					{
						System.out.print("1");
					}	
				}
				else if (i_ricky > 1 && i_ricky <5)
				{
					if(j_ricky == 1 || j_ricky == 5)
					{
						System.out.print("1");
					}	
					else
					{
						System.out.print("0");
					}	
				}	
			}
			System.out.println("");
		}	
	    
	    
	    
	}
}
