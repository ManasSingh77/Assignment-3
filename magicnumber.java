package Assignment3;
import java.util.Scanner;
public class magicnumber {
	public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        int m = sc.nextInt();
	        int n = sc.nextInt();
	        int[][] matrix = new int[m][n];
	        for (int p = 0; p < m; p++) {
	            for (int j = 0; j < n; j++) {
	                matrix[p][j] = sc.nextInt();
	            }
	        }

	        // Find lucky numbers
	        for (int i = 0; i < m; i++) {
	            int minInRow = matrix[i][0];
	            int colIndex = 0;

	            // Find minimum in row
	            for (int j = 1; j < n; j++) {
	                if (matrix[i][j] < minInRow) {
	                    minInRow = matrix[i][j];
	                    colIndex = j;
	                }
	            }

	            // Check if it's maximum in its column
	            boolean isMaxInCol = true;
	            for (int k = 0; k < m; k++) {
	                if (matrix[k][colIndex] > minInRow) {
	                    isMaxInCol = false;
	                    break;
	                }
	            }

	            // If it's a lucky number, print it
	            if (isMaxInCol) {
	                System.out.print(minInRow + " ");
	            }
	        }
}
}
