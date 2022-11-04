/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inheritance1;

/**
 *
 * @author Start
 */
public class person
{

String name;
double age;
String Address;
String nationality;
public person()
{
    
}
public person (String n,double ag,String a,String nat)
{
     name=n;
     age=ag;
     Address=a;
     nationality=nat;
}
public void setname(String n)
{
    name=n;
}
public void setage(int n)
{
    age=n;
}public void setAdrss(String n)
{
    Address=n;
}public void setnationality(String n)
{
    nationality=n;
}
public String getname()
{
    return name;
}
public double getage()
{
    return age;
}
public String getAdrss()
{
    return Address;
} 
public  String getnationality(String n)
{
    return nationality;
}
public void print_all_details()
{
    System.out.println("name " +name+"age " +age+" Address " +Address+"nationality"+nationality);
}
}
