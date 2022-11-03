
package forloop;

import java.util.Scanner;
public class Forloop
{

    
    public static void main(String[] args) 
    {
        Scanner s = new Scanner(System.in);
    /*   int sum=0;
       int grade=0;
        for (int i = 1; i <=6 ; i++)
        {
            System.out.println("enter your grade for student no "+i);
            grade=s.nextInt();
            sum+=grade;
        }
        System.out.println("the avarage of grades "+sum/6);*/
    
   // this prgramm calulate the number of factorial numers 
        for (int j = 1; j <=5; j++) 
        {
            int fact =1;
        System.out.println("enter your num");
    int num=s.nextInt();
        if (num<0)
        {
            System.out.println("please enter pos numbers");
            num=s.nextInt();
                for (int i = num; i >1; i--) 
        {
            fact*=i;


        }
          System.out.println("fact of num "+fact);
        }
        else 
        {
            for (int i = num; i >1; i--) 
        {
            fact*=i;


        }
          System.out.println("fact of num "+fact);
        }
       
        }


    }
    
    
}
