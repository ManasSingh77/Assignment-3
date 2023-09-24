package Assignment3;
import java.util.Scanner;
public class permutation {

	public static void main(String[] args) {
		        Scanner scanner = new Scanner(System.in);
		        int T = scanner.nextInt();
		        scanner.nextLine();
		        
		        for (int t = 0; t < T; t++) {
		            int N = scanner.nextInt();
		            int[] Arr = new int[N];
		            
		            for (int i = 0; i < N; i++) {
		                Arr[i] = scanner.nextInt();
		            }
		            
		            int i = N - 2;
		            while (i >= 0 && Arr[i] >= Arr[i + 1]) {
		                i--;
		            }
		            
		            if (i >= 0) {
		                int j = N - 1;
		                while (Arr[j] <= Arr[i]) {
		                    j--;
		                }
		                int temp = Arr[i];
		                Arr[i] = Arr[j];
		                Arr[j] = temp;
		                
		                int left = i + 1;
		                int right = N - 1;
		                while (left < right) {
		                    temp = Arr[left];
		                    Arr[left] = Arr[right];
		                    Arr[right] = temp;
		                    left++;
		                    right--;
		                }
		            }
		            
		            for (int k = 0; k < N; k++) {
		                System.out.print(Arr[k] + " ");
		            }
		            System.out.println();
		        }
		    }

}
