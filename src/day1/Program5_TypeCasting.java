package day1;

public class Program5_TypeCasting {
	public static void main(String[] args) {
		
		//upcasting or implicit type conversion
         int age = 32;
         float fage =age;
		 System.out.println(fage);
		 
		 int num = 100000000;
         long Lage =num;
		 System.out.println(Lage);
		 
		//downcasting or explicit type conversion
		 float sum =153.6f;
		 int heightsum= (int)sum;
		 System.out.println(heightsum); 
		 
		 long num2 = 1000000008999l;
         int Lnum =(int)num2;
		 System.out.println(Lnum);
		
	
}

}
