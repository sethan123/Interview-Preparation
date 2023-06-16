package HCL_Training_Constructor_Overloading;

public class main {

	 public static void main(String[] args) {
	        Manager manager = new Manager("John", 5000.0);
	        double managerSalary = manager.calculateSalary();
	        System.out.println("Manager Salary: " + managerSalary);
	        
	        Developer developer = new Developer("Jane", 25.0, 160);
	        double developerSalary = developer.calculateSalary();
	        System.out.println("Developer Salary: " + developerSalary);
	    }
	}
