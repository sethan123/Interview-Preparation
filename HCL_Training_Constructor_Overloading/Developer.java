package HCL_Training_Constructor_Overloading;


public class Developer extends Employee {
	private double hourlyRate;
    private int hoursWorked;
    
    public Developer(String name, double hourlyRate, int hoursWorked) {
        super(name);
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }
    
    @Override
    public double calculateSalary() {
        return hourlyRate * hoursWorked;
    }
}