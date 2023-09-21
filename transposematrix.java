package Assignment3;
import java.util.Scanner;
public class transposematrix {

	public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			int a=sc.nextInt();
			int[][]b=new int[a][a];
			for(int i=0;i<a;i++) {
				for(int j=0;j<a;j++) {
				b[i][j]=sc.nextInt();	
				}
			}
			int[][]c=new int[a][a];
			for(int i=0;i<a;i++) {
				for(int j=0;j<a;j++) {
					c[j][i]=b[i][j];
				}
			}
			for(int i=0;i<a;i++) {
				for(int j=0;j<a;j++) {
					System.out.print(c[i][j]+" ");
				}
				System.out.println();
			}
	}

}
