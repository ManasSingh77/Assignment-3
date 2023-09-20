import java.util.*;
public class Main {
    public static void main (String args[]) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        for(int i=1;i<=a;i++){
            int b=sc.nextInt();
            int c=sc.nextInt();
            int f=b/c;
            int d=b%c;
            int e=c*(f+1);
            if((e-b)<d){
            System.out.println(e-b);
            }
            else{
                System.out.println(d);
            }
    }
}
}