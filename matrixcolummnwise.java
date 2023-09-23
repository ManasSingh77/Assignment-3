import java.util.*;
public class Main {
    public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int[][]c=new int[a][b];
		for(int i=0;i<a;i++){
			for(int j=0;j<b;j++){
				c[i][j]=sc.nextInt();
			}
		}
		for(int j=0;j<b;j++){
			if(j%2==0){
				for(int i=0;i<a;i++){
					System.out.print(c[i][j]+", ");
				}
			}
			else{
				for(int i=a-1;i>=0;i--){
					System.out.print(c[i][j]+", ");
				}
			}
		}
		System.out.print("END");
    }
}