/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myfirstoopproject;

/**
 *
 * @author Start
 */
public class rectangle 
{
    private double lenght;
  //  public double widght;
    private double widght;
     public void setlenght( double l)
     {
         lenght=l;
         
     }
     public void setwidght(double w)
     {
        widght=w; 
     }
     public double getlenght()
     {
         return lenght;
     }
     public double getwidght()
     {
         
         return widght;
     }
     public double getarea()
     {
         return lenght*widght;
     }

    
}
