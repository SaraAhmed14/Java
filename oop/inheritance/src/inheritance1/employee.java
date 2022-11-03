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
public class employee extends person
{
double salary;
double rank;
double job;
public employee()
{
    
}

    public employee(double salary, double rank, double job, String n, double ag, String a, String nat) {
        super(n, ag, a, nat);
        this.salary = salary;
        this.rank = rank;
        this.job = job;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getRank() {
        return rank;
    }

    public void setRank(double rank) {
        this.rank = rank;
    }

    public double getJob() {
        return job;
    }

    public void setJob(double job) {
        this.job = job;
    }
    @Override
    public void print_all_details()
{
    super.print_all_details();
    System.out.println("salary"+salary+"rank"+rank+"job"+job);
    
            }
    

}
