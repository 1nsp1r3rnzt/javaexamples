package javaexamples;

public class Program20 {

	public static void main(String[] args) {
		// wap to take input from user and display the pattern according to value 
		/*


	             2   **
	             3   ***
	             9   *********
	             1   *
		 */
                   
		int[] arInt=new int[]{2,7,9,11};
		for (int j = 0; j < arInt.length; j++) {
			
			int i=arInt[j];
			
			for(int l=1;l<=i;l++)
			{			
				System.out.print("*");
				
			}
		System.out.println("");
		}
		
		
	
	
	}

}
