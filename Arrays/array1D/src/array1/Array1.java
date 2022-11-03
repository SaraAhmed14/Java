
package array1;
import java.util.Scanner;
public class Array1 
{
    public static void main(String[] args) 
    {
      
        Scanner in =new Scanner(System.in);
      //declrate array 
        int [] arr=new int[3];
      // another way
      final int array_size=5;
      int[] num=new int[array_size];  
        //Example (sum and avg salaries)
        System.out.println("enter the size of element you want");
        int size=in.nextInt();
        double[]arrr=new double[size];
        for (int i = 0; i <arr.length ; i++)
        {
            System.out.println("enter your salaries");
            arrr[i]=in.nextDouble();
        }
        double sum=0;
        for (int i = 0; i <arrr.length; i++)
        {
        sum+=arrr[i];    
        }
        System.out.println("the sum of salaries is "+sum);
        System.out.println("the avarege of salaries "+sum/arrr.length);
        //another example
        System.out.println("enter your numbers in array");
         int size1=in.nextInt();
         int[] arr1=new int [size];
         for (int i = 0; i < arr1.length; i++)
         {
             System.out.println("enter your numbers");
             arr[i]=in.nextInt();
         }
         int sum1=0 , count1=0;
         for (int i = 0; i < arr.length; i++) 
         {
             if (arr[i]>0) 
             {
             sum+=arr1[i];
             count1++;
             }
   
        }
         System.out.println("the avarage"+sum1/count1);
         
         //reverse array 
         System.out.println("enter the size of arr");
        int c=in.nextInt();
        int[]arr3=new int[c];
        for (int i = 0; i < arr3.length; i++) 
        {
            System.out.println("enter the element no"+(i+1)); 
            arr3[i]=in.nextInt();
        }
        
        for (int i = arr3.length-1;i>=0;i--) 
        {
            System.out.println(arr3[i]);    
         
        }
      
        
                
        
        
    }
    
}
