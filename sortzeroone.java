import java.util.*;
public class Main {
    public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int[] b=new int[a];
		for(int i=0;i<a;i++){
			b[i]=sc.nextInt();
		}
		for(int j=0;j<a-1;j++){
			for(int i=0;i<a-1;i++){
				if(b[i+1]<b[i]){
					int temp=b[i+1];
					b[i+1]=b[i];
					b[i]=temp;
				}
			}
		}
		for(int i=0;i<a;i++){
			System.out.print(b[i]+" ");
		}
    }
}