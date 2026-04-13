package WeeklyAssignment;
import WeeklyAssignment.Employee;
import WeeklyAssignment.Person;
public class Main2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		Student student = new Student("John Doe", 20, 95);
		System.out.println("Problem Statement 1: Java Assignment – this + Inheritance + Constructors (Beginner Level)");
        student.display();
        
        Employee emp = new Employee(101, "John Doe", 50000.0);
        System.out.println("Problem Statement 2: Salary Calculation using this Keyword");
        emp.display();
	}

}
