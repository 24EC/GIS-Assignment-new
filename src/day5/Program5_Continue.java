package day5;

public class Program5_Continue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		System.out.println("hello");
//		for (int i=1; i<=10; i++) {
//			if(i==5) {
//				continue;
//			}
//			System.out.print(i + " ");
//		}
//		System.out.println("\nbye");
		
		
		System.out.println("hello");
		int i=0;
		while (i<=10) {
			
			if(i==5) {
				continue;
			}i++;
			
			System.out.print(i + " ");
		}
		System.out.println("\nbye");
	}
	

}
