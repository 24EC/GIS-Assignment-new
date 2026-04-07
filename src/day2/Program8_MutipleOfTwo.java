package day2;

public class Program8_MutipleOfTwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num =5;
		if(num%2==0 && num%10!=0) {
			System.out.println("Mutiple Of 2");
		}
		else if (num%10==0)
			System.out.println("Mutiple Of 10");
		else
			System.out.println("Not Mutiple Of 2");
		
	}

}
