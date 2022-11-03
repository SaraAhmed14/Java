
package method1;
import java.util.Scanner;

public class Method1 
{


    public static void main(String[] args) 
    {
        Scanner s=new Scanner(System.in);
        /*System.out.println("hello");
        draw(10,'*');
        System.out.println("hello");
        draw(10,'*');
        System.out.println(sum(5,9));*/
        System.out.println("enter your inputs");
            int n1=s.nextInt();
            int n2=s.nextInt();
            int n3=s.nextInt();
            int total =sum2(n1,n2,n3);
            double avg=average(n1,n2,n3);
            display (avg,total);
            
          //note
          //invoking=calling
          //signature 1- اسم الفانكشن 
          //2- البراميتير
            

    }
    public static void draw(int lenght,char y)
    {
        for (int i = 0; i < lenght; i++) 
        {
            System.out.print(y); 
        }
        System.out.println();
    }
    public static int sum (int x,int y)
    {
        int result=0;
        result=x+y;
        return result;
        
    }
    public static int sum2 (int x,int y,int z)
    {
        return x+y+z;
    }
    public static  double average(int o,int p, int q)
    {
        return sum2(o,p,q)/3;
    }
    public static void display (double i, int v)
    {
        System.out.println("the avarege is"+i);
        System.out.println("the sum is"+v);
    }
            
    
    
}
