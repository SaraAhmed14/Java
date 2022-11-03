
package whileloop;

import java.util.Scanner;
public class Whileloop 
{

    
    public static void main(String[] args) 
    {
        Scanner s=new Scanner (System.in);
      /*  System.out.println("enter 5 grades or enter -1 to exit ");
        int counter=1;
        float grade=0;
        float sum =0;
        
       while(counter<=5&&grade!=-1)
       {
           System.out.println("enter your grade"+counter);
           grade=s.nextInt();
           sum+=grade;
           counter++;
           
       
       }
       System.out.println("the avarage of students"+sum/counter);*/
      
      //flag controlled loop
      //this prog sum the possitive numbers 
      /*double sum=0;
      int value;
      int pos =0;
      boolean nonnagative =true;
      while (nonnagative)
      {
          System.out.println("enter your possitive numbers");
          value=s.nextInt();
          if (value<0)
          {
              nonnagative=false;
          }
          else
          {
             sum+=value;
             pos++;
          }
      }
        System.out.println("the num that is user input"+pos);
        System.out.println("the sum of numebrs "+sum); */
      //this is a game 
      
     /* int guess,rand;
      //to get a random value we need to know a funtiom
      rand =(int)(Math.random()*100);
      //this fun is double so we need to convert it to int and then mul by 100 3shan tb2a rakam sa7e7
      boolean stillplaying=true ; 
      while(stillplaying)
          
      {
          System.out.println("enter your guess number");
          guess=s.nextInt();
          if (guess>rand)
          {
              System.out.println("input smaller guess");
          }
          else if (guess<rand) 
          {
              System.out.println("input larger guess");
          }
          else
          {
              System.out.println("you win");
              stillplaying=false;
          }
                  
   
      }*/
      
   /*  int pass=0;
     int fail=0;
     boolean numbers =true;
     while(numbers)
     {
         System.out.println("enter your degree 0 for fail and 1 for pass");
         int degree=s.nextInt();
         
         if (degree==0)
             
         {
             System.out.println("fail");
             fail++;
         }
         else if (degree==1)
         {
             System.out.println("pass");
             pass++;
         }
         else if (degree!=0||degree!=1)
         {
             System.out.println("please enter only 0 or 1 or nagative numers to exist ");
             degree=s.nextInt(); 
             if (degree==0)
             
         {
             System.out.println("fail");
             fail++;
         }
         else if (degree==1)
         {
             System.out.println("pass");
             pass++;
         }
         else if(degree<0)
         {
             numbers=false;
         }
             
         }
         
             
           
        
             
         
             
         
         
         
         
     }
        System.out.println(" passes"+pass);
        System.out.println(" fails"+fail);*/
   
    
          
           
        
    
      
    }
}
