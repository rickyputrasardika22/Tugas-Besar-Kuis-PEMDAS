package tugasBesar;
import java.util.Scanner;
public class RickyPutraSardika_14 
{
	public static void main(String[] args) 
	{
        int baris_ricky = 5, kolom_ricky = 5, i_ricky, j_ricky;

        for (i_ricky = 1; i_ricky <= baris_ricky; i_ricky++)
        {
            for (j_ricky = i_ricky; j_ricky <= kolom_ricky; j_ricky++)
            {
                System.out.print(j_ricky + " ");
            }

            for (j_ricky = (i_ricky-1); j_ricky >= 1; j_ricky--)
            {
                System.out.print(j_ricky + " ");
            }
            System.out.println();
        }
    }
}
