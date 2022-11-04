
package methods.examples;
import java.util.Scanner;
public class MethodsExamples
{

   
    public static void main(String[] args) 
    {
        Scanner u =new Scanner (System.in);
      /*  System.out.println("enter your numbers");
        int n1=u.nextInt();
        int n2=u.nextInt();
        int n3=u.nextInt();
        int z=find(n1,n2,n3);
        print(z);
        System.out.println(" the smallest num by anoter way"+thesmall(n1,n2,n3));
        System.out.println("enter the word");
        String n=u.next();
        System.out.println("the number of vowels is "+vowel(n));*/
      
    }
    public static int find(int x,int y,int z)
    {
        if (x<y&&x<z) return x;
        else if (y<x&&y<z) return y;
        else return z;   
    }
    public static void print (int x)
    {
        System.out.println("the smallest num is "+x);
    }
    public static double thesmall(int x,int y,int z)
    {
        return Math.min(Math.min(x, y), z);
    }
    public static int vowel (String str)
    {
        int count =0;
        for (int i = 0; i < str.length(); i++)
        {
            if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i'|| str.charAt(i) == 'o' || str.charAt(i) == 'u')
                    {
                        count++;
                    }
    
        }
        return count;
    }
    
}
