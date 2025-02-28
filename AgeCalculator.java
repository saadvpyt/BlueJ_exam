
/**
 * Write a description of class AgeCalculator here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class AgeCalculator
{
    // instance variables - replace the example below with your own
    private int x;
    private int currentYear = 2025;
    /**
     * Constructor for objects of class AgeCalculator
     */
    public AgeCalculator()
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
    //q.15
    public void canDrive(int year){
    int age = this.currentYear - year;
    if(age>=16)
        System.out.println("eligible for license");
    else 
        System.out.println("not eligible for license");
    }
    }

