
package javaapplication6;
import java.util.Scanner;


public class JavaApplication6 {

    
    public static void main(String[] args) {
                Scanner c=new Scanner(System.in);
                System.out.println("Enter your alphapet");
                char x=c.next().charAt(0);
                if (x=='a'||x=='e'||x=='o'||x=='i'||x=='u')
                {
                    System.out.print("this alphapet is vowel");
            
                }
                else
                {
                     System.out.print("this alphapet is not vowel");

                }
    }
    
}
