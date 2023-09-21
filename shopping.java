import java.util.*;
public class Main {
    public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int[]b=new int[a];
		int[]c=new int[2];
		for(int i=0;i<a;i++){
			b[i]=sc.nextInt();
		}
		int d=sc.nextInt();
		for(int j=0;j<d;j++){
		for(int i=0;i<2;i++){
			c[i]=sc.nextInt();
		}
			int count=0;
			for(int m=0;m<a;m++){
				if(c[0]%b[m]==0){
					count=count+1;
				}
			}
			if(count>=c[1]){
				System.out.println("Yes");
			}
			else{
				System.out.println("No");
			}
		
		}
    }
}