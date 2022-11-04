
package arrayinmethod;

import java.util.Scanner;
public class Arrayinmethod 
{

    static Scanner in=new Scanner(System.in); 
    public static void main(String[] args)
    {
        System.out.println("enter the size of your arr"); 
        int x=in.nextInt();
        int []array=new int[x];
        fillarr(array);
        print(array);
        System.out.println("enter the element you want to find");
        int y=in.nextInt();
        search(array,y);
        if (y>=0){
            System.out.println("your num is fined");
        System.out.println("the index of your nom is "+search(array,y));}
        else
            System.out.println("not found");
      
    }
    public static void fillarr(int[]list)
    {
        for (int i = 0; i < list.length; i++)
        {
            System.out.println("enter your elements "+(i+1));
            list[i]=in.nextInt();
            
        }
    }
    public static void print(int[]list)
    {
        for (int i = 0; i < list.length; i++)
        {
            System.out.println(list[i]);    
        }
    }
    public static int search(int[]arr,int target)
    {
        for (int i = 0; i < arr.length; i++) 
           if (arr[i]==target) 
            
           return i;    
            
           return -1;
                
        
    }
    
}
