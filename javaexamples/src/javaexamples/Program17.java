package javaexamples;

public class Program17 {

  public static void main(String[] args) {
  /*   wap to print following pattern
        * 
       *** 
      ***** 
     ******* 
      ***** 
       *** 
        * 
    
     */

    for(int i=0;i<=3;i++)
    {
    
for(int j=3;j>=i;j--){
        
        System.out.print(" ");

        }
      
      
  for(int j=i;j>=1;j--){
        
    System.out.print("**");
  
  }
      
  System.out.print("*");

      System.out.println(" ");

    }
    
    

    for(int i=1;i<=3;i++)
    {
    

      
for(int j=i;j>=0;j--){
        
        System.out.print(" ");

        }   
  for(int j=i;j<=2;j++){
        
    System.out.print("**");
  
  }
      
  System.out.print("*");

      System.out.println(" ");

    }
}
}
  
