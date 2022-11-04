/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication10;
import java.util.Scanner;
import java.util.Date;

public class JavaApplication10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
      /*  Scanner s=new Scanner(System.in);
        System.out.print("Enter your age");
        int x=s.nextInt();
         System.out.print("Enter your name");
        String z=s.nextLine();
      Date dt=new Date();
      System.out.println(dt);
java.text.SimpleDateFormat d=new java.text.SimpleDateFormat("dd/MM/yyy hh:mm:ss a");
      System.out.println(d.format(dt));
        int x=5;
        int b=(x>=5) ?10:2;
              System.out.println(b);
        Scanner x=new Scanner(System.in);
                    System.out.print("enter your alphapet ");
        char z=x.next().charAt(0);
        switch(z)
    {
        case'o':
            System.out.print("This alphapet is vowel");
            break;
             case'e':
            System.out.print("This alphapet is vowel");
            break; 
             case'i':
            System.out.print("This alphapet is vowel");
            break;
             case'u':
            System.out.print("This alphapet is vowel");
            break;
             case'a':
            System.out.print("This alphapet is vowel");
            break;
             default:
            System.out.print("This alphapet is consenent");
            break;*/
         int pass=0;
            int fail=0;
        for (int i=0;i<15;i++)
        {
           
         System.out.println("please enter 0 if the student pass or 1 if he failed");
         Scanner z =new Scanner(System.in);
         int x=z.nextInt();
         if(x==1)
         {
             pass++;

        }
         else if (x==0)
         {
             fail++;
         }
         else 
         {
             while(x!=0||x!=1)
                     {
                         System.out.println("please enter 0 or 1");
                         int y=z.nextInt();
                     }
          
           
         }
         if (pass>12)
         {
                        System.out.println("good job");
  
         }
        
           
    }
         
         

        

        
    }
    
}
