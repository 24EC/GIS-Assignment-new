package WeeklyAssignment;

public class Developer extends Employee {

	String programmingLanguage;
	
	public Developer(String name, double salary, String programmingLanguage) {
		super(name, salary);
		this.programmingLanguage=programmingLanguage;
	}
	
	@Override
    void displayDetails() {
        System.out.println("Developer Name: " + name + ", Salary: $" + salary + ", Language: " + programmingLanguage);
    }

}
