package day5;

public class Program2_Factors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num = 20;
		
		for(int fact=1; fact<=num; fact++) {
			if(fact==num) {
				System.out.println(fact);
			}
			else if(num%fact==0) {
				System.out.println(fact + ",");
			}

		}
		
	}

}
