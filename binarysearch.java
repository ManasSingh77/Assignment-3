import java.util.*;
public class Main {
    public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int[]b=new int[a];
		for(int i=0;i<a;i++){
			b[i]=sc.nextInt();
		}
		int c=sc.nextInt();
		int count=0;
		for(int i=0;i<a;i++){
			if(c==b[i]){
				System.out.print(i);
				count=count+1;
			}
		}
		if(count==0){
			System.out.print("-1");
		}
		
    }
}