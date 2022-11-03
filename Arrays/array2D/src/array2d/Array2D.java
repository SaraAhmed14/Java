
package array2d;

import java.util.Scanner;
public class Array2D
{

   
    public static void main(String[] args) 
    {
     Scanner s=new Scanner(System.in);
     int[][]arr1=new int[3][4];
     //to know the noumber of coloums
        System.out.println("the noumbers of coloms"+arr1[0].length);
      //to know the noumber of rows
        System.out.println("the noumber of rows"+arr1.length);
        //to take the input from user
        for (int row = 0; row < arr1.length; row++)
        {
            for (int col = 0; col< arr1[0].length; col++)
            {
                System.out.println("enter the data from the row nom "+(row)+"and the data from the col nom "+(col));
                arr1[row][col]=s.nextInt();
                
            }
    
        }
        //to print array
         for (int row = 0; row < arr1.length; row++)
        {
            for (int col = 0; col< arr1[0].length; col++)
            {
                
                System.out.print( arr1[row][col]+" " );                
            }
            System.out.println();
    
        }
         //Example how to know even and odd num 
        System.out.println("enter the size of array");
        int n=s.nextInt();
        int []arr=new int[n];
        for (int i = 0; i <arr.length; i++)
        {
            System.out.println("fill the element of index no"+(i)); 
            arr[i]=s.nextInt();
            
        }
        int sume=0;
        int sumo=0;
        int counte=0;
        int counto=0;
        for (int i = 0; i < arr.length; i++) 
        {
            if (arr[i]%2==0&&arr[i]!=0) 
            {
             
               sume+=arr[i];
               counte++;
               
               
            }
            else if (arr[i]%2!=0&&arr[i]!=0) 
            {
             
               System.out.println(arr[i]); 
               sumo+=arr[i];
               counto++;
               
            }
            
  
        }
        System.out.println(" the sum of even numbers "+sume+"the numbers of even numbers "+counte);
        System.out.println(" the sum of odd numbers "+sumo+"the numbers of odd numbers "+counto);
         
         
        
        
    }
    
}
