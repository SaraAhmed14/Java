
package array3s;
import java.util.Scanner;
public class Array3s {

    
    public static void main(String[] args)
    {
        Scanner in =new Scanner (System.in);
        boolean f=true;
        int r=0;
        int c=0;
        int[][]arr;
        while(f)
        {
        System.out.println("enter the number of rows");
        r=in.nextInt();
        System.out.println("enter the number of cols");
        c=in.nextInt();
        if(r!=c)
        {
            System.out.println("the col must equal the rows");
            continue;
        }
        else
        {   

             f=false;
        }
       
        }
      arr=new int[r][c];


        System.out.println("enter the elements of array");

        for (int i = 0; i <arr.length ; i++)
        {
            for (int j = 0; j < arr[0].length; j++) 
            {

             arr[i][j]=in.nextInt();
            }
    
        }
          for (int i = 0; i < arr.length; i++)
        {
            for (int j = 0; j < arr[0].length; j++) 
            {
             System.out.print( arr[i][j]+" " ); 
            }
            System.out.println( );
    
        }
        int sum=0;
         for (int i = 0; i <arr.length ; i++)
        {
            for (int j = 0; j < arr[0].length; j++) 
            {

             sum+=arr[i][j];
            }
    
        }
         System.out.println("the sum of all matrix is equal "+sum);
         
         System.out.println("***************************");
         int sumo=0;
         for (int i = 0; i <arr.length ; i++)
        {
            System.out.println("the sum of row no"+(i+1));
            for (int j = 0; j < arr[0].length; j++) 
            {

             sumo+=arr[i][j];
                
             System.out.print(arr[i][j]);
                if (j<arr[0].length-1) 
                {
                    System.out.print("+");
                }
            }
            System.out.println("="+sumo);
            sumo=0;
    
        }
         
         System.out.println("***************************");         
         int sume=0;
         for (int i = 0; i <arr[0].length ; i++)
        {
            System.out.println("the sum of col no"+(i+1));
            for (int j = 0; j < arr.length; j++) 
            {

             sume+=arr[j][i];
             
             System.out.print(arr[j][i]);
              if (j<arr[0].length-1) 
                {
                    System.out.print("+");
                }
            }
            System.out.println("="+sume);
            sume=0;
    
        }
       System.out.println("*****************************");
        System.out.println("the sum od diagonal matrix");
       int sumd=0;
         for (int i = 0; i <arr[0].length ; i++)
        {
           
            for (int j = 0; j < arr.length; j++) 
            {

                if (i==j)
                {
                    sumd+=arr[i][j];    
                    System.out.print(arr[i][j]);
                    if (i<arr[0].length-1) 
                    {
                    System.out.print("+");    
                    }
                }
            }

    }
         System.out.println("="+sumd);
    
}
}
