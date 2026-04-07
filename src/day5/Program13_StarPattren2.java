package day5;

public class Program13_StarPattren2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		for(int i=0; i<5; i++)
		{
			for(int j=0; j<=5-i; j++) 
			{
				System.out.print(" ");
			}
				for(int k=0; k<=i; k++) 
				{
				System.out.print("* ");
			    }
			
		   
			System.out.println("");
		}
		
		
		
		for(int i=5;i>=1;i--) 
		{

			 for (int j = 1; j <= 5 - i; j++) 
			 {
				 System.out.print(" ");
		     }

				for(int k=1;k<=i;k++) 
				{

					System.out.print(k);

				}

	               System.out.println("");
	      }
		
		
		for(int i=1;i>=5;i++) 
		{ 
			for (int j = 1; j <= 6-i; j++) 
			 {
				 System.out.print("*");
			 }
	         System.out.println("");
	     }

		
		
	}

}
