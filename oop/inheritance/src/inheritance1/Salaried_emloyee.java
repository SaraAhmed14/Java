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
public class Salaried_emloyee extends employee
{
    double bounos;
    double deduction;

    public Salaried_emloyee() 
    {
       
    }

    public Salaried_emloyee(double bounos, double deduction, double salary, double rank, double job, String n, double ag, String a, String nat) {
        super(salary, rank, job, n, ag, a, nat);
        this.bounos = bounos;
        this.deduction = deduction;
    }

    
    @Override
    public double getSalary()
    {
       return salary+ bounos-deduction; 
    }

    public double getBounos() {
        return bounos;
    }

    public void setBounos(double bounos) {
        this.bounos = bounos;
    }

    public double getDeduction() {
        return deduction;
    }

    public void setDeduction(double deduction) {
        this.deduction = deduction;
    }
    
   
    
    
}
