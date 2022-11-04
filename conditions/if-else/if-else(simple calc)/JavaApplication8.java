
package javaapplication8;
import java.util.Scanner;

public class JavaApplication8 {

    public static void main(String[] args) {
       
Scanner y=new Scanner(System.in);
        System.out.println("Enter your first num");
        int a=y.nextInt();
        System.out.println("Enter your second num");
        int b=y.nextInt();
        System.out.println("Enter your Char");
        char x=y.next().charAt(0);
        int c;
        if (x=='A')
        {
        c=a+b;
        System.out.print(c);
        
        }
        else if (x=='S')
        {
        c=a-b;
        System.out.print(c);
        
        }
        else if (x=='M')
        {
        c=a*b;
        System.out.print(c);
        
        }
          
    }
    
}
