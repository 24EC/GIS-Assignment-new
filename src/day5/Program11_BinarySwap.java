package day5;

public class Program11_BinarySwap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1=3;
		int num2=5;

		num1 = num1^num2;
		num2 = num1^num2;
		num1 = num1^num2;
		
		System.out.println("num1: "+num1);
		System.out.println("num2: "+num2);
	}

}
