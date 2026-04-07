package day5;

public class Program4_Break_While {
	public static void main(String[] args) {
		
		System.out.println("hello");
		int i=1;
		while(i<=10) {
			System.out.print(i + " ");
			if(i==5)
				break;// Terminates the loop immediately
		       // System.out.print(i + " ");
			 i++;
		}
		System.out.println("\nBye");
		
	}

}
