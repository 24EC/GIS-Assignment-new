package Assignments;

public class DailyAssignments_Program4_24_3_2026 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int subject1 = 38;
		int subject2 = 39;
		int subject3 = 43;
		int subject4 = 34;
		int subject5 = 35;
		
		
	   //Marks of 5 subjects (out of 100 each) Pass/fail

		if(subject1<33 || subject2<33 || subject3<33 || subject4<33 || subject5<33) 
			System.out.println("Fail");
		else 
			System.out.println("Pass");
		
		//Calculate percentage and print percentage
			
		float total = subject1+subject2+subject3+subject4+subject5;
		float Percentage = (total / 500) * 100;
		 System.out.println("Total Marks =  " + total);
		 System.out.println("Marks Percentage =  " + Percentage);
		
		if(Percentage >= 90)
	    {
			System.out.println("Grade A+");
		}
		else if(Percentage >= 75 && Percentage <= 89)
	    {
			System.out.println("Grade B");
		}
		else if(Percentage >= 60 && Percentage <= 74)
	    {
			System.out.println("Grade C");
		}
		else if(Percentage >= 50 && Percentage <= 59)
	    {
			System.out.println("Grade D");
		}
		else if(Percentage >= 33 && Percentage <= 49)
	    {
			System.out.println("Grade E");
		}
		else 
	    {
			System.out.println("Grade F");
		} 
		
	}

}
