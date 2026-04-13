package Assignments;

public class DailyAssignments_Program10_1_4_2026 {

	// Program 1-Star Pattern Pyramid number
	static void printNumberPyramid(int n) {

		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n - i; j++) {
				System.out.print(" ");
			}
			for (int k = 1; k <= i; k++) {
				System.out.print(k);

			}
			for (int j = i - 1; j >= 1; j--) {
				System.out.print(j);
			}

			System.out.println(" ");
		}
	}

	// Program 2- perfect number

	static void printDiamond(int n) {
		

		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <=5-i; j++) {
				System.out.print(" ");
			}
			for (int k = 1; k <= 2*i-1; k++) {
				System.out.print("*");

			}
			System.out.println();
		}
		for (int i = 1; i <=4; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(" ");
			}
			
			for (int k = 1; k<=9-2*i; k++) {
				System.out.print("*");

			}
			System.out.println();
		}
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printNumberPyramid(5);
		printDiamond(5);
	}

}
