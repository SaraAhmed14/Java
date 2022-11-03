
package methods;

import java.util.Scanner;
public class Methods 
{

   
    public static void main(String[] args) 
    {   
        Scanner s=new Scanner(System.in);
        System.out.println("enter your first num");
        int x=s.nextInt();
        System.out.println("enter your second num");
        int y=s.nextInt();
        System.out.println("enter your char");
        char u=s.next().charAt(0);
        if (u=='A') 
        {
            System.out.println("the sum of two numbers is"+sum(x,y));    
        }
        else if (u=='s')
        {
            System.out.println("the subtraction of two numbers is "+sub(x,y));  
        }
        else if (u=='M')
        {
            System.out.println("the multiplication of two numbers is "+mul(x,y));    
        }
        else 
        {
            System.out.println("sorry ");
        }

        
    }
    public static int sum(int x, int y)
    {
        return x+y;
    }
    public static int sub(int x, int y)
    {
        return x-y;
    }
    public static int mul (int x,int y)
    {
        return x*y;
    }
   
    
    
}
