package javaexamples;

public class Demo {
	
	public static void main(String s[] )
	{
	int num2,count_prime=1,i;
	//clrscr();
	num2 =1; //it will exclude all less then 50
	while(count_prime!=50)
	{
	for(i=2;i<=num2;i++)
	{
	if (num2 % i==0)
	{ break;
	}
	}
	if(num2==i)
	{
	System.out.println(count_prime+"x"+num2);
	count_prime++;
	}
	num2++;
	}
}
}