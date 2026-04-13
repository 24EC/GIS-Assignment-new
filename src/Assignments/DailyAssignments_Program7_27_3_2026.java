package Assignments;


public class DailyAssignments_Program7_27_3_2026 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// A number that can be divided exactly only by itself and 1 is Prime Number
		
		boolean isPrime = true;
		int num = 21;
		 
      
            for (int i = 2; i <=num/2; i++) 
            {
            	//System.out.println(i);
            	if(num%i==0)
            	{
                    isPrime = false;
                    break;
                }
            }
            if(isPrime)
            	System.out.println(num +"  Prime");
            else
            	System.out.println(num + " Not Prime");
          
	}

}
