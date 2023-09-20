package Assignment3;
import java.util.Scanner;
public class sortinglineartime {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int[] b=new int[a];
		int zero_count=0;
		int one_count=0;
		int two_count=0;
		for(int i=0;i<a;i++) {
			b[i]=sc.nextInt();
			if(b[i]==0) {
				zero_count+=1;
				}
			if(b[i]==1) {
				one_count+=1;
				}
			if(b[i]==0) {
				two_count+=1;
				}
			
			}
		for(int i=0;i<zero_count;i++) {
			System.out.print("0"+" ");
		}
		for(int i=0;i<one_count;i++) {
			System.out.print("1"+" ");
		}
		for(int i=0;i<two_count;i++) {
			System.out.print("2"+" ");
		}

	}

}
