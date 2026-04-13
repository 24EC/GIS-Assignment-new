package Assignments;

public class DailyAssignments_Program8_30_3_2026 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Program 1-factorial number
		// the product of all positive integers less than or equal to number)
		
		int num = 5;
        long factorial = 1;
        int i = 1;
        
        while (i <= num) {
            factorial *= i;
            i++;
        }
        System.out.println("Factorial: " + factorial);
    
        
     // Program 2- perfect number
     //a positive integer that is equal to the sum of its proper divisors (excluding itself)
        int value = 10;
        int sum=0;
        
        for (int j=1; j<value-1; j++)
        {
        	if(value%j==0) 
             sum = sum+j;
          
        }
        if(value==sum)
        	System.out.println( sum+ ": Perfect Number");
        else
        	System.out.println( sum+ ": Not Perfect Number");
	}
	

}
