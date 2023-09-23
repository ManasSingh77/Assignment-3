package Assignment3;
import java.util.Scanner;
public class triangularmatrix {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int c=sc.nextInt();
		int[][]b=new int[a][c];
		for(int i=0;i<a;i++) {
			for(int j=0;j<c;j++) {
			b[i][j]=sc.nextInt();	
			}
	}
		int[][]upper=new int[a][c];
		int[][]lower=new int[a][c];
		
		for(int i=0;i<a;i++) {
			for(int j=0;j<c;j++) {
			upper[i][j]=b[i][j];
			lower[i][j]=b[i][j];	
			}
	}
		for(int i=0;i<a;i++) {
			for(int j=0;j<i;j++) {
				upper[i][j]=0;
			}
		}
		for(int i=0;i<a;i++) {
			for(int j=a-1;j>i;j--) {
				lower[i][j]=0;
			}
		}
		for(int i=0;i<a;i++) {
			for(int j=0;j<c;j++) {
				System.out.print(upper[i][j]+" ");
			}
			System.out.println();
	}	
		for(int i=0;i<a;i++) {
			for(int j=0;j<c;j++) {
				System.out.print(lower[i][j]+" ");
			}
			System.out.println();
	}	
		
}
}