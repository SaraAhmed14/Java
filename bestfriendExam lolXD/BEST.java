/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ezraaa;
import java.util.Scanner;
public class Ezraaa {

  
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        //برنامج اسراء هانم 
        System.out.println(" who is the favourite person for sara");
        Boolean g=true; 
        while(g)
        {
              String name=s.next();
            if (name.equals("esraa"))
            {
                
                System.out.println("you are right but remember she is the best sister for her too"); 
                
            }
            else 
            {
                System.out.println("Sorry please try again");
                
                continue;
            }
            
        }
    }
    
}
