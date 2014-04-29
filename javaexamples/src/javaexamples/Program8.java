package javaexamples;

import java.util.Scanner;

public class Program8 {


	private static Scanner k2;
	public static void main(String s[] )
	{
		boolean primes;
		k2 = new Scanner(System.in);
		System.out.println("enter the first number for range");
		int num1=k2.nextInt();

		System.out.println("enter the second number for range");
		int num2=k2.nextInt();


		int i=0;

		for( i=num1;i<=num2;i++)
		{   primes=true;

		for(int j=2;j<=Math.sqrt(i);j++)
		{


			if(i%j==0)

			{

				primes=false;  

				break;
			}

		}




		if(primes)
		{
			System.out.println(i);


		}

		}
	}

}



