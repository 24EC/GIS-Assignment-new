package WeeklyAssignment;



public class WeeklyAssignments_Progarm3 {

	// Progarm 1: Second Smallest Element

	public static int SecondSmallest(int[] num) {
		int min = num[0];
		int smallest2 = num[0];
		for (int i = 1; i < num.length; i++) {
			if (num[i] < min) {
				smallest2 = min;
				min = num[i];

			}

		}
		System.out.println("Smallest: " + min);
		System.out.println("Second Smallest: " + smallest2);
		return smallest2;
	}

	// Program 2: Array is Sorted
	 
	public static boolean isSorted(int[] num, int n) {
		
		for (int i = 0; i < num.length - 1; i++) {
			
			if (num[i] > num[i + 1]) {
				return false;

			}
		}
		return true;
		
	}
	
	// Program 3: Move All Zeros to End
	 
	public static void moveZerosToEnd(int[] arr, int n) {
	    int count = 0;
	    for (int i = 0; i < arr.length; i++) {
	        if (arr[i] != 0) {
	            int temp = arr[count];
	            arr[count] = arr[i];
	            arr[i] = temp;
	            count++;
	        }
	    }
	}
	// print the array elements
	public static void printArray(int arr[], int n) {
	    for (int i = 0; i < n; i++)
	    System.out.print(arr[i] + " ");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] num = {4, 2, 7, 2, 9, 1};
		int n1 = num.length;
		SecondSmallest(num);
		boolean result = isSorted(num, n1);
	    System.out.println("Is sorted " + result);
	    printArray(num, n1);
	    int [] arr= {1, 0, 3, 0, 5};
	    int n = arr.length;
	    System.out.print("\nOriginal array: ");
	    printArray(arr, n);
	    moveZerosToEnd(arr, n);
	    System.out.print("\nModified array: " ); 
	    printArray(arr, n);
	    
	}

}
