package javaexamples;

import java.util.Scanner;

public class Program9 {

	
	private static Scanner key;

	//wap to print even number in given range
	
	public static void main(String s[] ) 
	
	{
		
		key = new Scanner(System.in);
		System.out.println("enter the first number");
		int num1=key.nextInt();
		System.out.println("enter the second number");

		int num2=key.nextInt();
		int count=1;
		if(num2-num1>=100)
			while(count!=100)
			{
		
			for(int i=num1;i<=num2;i++)
			{
			if(i%2==0)
			
				
				System.out.println(i); 
			if(count!=100)
			{	
			count++;
			
			
			}
			else {break;}
			}
	
			break;
			
			}
		


	
		else
		{		System.out.println("the range is very small:remember the range should have atleast 50 even number");
}
	}
}
