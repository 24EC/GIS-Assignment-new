package Assignments;

public class DailyAssignments_Program11_2_4_2026_AreaCalculator {

	static double Circle(double radius) {
		  return Math.PI * radius * radius;
	}

	static int Rectangle(int length, int breadth) {
		return length * breadth;
	}

	static int Square(int side) {
		return side * side;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Circle Area: " + Circle(5.0));
		System.out.println("Rectangle Area: " + Rectangle(10, 5));
		System.out.println("Square Area: " + Square(4));
		
	}

}
