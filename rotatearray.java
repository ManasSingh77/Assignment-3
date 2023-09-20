package Assignment3;

public class rotatearray {

	public static void main(String[] args) {
		
		int[]arr= {1,2,3,4,5,6,7};
		int k=3;	
	}
	public static void Rotate(int []arr,int k) {
//		 k=k%arr.length;
		 int item=arr[arr.length-1];
		 for(int i=arr.length-2;i>=0;i--) {
			 arr[i+1]=arr[i];
		 }
		arr[0]=item;
	}
	for(int i=0;i<arr.length;i++) {
		System.out.print(arr[i]);
	}

}
