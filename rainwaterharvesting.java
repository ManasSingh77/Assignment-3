package Assignment3;
import java.util.Scanner;
public class rainwaterharvesting {

	public static void main(String[] args) {
		        Scanner scanner = new Scanner(System.in);
		        int T = scanner.nextInt();
		        scanner.nextLine();

		        for (int t = 0; t < T; t++) {
		            int N = scanner.nextInt();
		            int[] heights = new int[N];

		            for (int i = 0; i < N; i++) {
		                heights[i] = scanner.nextInt();
		            }

		            int[] leftMax = new int[N];
		            int[] rightMax = new int[N];

		            leftMax[0] = heights[0];
		            for (int i = 1; i < N; i++) {
		                leftMax[i] = Math.max(leftMax[i - 1], heights[i]);
		            }

		            rightMax[N - 1] = heights[N - 1];
		            for (int i = N - 2; i >= 0; i--) {
		                rightMax[i] = Math.max(rightMax[i + 1], heights[i]);
		            }

		            int waterCollected = 0;
		            for (int i = 0; i < N; i++) {
		                waterCollected += Math.min(leftMax[i], rightMax[i]) - heights[i];
		            }

		            System.out.println(waterCollected);
		        }
		    }
		}


	
