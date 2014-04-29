package javaexamples;

public class Program5 {

	//wap to find su of given numbers of given number
	public static void main(String[] s)
	{
		int num=98;int rev=0,tev=0;
	
		
		while(num>0)
		{
			rev=num%10;
			num/=10;
		 tev=tev+rev;
		
		}
		System.out.println("sum of given numbers is " +tev);
	}}