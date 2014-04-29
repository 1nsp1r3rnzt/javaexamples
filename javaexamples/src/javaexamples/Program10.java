package javaexamples;

public class Program10 {

	public static void main(String[] args) {
		// wap to check if no is armstrong
int j=371,sum=0,rev=0;
int num2=j;
while(j>0){
rev=j%10;
sum=sum+rev*rev*rev;
j=j/10;



}
if(num2==sum)
{
	
	System.out.println("the entered number is armstrong "+num2);
}
else{
	System.out.println("the no is not armstrong");
	
}


	}

}
