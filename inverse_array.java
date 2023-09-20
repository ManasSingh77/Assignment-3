import java.util.*;
public class Main {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
		int dhoni=sc.nextInt();
		int []b=new int[dhoni];
		int []reverse=new int[dhoni];
		for(int i=0;i<dhoni;i++){
			b[i]=sc.nextInt();
		}
		for(int i=0;i<dhoni;i++){
			int d=b[i];
			reverse[d]=i;
		}
		for(int i=0;i<dhoni;i++){
			System.out.print(reverse[i]+" ");
		}
    }
}