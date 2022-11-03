
package oopproject;


public class Employee 
{
    int emp_id;
    String ename;
    String depart;
    double salary;
    double bonus;
    boolean resident;
    public Employee()//constructor without any arguments //البروجرامر اللي بيدخل القيم الابتدائيه
    {
       emp_id=100;
     ename="mousa alpii";
    depart="No assigned yet";
     salary=2.5;
    bonus=60;
     resident=true;
    }
    public Employee(int i,String n)
    {
         emp_id=i;
     ename=n;
        
    }
    public Employee(int i,String n,boolean y)
    {
         emp_id=i;
     ename=n;
     resident=y;
        
    }
    
            
    public void print_employee()
    {
        System.out.println(emp_id);
        System.out.println(ename);
        System.out.println(depart);
        System.out.println(salary);
        System.out.println(bonus);
        System.out.println(resident);
    }
    
}
