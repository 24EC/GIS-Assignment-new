package WeeklyAssignment;

public class WeeklyAssignments_Progarm1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Problem Statement:1
		float marks = 87.6f;
		//upcasting   
		double dmarks = marks;
		//downcasting
		int imarks = (int)marks;
		//(ASCII conversion)
		char cmarks= (char)marks;
		

		System.out.println("Float value: "+ marks);
		System.out.println("Double value: "+ dmarks);	
		System.out.println("Integer value: "+ imarks);
	    System.out.println("Character value: "+ cmarks);
	    System.out.println("ðŸ‘‰ ASCII 97 = "+ "'" + cmarks+ "'");
	    
	    //// Problem Statement:2 ASCII Explorer
	    
	  
	    char input ='A';
	    int value2 = (int)input;
	    System.out.println("ASCII value "+ value2);
	    int newASCII = input+5;
	    char newChar = (char)newASCII;
	    
	    System.out.println("New ASCII value: "+ newASCII );
	    System.out.println("New character: "+ newChar );
	    
	    
		
	}

}
