package javaexamples;

public class Program6 {

	//wap to find reverse of given number
	public static void main(String[] s)
	{
		int num=231114;int rev=0;
		while(num>0)
		{
			rev=num%10;
			num/=10;
			System.out.print(rev);
		}
	}}