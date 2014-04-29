package javaexamples;

public class Program4 {
	static int a=11,b=17;
//	wap to swap numbers without using third variable
public static void main(String[] args) {

	
System.out.println("The numbers before changing were as a:"+a +" and b is:"+b);
b=b+a;
a=b-a;
b=b-a;
System.out.println("The numbers now are as a: "+a+" and b is "+b);
}

}
