package javaexamples;

import java.util.Scanner;

public class Program3{

	private static Scanner ky;

	public static void main(String[] args) {
		// wap to find square root of number
		
		
		ky = new Scanner(System.in);
		System.out.println("enter the number");
		double k=ky.nextDouble();
	
		System.out.println("the square root is" +Math.sqrt(k));
	}

}
