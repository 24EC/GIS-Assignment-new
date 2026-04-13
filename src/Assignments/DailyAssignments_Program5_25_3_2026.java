package Assignments;

public class DailyAssignments_Program5_25_3_2026 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int num = 1;
		while(num<=50) {

			//System.out.println("2 * "+num +"=" +(2*num));
			if(num%2==0 && num%5==0) {
				System.out.println(num*num);
			}
			else if(num%2==0) {
				System.out.println(num*num*num);
				}
			else if(num%5==0) {
				System.out.println(num*5);
				}
			else {
				System.out.println(num);
			}
			
			num++;
		
	}
	}
}
