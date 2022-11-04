/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaaace;

/**
 *
 * @author Start
 */
public class CD implements RetailItem,print
{
    double price;
    String title;
    String address;
    public CD(){}

    public CD(double price, String title, String address) {
        this.price = price;
        this.title = title;
        this.address = address;
    }
    public double getitemprice()
    {
        return price;
    }
    public void display()
    {
        System.out.println("price"+price+title+"title");
    }

   
    
}
