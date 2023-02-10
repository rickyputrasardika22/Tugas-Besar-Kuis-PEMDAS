package tugasBesar;
import java.util.Scanner;
public class RickyPutraSardika_19 
{
	public static void main(String[] args) 
	{
		int r_ricky = 1;

		for (int a_ricky = 5; a_ricky >= 1; a_ricky--) 
		{

		for (int b_ricky = 1 ; b_ricky <= 5 -a_ricky; b_ricky++) 
		{
			System.out.print(" ");
		}

		for (int c_ricky = 1; c_ricky <= 10 -r_ricky; c_ricky++) 
		{
			System.out.print("*");
		}

		System.out.println();

		r_ricky+=2; 
		}
	}
}
