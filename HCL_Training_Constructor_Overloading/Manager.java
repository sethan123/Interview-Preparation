package HCL_Training_Constructor_Overloading;



class Manager extends Employee {
    private double baseSalary;
    
    public Manager(String name, double baseSalary) {
        super(name);
        this.baseSalary = baseSalary;
    }

@Override
public double calculateSalary() {
    // Additional logic specific to managers
    double bonus = 0.1 * baseSalary; // Assume 10% bonus
    return baseSalary + bonus;
}
}
