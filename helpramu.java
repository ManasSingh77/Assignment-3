import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        for (int test = 0; test < t; test++) {
            int c1 = sc.nextInt();
            int c2 = sc.nextInt();
            int c3 = sc.nextInt();
            int c4 = sc.nextInt();
            
            int n = sc.nextInt();
            int m = sc.nextInt();
            
            int[] rickshaws = new int[n];
            int[] cabs = new int[m];
            
            for (int i = 0; i < n; i++) {
                rickshaws[i] = sc.nextInt();
            }
            
            for (int i = 0; i < m; i++) {
                cabs[i] = sc.nextInt();
            }
            
            int totalRickshawCost = 0;
            int totalCabCost = 0;
            
            for (int i = 0; i < n; i++) {
                totalRickshawCost += Math.min(rickshaws[i] * c1, c2);
            }
            
            for (int i = 0; i < m; i++) {
                totalCabCost += Math.min(cabs[i] * c1, c2);
            }
            
            int minCost = Math.min(totalRickshawCost + totalCabCost, c3);
            int finalCost = Math.min(minCost, c4);
            
            System.out.println(finalCost);
        }
        
        sc.close();
    }
}
