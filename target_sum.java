package Assignment3;
import java.util.Scanner;
public class target_sum {

	public static void main(String[] args) {
		  Scanner sc=new Scanner(System.in);
		    int a=sc.nextInt();
		    int [] b=new int[a];
		    for(int i=0;i<a;i++){
		      b[i]=sc.nextInt(); 
		    }
		    for(int j=0;j<a-1;j++){
		    for(int i=0;i<a-1;i++){
		      if(b[i+1]<b[i]){
		        int temp= b[i+1];
		        b[i+1]=b[i];
		        b[i]=temp;
		      }
		    }
		    }
		    int c=sc.nextInt();
		    for(int i=0;i<a;i++){
		      for(int j=i;j<a;j++){
		        if(b[j]+b[i]==c){         
		        	System.out.println(b[i]+"and"+b[j]);
		        }
		      }
		    }
		  }
		}
