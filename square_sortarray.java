import java.util.*;
public class Main {
    public static void main (String args[]) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int []square=new int[a];
        int[]b=new int[a];
        for(int i=0;i<a;i++){
            square[i]=sc.nextInt();
            b[i]=(square[i])*(square[i]);
        }
        for(int m=0;m<a-1;m++){
            for(int i=0;i<a-1;i++){
                if(b[i+1]<b[i]){
                    int temp=b[i+1];
                    b[i+1]=b[i];
                    b[i]=temp;
                }
            }
        }
        for(int j=0;j<a;j++){
            System.out.print(b[j]+" ");
        }
        }
    }