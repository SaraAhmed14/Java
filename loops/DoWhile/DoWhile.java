package dowhile;

import java.util.Scanner;

public class DoWhile
{

    public static void main(String[] args) 
    {
        Scanner s= new Scanner(System.in);
        int counter =1;
        int grade=0;
        int sum=0;
        do
        {
            System.out.println("enter your grade"+counter);
             grade=s.nextInt();
             sum+=grade;
             counter++;
            
        }
        while(counter<=6);
        System.out.println("the avarage"+sum/6);
                
        
        

    }

}
