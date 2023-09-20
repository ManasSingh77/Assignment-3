package Assignment3;
import java.util.Scanner;
public class questions {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int[] b=new int[3];
		int counter=0;
		for(int i=0;i<a;i++) {
			int count=0;
			for(int j=0;j<3;j++) {
				b[i]=sc.nextInt();
				if(b[i]==1) {
					count=count+1;
				}
			}
			if(count>=2) {
				counter=counter+1;
			}
		}
		System.out.println(counter);
	}

}
