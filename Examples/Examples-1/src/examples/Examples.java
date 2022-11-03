
package examples;

import java.util.Scanner;
public class Examples {

    
    public static void main(String[] args) 
    {
       
        Scanner x=new Scanner(System.in);
         // جدول الضرب
        /*System.out.println("enter your no");
        int no=x.nextInt();
        for (int i = 0; i <=12; i++) 
        {
            System.out.println(no+"*"+(i)+"="+(no*(i)));

        }*/
        //مساحه ومحيط دائره
       /*   System.out.println("enter your radious of the circle");
          float radious=x.nextFloat();
          System.out.println("for Perimeter press 1 , for Area press 2 , for both press 3");
          int y=x.nextInt();
          
          switch(y)
          {
              case 1:
                  double area=3.14*radious*radious;
                  System.out.println("the area of your circle is "+area);
                  break;
              case 2:
                  double Perimeter=2*3.14*radious;
                  System.out.println("the Perimeter of your circle "+Perimeter);
                  break;
              case 3:
                  Perimeter=2*3.14*radious;
                  area=3.14*radious*radious;
                  System.out.println("the Perimeter of your circle "+Perimeter +"\nthe area of your circle is "+area );
                  break;
              default:
                  System.out.println("only zreo or one or 3 ");
                 
          }*/
       //برنامج لحساب تلات مجموع تلت ارقام 
       /* int sum =0;
        int num =0;
        int counter =1;
        while (counter <=3)
        {
            System.out.println("enter the number no"+counter);
            num =x.nextInt();
            sum+=num;
            counter++;
            
        }
        System.out.println("the avarege "+sum/3);*/
       //برنامج لتبديل رقمين 
       /* System.out.println("enter your first no");
        int no1=x.nextInt();
        System.out.println("enter your second no");
        int no2=x.nextInt();
        System.out.println("no1"+"="+no1+" ,no2"+"="+no2);
        int y=no1;
        no1=no2;
        no2=y;
        System.out.println("your numbers after swapping");
         System.out.println("no1"+"="+no1+" ,no2"+"="+no2);*/
        // برنامج لحساب حاجات الجافا
   /* System.out.println("\nJava Version: "+System.getProperty("java.version"));
    System.out.println("Java Runtime Version: "+System.getProperty("java.runtime.version"));
    System.out.println("Java Home: "+System.getProperty("java.home"));
    System.out.println("Java Vendor: "+System.getProperty("java.vendor"));
    System.out.println("Java Vendor URL: "+System.getProperty("java.vendor.url"));
    System.out.println("Java Class Path: "+System.getProperty("java.class.path")+"\n");*/
   // برنامج لحساب السنين والايام والاسابيع من عدد السنسن
       /* System.out.println("enter your minuts");
        int h=x.nextInt();
        int d=h/60/24;
        int years =d/365;
        System.out.println("your minuts have "+years+"years"+" and "+d%365+"days");
        System.out.println("weeks"+d/48);
        System.out.println("days"+d);*/
       //برنامج لحساب اله بسيطه بس معرفتش اعمل عملية اخرى !
     /*   System.out.println("enter only two numbers: ");
        int u=x.nextInt();
        int v=x.nextInt();
        System.out.println("please press 1 to add, 2 to subtract, 3 to mul ,4 to div ,y to other calc");
        char z=x.next().charAt(0); // at zero;
        switch(z)
        {
            case '1':
                System.out.println("the addition of two numbers is "+(u+v));
                break;
            case '2':
                System.out.println("the subtraction of two numbers is "+(u-v));
                break;
            case '3':
                System.out.println("the multiblication of two numbers is "+(u*v));
                break;
            case '4':
                System.out.println("the division  of two numbers is "+(u/v));
                break;
            case'y':
                System.out.println("enter the other calculation");
                char o=x.next().charAt(0);
                System.out.println(u+""+o+""+v+"=");
                break;
            default:
                System.out.println("please enter only");*/
               
           //برنانج لطباعة المتوسط الحسابي لعدد من الارقام ومعرفتة عددهم ومتوسطهم 
          /* int sum =0;
           boolean v=true;
           int count =0;
           System.out.println("enter your numbers and press 0 if you want to exit and print the result");

           while (v)
           {
               int n=x.nextInt();
               if (n!=0)
               {
                   sum+=n;
                   count++;   
               }
               else
               {
                   v=false;
               }
            
               
           }
           System.out.println("you entered "+count+" numbers"+" and the avarage of them is "+sum/count);*/
          
        //   
        /*   double sumo=0;
           double sume=0;
           int counto=0;
           int counte=0;
           int n= -1;
           System.out.println("enter your numbers");
            
           do
           {
               n=x.nextInt();
               if (n%2==0&&n!=0) 
               {
                   sume+=n;
                   counte++;
               }
               else if (n!=0)
               {
                   sumo+=n;
                   counto++;
               }
               
           }
           while(n!=0);
           System.out.println("the numbers of even variables you input "+counte+" and the avarage of them is "+sume/counte);
           System.out.println( "the numbers of odd variables you input "+counto+" and the avarage of them is "+sumo/counto);
           if (sume>sumo)
           {
               System.out.println(" the avarege of even numbers is the biggest");
               
           }
           else if (sume<sumo)
           {
            System.out.println(" the avarege of odd numbers is the biggest");

           }
           else     
           {
             System.out.println(" the avarege of odd numbers is equal of  the avarege of even numbers");

           }*/
        //حساب مجموع الارقام الزوجيه والفرديه 
       /* int sumpos=0;
        int sumnag=0;
        int num=0;
        int count=1;
        
        while(count<=6)
        {
            System.out.println("enter your num"+count);
            num=x.nextInt();
            if(num>0)
            {
                sumpos+=num;
                
            }
            else if(num<0)
            {
                sumnag+=num;
            }
            else
            {
                System.out.println(" zero is a neutral number");
                continue;
            }
            count++;
            
        }
        System.out.println("sum of pos numbers "+sumpos+"sum of nag numbers "+sumnag);*/
        //لحساب مضروب رقم
        /*int fact =1;
        System.out.println("enter your number:");
        int num=x.nextInt();
        for (int i = num; i>=1; i--) 
        {
            fact*=i;
            System.out.print(i+"*");
        }
        System.out.println("="+fact);*/
        //طريقة اخرى    
       /* 
        int fact =1;
        System.out.println("enter your number:");
        int num=x.nextInt();
        for (int i = 1; i <=num; i++) 
        {
            fact*=i;
            System.out.print(i+"*");
            
        }
         System.out.println("="+fact);*/
        //برنامج ال ATM
       // بيشوف اليورزوبيديك  تلات مرات تعيد الباسوورد
     /*   System.out.println("enter your user name");
        String name=x.next();
        int count =1;
        System.out.println("enter your ID");
        int id=x.nextInt(); 
        boolean flag=true;
        while(flag&&count <=3)
        {
        
        if (id==123456)
        {
            System.out.println(" your code is okay");
            flag=false;
            break;
        }
        else
         
        { 
             
            System.out.println("try again");
            id=x.nextInt(); 
            count++; 
            if (count==4) 
            {
                System.out.println("sorry you have to contact your costomer serviece");    
            }
            continue;
                           
        }*/
     /*
     String p="name";
     boolean o=true;
     System.out.println("enter your guessing name");
     while(o)
     {
         
        String R=x.next();
        if (p.equals(R))
        {
            System.out.println("your guessing is true");
            
            o=false;
            break;           
        }
        else
        {
            System.out.println(" enter onother value   ");
            o=true;
            
              
        }
       
     }*/
       /* System.out.println("enter the number of your inputs ");
        int num=x.nextInt();
        int sumo=0;
        int sume=0;
        int nom=0;
       
       
       System.out.println("please enter space after every numebr you input");

        for (int i = 1; i <=num; i++)
        {
            nom=x.nextInt();
            
            if (nom%2==0)
            {
               
                sume+=nom;
                
                
            }
            else
            {
                
                sumo+=nom ;
               

            }
         
        }
        
         System.out.println("the sum of even vales"+sume);
         System.out.println("the sum of odd vales"+sumo);*/
       
       
       int y=x.nextInt();
       int u=x.nextInt();
       String v=(y>u)?"y bigger than u":"u bigger than y";
        System.out.println(v);
                    
        
        
           
           
           
       
        
        

        
        
        
        
    }
    
}
