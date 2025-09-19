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
    private double unpaidHours; setter = 0;
                                getter = calculatePay();

    public Employee(String fullname, int yearOfBirth, double hourlyWage){
        this.fullname = fullname;
        this.yearOfBirth = yearOfBirth;
        this.hourlyWage = hourlyWage;
        onLeave = false;
        unpaidHours = 0.0;
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
            System.out.println(Employee + "can drive.");
    } else {System.out.println(Employee + "must be above 16 years old, before driving.");
    }
}
public canDrive() {
    return Employee + "age:" + age;
}

    /*
     * Returns the net pay for the outstanding unpaid hours
     */
    private double calculatePay(){
        tax = 30;
        hourlyWage = 10;
        paySalary = 100;
        (paySalary - tax = totalPaycheck); // to be completed
        System.out.println("Total salary is" + totalPaycheck);
    }

    /*
     * Output the payment record and resets unpaid hours
     */
    public void paySalary(){
        this.fullname = John Deere;
        this.hourlywage = 0;
        calculatePay = 70;
        System.out.println(fullname + "has received a wire transer of" + calculatePay);
        
        unpaidHours = 0;// to be completed
    }
}