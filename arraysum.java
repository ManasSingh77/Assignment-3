package Assignment3;
import java.util.Scanner;
public class arraysum {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int[]b=new int[a];
		for(int i=0;i<a;i++) {
			b[i]=sc.nextInt();
	}
		for(int i=a-1;i>=0;i--) {
			int sum=0;
			for(int j=0;j<=i;j++) {
				sum+=b[j];
			}
			b[i]=sum;
		}
		for(int i=0;i<a;i++) {
			System.out.print(b[i]+" ");
		}
}
}