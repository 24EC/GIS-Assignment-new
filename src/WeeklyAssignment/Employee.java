package WeeklyAssignment;

public class Employee {
	
	int id;
	String name;
	double basicSalary;

	public Employee() {
		System.out.println("This is Person constructor ");
	}
	
	public Employee(int id, String name, double basicSalary) {
		this.id=id;
		this.name=name;
		this.basicSalary=basicSalary;
		
		//System.out.println("This is Person constructor ");
	}
	
	public double calculateSalary() {
		double  hra  = 0.20 * basicSalary;
		double  bonus = 0.10 * basicSalary; 
		return  this.basicSalary + hra  + bonus; 

	}
	
	public void display() {
		System.out.println("Employee ID: " + this.id);
        System.out.println("Employee Name: " + this.name);
        System.out.println("Basic Salary: " + this.basicSalary);
        System.out.println("Total Salary: " + this.calculateSalary());
	}

	
}
