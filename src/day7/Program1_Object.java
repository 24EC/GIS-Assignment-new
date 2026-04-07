package day7;

public class Program1_Object {
	public static void main(String[] args) {

		Student s1 = new Student();
		s1.name = "Jyoti";
		s1.age = 30;
		s1.yearofExperience = 7;
		s1.checkExperience();
		System.out.println(s1.name + ":" + s1.age + ":" + s1.yearofExperience + ":");
		Student s2 = new Student("Ajitesh",33, 10);
		System.out.println(s2.name + ":" + s2.age + ":" + s2.yearofExperience + ":");
		
		Student s3 = new Student();
		s3.setName("Kirti");
		System.out.println(s3.getName());
		s3.setAge(24);
		System.out.println(s3.getAge());
		s3.setYearofExperience(4);
		System.out.println(s3.getYearofExperience());
		
		
	}
}
