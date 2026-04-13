package Assignments;

public class DailyAssignments_Program6_26_3_2026 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//A number that equals the sum of its own digits, each raised to the power of the total number of digit
   
		
		int num =124;
		int originalnum=num;
		int cubesum=0;
		
		
		while(num>0) {
			int lastDigit = num%10;
			cubesum = cubesum+(lastDigit*lastDigit*lastDigit);   
			num=num/10;	
		}
		if (cubesum==originalnum) {
			 System.out.println(num +" is Armstrong number");
		}
		else{
		     System.out.println(num +" is not Armstrong number");
			
		}
	   
	}

}
