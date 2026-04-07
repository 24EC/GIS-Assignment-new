package day7;

public class Student {
	
	String name;
	int age;
	float yearofExperience;
	void checkExperience() {
		if(yearofExperience>=5)
			System.out.println("Experinced");
		else
			System.out.println("Less Experinced");
	}
	Student(){
		System.out.println("Constructor Called!");
	}
	
	Student(String name1, int age1, float yoe){
		name=name1;
		age=age1;
		yearofExperience=yoe;
		System.out.println("Constructor 2 Called!");
	}
	
	String getName() {
		return name;
	}
	void setName(String name1) {
		name= name1;
	}
	
	int getAge() {
		return age;
	}
	void setAge(int age1) {
		age= age1;
	}
	float getYearofExperience() {
		return yearofExperience;
	}
	void setYearofExperience(float yearofExperience1) {
		yearofExperience= yearofExperience1;
	}
}