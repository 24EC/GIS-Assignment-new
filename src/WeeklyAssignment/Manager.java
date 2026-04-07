package WeeklyAssignment;


class Manager extends Employee {
	double bonus;

	Manager(String name, double salary, double bonus) {
        super(name, salary);
        this.bonus = bonus;
    }
	
	@Override
    void displayDetails() {
        System.out.println("Manager - Name: " + name + ", Salary: $" + salary + ", Bonus: $" + bonus);
    }

}
