package Assignments;

public class Main1 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Employee emp1 = new Employee();
		Employee emp2 = new Employee("Priya", 101, "HR");
		Employee emp3 = new Employee("Rahul", 102);
		
		System.out.print("Employee 1: ");
		emp1.displayInfo();
		System.out.print("Employee 2: ");
		emp2.displayInfo();
		System.out.print("Employee 3: ");
		emp3.displayInfo();
		

		emp1.setName("Anjali");
        emp1.setId(103);
        emp1.setDepartment("Finance");

        System.out.println("Updated Employee 1: " + emp1.getName() + ", " + emp1.getId() + ", " + emp1.getDepartment());
        
		Manager m = new Manager("Alice", 9000000, 15000);
		Developer d = new Developer("Bob", 800000, "Java");
		SeniorDeveloper sd = new SeniorDeveloper("Charlie", 12000000, "Python", 10);

		m.displayDetails();
		d.displayDetails();
		sd.displayDetails();
	}

}
