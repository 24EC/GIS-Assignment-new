package WeeklyAssignment;

public class WeeklyAssignments_Progarm2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Progarm 1: Fibonacci series with Condition

		int num = 100;
		int sum1=0;
		int sum2=1;

		System.out.print(sum1+ " "+sum2+" ");
		for(int i=1; i<=num; ++i)
		{
		    int sumN = sum1 + sum2;
		    if (sumN > 100) {
                System.out.println("\nStopping: " + sumN + " is greater than 100.");
                break;
            }
		    System.out.print(sumN+ " ");
		    sum1=sum2;
		    sum2=sumN;
		}


		//Program 2: Prime Factors of a Number
		int n  =60;  boolean isprime=true;
		System.out.print("Prime factors: 2 ");
		while (n % 2 == 0 ) {
            n= n/2;
        }
		for (int i = 3; i <= Math.sqrt(n); i += 2) {
            while (n % i == 0) {
                System.out.print(i + " ");
                n /= i;
            }
        }
		if (n > 2)
            System.out.println(n);


		//Program 3: Digit Transformation Logic (Advanced)


		        int numnber = 57243;
		        int temp = numnber;
		        int position = 1;
		        int result = 0;
		        int placeValue = 1;

		        while (temp > 0) {
		            int lastDigit = temp % 10;


		            if (position % 2 == 1) {
		                if (lastDigit <= 4) {
		                	lastDigit = lastDigit * 2;
		                }

		            } else {
		            	lastDigit = 1;
		            }


		            result = result + lastDigit * placeValue;


		            temp = temp / 10;
		            position++;
		            placeValue = placeValue * 10;
		        }

		        System.out.println("Digit Transformation Input: " + numnber);
		        System.out.println("Digit Transformation Output: " + result);

		        StringBuilder sb = new StringBuilder(result);
		        sb.reverse();




	}

}
