package Assignment3;
import java.util.Scanner;
public class searchmatrix {

	public static void main(String[] args) {
		Scanner sc=	new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int[][]c=new int[a][b];
		for(int i=0;i<a;i++) {
			for(int j=0;j<b;j++) {
				c[i][j]=sc.nextInt();
			}
		}
		int count=0;
		int d=sc.nextInt();
		for(int i=0;i<a;i++) {
			for(int j=0;j<b;j++) {
				if(c[i][j]==d) {
					count=count+1;
				}
				}
			}
		if(count!=0) {
			System.out.println("1");
		}
		else {
			System.out.println("0");
		}
	}

}
