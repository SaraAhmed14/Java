
package inheritance1;


public class student extends person 
{
int study_level;
String specialization;
double gpa;

    public student() 
    {
    }



    public student(int study_level, String specialization, double gpa, String n, double ag, String a, String nat) {
        super(n, ag, a, nat);
        this.study_level = study_level;
        this.specialization = specialization;
        this.gpa = gpa;
    }

    student(int i, String jnjk, double d) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void setStudy_level(int study_level) {
        this.study_level = study_level;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public int getStudy_level() {
        return study_level;
    }

    public String getSpecialization() {
        return specialization;
    }

    public double getGpa() {
        return gpa;
    }
     
    

 

}
