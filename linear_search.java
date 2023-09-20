import java.util.*;
public class Main {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int  []lsearch=new int[a];
		for(int i=0;i<a;i++){
			lsearch[i]=sc.nextInt();
		}
		int b=sc.nextInt();
		int count=0;
		for(int i=0;i<a;i++){
			if(b==lsearch[i]){
				System.out.println(i);
				count=count+1;
				break;
			}
		}
		if(count==0){
			System.out.println("-1");
		}
		}
}