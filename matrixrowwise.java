import java.util.*;
public class Main {
    public static void main(String args[]) {
        Scanner sc=new  Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int[][]c=new int[a][b];
		for(int i=0;i<a;i++){
			for(int j=0;j<b;j++){
				c[i][j]=sc.nextInt();
			}
		}
		for(int i=0;i<a;i++){
			if(i%2==0){
				for(int j=0;j<b;j++){
				System.out.print(c[i][j]+", ");
			}
			}
			else{
				for(int j=b-1;j>=0;j--){
					System.out.print(c[i][j]+", ");
				}
			}
		}
		System.out.print("END");
		}
		
		   }