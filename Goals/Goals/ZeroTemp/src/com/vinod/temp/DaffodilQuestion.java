package com.vinod.temp;
import java.util.Scanner;
public class DaffodilQuestion {

	public static void main(String args[])
	{
		System.out.println("*************");
		Scanner in = new Scanner(System.in);

		int n = in.nextInt();

		for (int i = 1; i <= n; i++)
		{
			if (i <= n / 2)
			{
				for (int k = 1; k < i; k++)
				{
					System.out.print(" ");
				}
			}
			else
			{
				for (int k = 1; k <= (n - i); k++)
				{
					System.out.print(" ");
				}
			}
			for (int j = 1; j <= n; j++)
			{
				System.out.print("*");
			}
			System.out.println("\n");
		}
	}
}