package Assignments;

public class SeniorDeveloper extends Developer{
	int experience; 

	public SeniorDeveloper(String name, double salary, String programmingLanguage, int experience) {
        super(name, salary, programmingLanguage);
        this.experience = experience;
    }

	 
	@Override
    void displayDetails() {
        System.out.println("Senior Developer Name: " + name + ", Salary: $" + salary + 
                           ", Language: " + programmingLanguage + ", Experience: " + experience + " years");
    }
}
