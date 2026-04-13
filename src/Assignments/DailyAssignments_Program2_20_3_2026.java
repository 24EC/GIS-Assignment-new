package Assignments;

public class DailyAssignments_Program2_20_3_2026 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		float marks = 97.8f;
		//upcasting   
		double dmarks = marks;
		//downcasting
		int imarks = (int)marks;
		//(ASCII conversion)
		char cmarks= (char)marks;
		
		
		System.out.println("Float value: "+ marks);
		System.out.println("Converted to double: "+ dmarks);	
		System.out.println("Converted to int: "+ imarks);
	    System.out.println("Character value: "+ cmarks);
	    System.out.println("ðŸ‘‰ ASCII 97 = "+ "'" + cmarks+ "'");
	}

}
