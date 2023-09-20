import java.util.*;
public class Main {
    public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int[] b=new int[a];
		for(int i=0;i<a;i++){
			b[i]=sc.nextInt();
			int sum=0;
			int mult=1;
			while(b[i]>0){
				int rem=b[i]%10;
				sum=sum+mult*rem;
				b[i]=b[i]/10;
				mult=mult*2;
			}
			System.out.println(sum);

		}
    }
}