package day5;

public class Program10_Swap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num1=10, num2=20;
		int temp=0;
		
		temp = num1;
		num1 = num2;
		num2 = temp;
		
		System.out.println("num1: "+num1);
		System.out.println("num2: "+num2);
		
		
		num1 = num1+num2;
		num2 = num1-num2;
		num1 = num1 -num2	;
		
		System.out.println("num1: "+num1);
		System.out.println("num2: "+num2);
	}

}
