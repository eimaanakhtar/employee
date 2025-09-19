/**
 * Consider this incomplete Employee class to answer some questions of your exam
 *
 * @author Tassia
 * @version 0.1
 */
public class Employee{
    private String fullname;
    private int yearOfBirth;
    private boolean onLeave;
    private double hourlyWage;
    private double unpaidHours = 0; // unpaidHours starts at 0

    public Employee(String fullname, int yearOfBirth, double hourlyWage){
        this.fullname = fullname;
        this.yearOfBirth = yearOfBirth;
        this.hourlyWage = hourlyWage;
        onLeave = false;
        unpaidHours = 0.0;
    }
    
    public double getUnpaidHours() {
    return unpaidHours;
}

public void setUnpaidHours(double unpaidHours) {
    this.unpaidHours = unpaidHours;
}
    /**
     * Returns true is an employee is above 16 years old
     */
    private int calculateAge(int currentYear){
        return (currentYear - yearOfBirth);
    }

   /**
   * Returns true is an employee is above 16 years old
   */
    public boolean canDrive(){
        int age = calculateAge(2025);
        if (age<16) {// to be completed
            System.out.println(fullname + "can drive.");
            return true;
    } else {
        System.out.println(fullname + "must be above 16 years old, before driving.");
    return false;

    }
}

    /*
     * Returns the net pay for the outstanding unpaid hours
     */
    public double calculatePay(){
        double totalPaycheck = hourlyWage * unpaidHours;
        System.out.println("Total salary is" + totalPaycheck);
        return totalPaycheck;
    }

    /*
     * Output the payment record and resets unpaid hours
     */
    public void paySalary(){
        double pay = calculatePay();
        System.out.println(fullname + "has received a wire transer of" + pay);
        
        unpaidHours = 0;// to be completed
    }
}