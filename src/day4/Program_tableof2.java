package day4;

public class Program_tableof2 {

	public static void main(String[] args) {
int num =1;
	
	while(num>=10) {

		System.out.println("2 * "+num +"=" +(2*num));
		if(num%3==0) {
			System.out.println("Hello");
		}
		else if(num%10==0) {
			
		System.out.println("Bye");}
		
		num++;
	}

	
	}
}
