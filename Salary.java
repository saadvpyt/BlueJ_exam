
/**
 * Write a description of class Salary here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Salary
{
    // instance variables - replace the example below with your own
    private int x;

    /**
     * Constructor for objects of class Salary
     */
    public Salary()
    {
        // initialise instance variables
        x = 0;
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public int sampleMethod(int y)
    {
        // put your code here
        return x + y;
    }
    
    public void totalSalary(double hourlyWage,double hoursWorked){
        double deductions = 0.3;
        double totalSalary = hourlyWage*hoursWorked;
        double netSalary = totalSalary*deductions;
        System.out.println(netSalary);
    }
}    
    

