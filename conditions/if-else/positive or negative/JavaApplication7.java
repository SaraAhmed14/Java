
package javaapplication7;
import java.util.Scanner;

public class JavaApplication7 {

   
    public static void main(String[] args) {
         Scanner y=new Scanner(System.in);
         System.out.println("Enter your num");
        int a=y.nextInt();
        if (a>0) 
        {
         System.out.print("this num is possetive");
        }
        else  
        {
         System.out.print("this num is  negative");
 
        }
        if (a%2==0) 
        {
                     System.out.print(" and even");

        }
        else
        {
                     System.out.print(" and negative");

        }
        
    }
    
}
