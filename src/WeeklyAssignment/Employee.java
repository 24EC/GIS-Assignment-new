package WeeklyAssignment;

public class Employee {
	 
	int id; 
	String department;
	String name;
	double	salary;
	
	Employee(){
		this.name = "Unknown";
        this.id = 0;
        this.department = "Not Assigned";
        
		System.out.println("This is constructor ");
	}
	
	 public Employee(String name, int id, String department) {
	        this.name = name;
	        this.id = id;
	        this.department = department;
	        System.out.println("This is parameterized constructor ");
	    	
	    }
	
	 public Employee(String name, int id) {
	        this.name = name;
	        this.id = id;
	        this.department = "General";
	    }
	 
	
	Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
        System.out.println("This is parameterized constructor ");
    	
    }
	
	void displayDetails() {
        System.out.println("Name: " + name + ", Salary: $" + salary);
    }
	
	public void displayInfo() {
        System.out.println(getName() + ", " + getId() + ", " + getDepartment());
    }

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	
	
}
