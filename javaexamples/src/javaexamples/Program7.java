package javaexamples;

public class Program7 {


//wap to check whether no is palindrome is or not	
	public static void main(String[] s)
	{
		int num=142;
		int num1=num;
		int back=0;
		while(num>0)
		{
			back=back*10;
			back=back + num%10;
				num=num/10;
			
		}
		if(back==num1)
		{System.out.println("the numbers are palindrome");}
		else{
			
			
			System.out.println("the numbers are not palindrome");
		}
	}}