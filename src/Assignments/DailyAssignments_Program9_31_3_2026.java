package Assignments;


public class DailyAssignments_Program9_31_3_2026 {
	
	public static void main(String[] args) {
	
	
    int[][] matrixA ={{1,2,3,4},{5,6,7,8}, {9,1,2,3}};
    int[][] matrixB ={{4,3,2,1},{8,7,6,5}, {3,2,1,0}};
    
    int rows = matrixA.length;
    int cols = matrixA[0].length;
    
    
    int[][] sum = new int[rows][cols];
    int maxElement = Integer.MIN_VALUE;
    	for (int i = 0; i < rows; i++) 
    	{
            for (int j = 0; j < cols; j++) 
            {
                sum[i][j] = matrixA[i][j] + matrixB[i][j];
                System.out.print(sum[i][j] + " ");
                if (sum[i][j] > maxElement) {
                    maxElement = sum[i][j];
                
            }
    	}
            System.out.println();
    
        }
    	System.out.println("Maximum element: " + maxElement);
        
	}
	

}
