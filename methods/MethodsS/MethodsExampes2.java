
package methodss;
import java.util.Scanner;

public class MethodsS 
{

    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
       /* System.out.println("please enter the name and password");
        String u=s.next();
        int y=s.nextInt();
        print();
        inf(u,y); */
      /*  System.out.println("enter your first num ");
        int y =s.nextInt();
        System.out.println("enter your sec num");
        int u=s.nextInt();
        System.out.println("press\"M\"to mul\"A\"to add\"S\"to sum");
        char e=s.next().charAt(0);
        if (e=='M')
        {
            System.out.println("THE MUL OF TWO NUMBERS "+mul(y,u));    
        }
        else if(e=='A')
        {
            System.out.println("THE SUM OF TWO NUMBERS "+sum(y,u));    
        
        }
        else if (e=='S') 
        {
            System.out.println("THE SUB OF TWO NUMBERS "+sub(y,u));    

        }
        else    
        {
            System.out.println("please enter the only char");
        }*/
        System.out.println("please enter the first num and the latest");
        int f=s.nextInt();
        int f2=s.nextInt();
        System.out.println("the sum f even numbers "+even(f,f2));
        System.out.println("the sum f odd numbers "+odd(f,f2));

    }
  /*  public static void print ()
    {
        System.out.println("Hello world");
    }
    public static void inf(String n,int a)
    {
        System.out.println("the name of user is "+n);
        System.out.println("the age of user is "+a);
    }*/
  /*  public static int sum (int a, int b)
    {
        return a+b;
    }
    public static int sub (int a, int b)
    {
        return a-b;
    }
    public static int mul (int a,int b)
    {
        return a*b;
    }*/
    public static double even(int c,int v )
    {
       double s=0;
        for (int i = c; i <= v; i++) 
        {
            if (i%2==0) 
            
            s=s+i; 
        }
        return s;
    }
     public static double odd(int c,int v )
    {
        double s=0;
        for (int i = c; i <= v; i++) 
        {
            if (i%2!=0) 
            {
                s=s+i; 
            }
 
        }
        return s;
    }
    
 
    
    
}
