package day4;

public class Program4_Countdigit {
	public static void main(String[] args) {
	int num =85873;
	int count= 0;
	
	while(num>0) {
		num= num/10;
		count++;
	}
	System.out.println(count);
	
	}

}
