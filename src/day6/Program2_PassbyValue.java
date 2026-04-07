package day6;

public class Program2_PassbyValue {

	
	static void  incByFive(int num) {
		num=num+5;
	    System.out.println("Inside method; "+num);
	}
	
	static void  incByTwo(int[] num) {
		num[0]=num[0]+2;
		System.out.println("Inside method; "+num[0]);
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=10;
		int[] data= {10,20};
		incByFive(num);
		System.out.println("New Value of num; "+num);
		incByTwo(data);
		System.out.println("New Value of num; "+data[0]);
	}

}
