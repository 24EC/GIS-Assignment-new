package day4;

public class Program5_Reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num =10101;
		int originalnum= num;
		int reverse=0;
		
		
		while(num>0) {
			int lastDigit = num%10;
			reverse = reverse *10 + lastDigit;
			num= num/10;
			
		}
		  System.out.println(reverse);
		  
		  if(reverse==originalnum)
			  System.out.println("Palidrome");
		  else
			  System.out.println("not palidrome");
		}
	

}
